package srt.tool;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack

import srt.ast.*;

public class PredicationVisitor extends DefaultVisitor {

	private String freshVariable;
	private DeclRef parentPredicate;
	private Expr globalPredicate;

	public PredicationVisitor() {
		super(true);
		freshVariable = "$A"
		//initialized to "G" which is true
		globalPredicate = new IntLiteral(1);
		parentPredicate = globalPredicate;
	}
	
	public String generateFreshVariable(){
		StringBuilder variableChars = new StringBuilder(freshVariable);
		char lastChar = variableChars.charAt(variableChars.length()-1);
		if (lastChar == 'Z'){
			variableChars.append('A');
		} else {
			variableChars.setCharAt(variableChars.length()-1, (char) (lastChar+1))
		}
		return variableChars.toString();
	}
	
	public Expr gAndP(){
		return new BinaryExpr(BinaryExpr.LAND, globalPredicate, parentPredicate);
	}
	
	@Override
	public Object visit(IfStmt ifStmt) {
		List<Stmt> stmts = new LinkedList<Stmt>();
		Expr ifExpr = ifStmt.getCondition();
		DeclRef q = new DeclRef(generateFreshVariable());
        DeclRef r = new DeclRef(generateFreshVariable());
        Decl declareQ = new Decl(q.getName(), DEFAULT_VARIABLE_TYPE);
		stmts.add(declareQ);
        Decl declareR = new Decl(r.getName(), DEFAULT_VARIABLE_TYPE);
		stmts.add(declareR);
		qExpression = new BinaryExpr(BinaryExpr.LAND, parentPredicate, ifExpr);
		rExpression = new BinaryExpr(BinaryExpr.LAND, parentPredicate, new UnaryExpr(UnaryExpr.LNOT, ifExpr));
		AssignStmt assignQ = new AssignStmt(q, qExpression);
		stmts.add(assignQ);
        AssignStmt assignR = new AssignStmt(r, rExpression);
		stmts.add(assignR);
		DeclRef tempParentPredicate = parentPredicate;
		parentPredicate = q;
		Stmt thenStmt = (Stmt) visit(ifStmt.getThenStmt());
		stmts.add(thenStmt);
		parentPredicate = r;
		Stmt elseStmt = (Stmt) visit(ifStmt.getElseStmt());
		stmts.add(elseStmt);
		parentPredicate = tempParentPredicate;
				
		return super.visit((new BlockStmt(stmts,ifStmt));
	}

	@Override
	public Object visit(AssertStmt assertStmt) {
		// assert(G && P => E)
		Expr lhs = new UnaryExpr(UnaryExpr.LNOT, gAndP());
		Expr rhs = assertStmt.getCondition();
		return super.visit(new AssertStmt(new BinaryExpr(BinaryExpr.LOR, lhs, rhs), assertStmt));
	}

	@Override
	public Object visit(AssignStmt assignment) {
		// x = (G && P) ? E : x;
		TernaryExpr ternaryExpression = new TernaryExpr(gAndP(), assignment.getRhs(), assignment.getLhs());
		return super.visit(new AssignStmt(assignment.getLhs(), ternaryExpression, assignment));
	}

	@Override
	public Object visit(AssumeStmt assumeStmt) {
		// G = G && (P => E)
		Expr lhs = new UnaryExpr(UnaryExpr.LNOT, gAndP());
		Expr rhs = assumeStmt.getCondition();
		BinaryExpr biExpression = new BinaryExpr(BinaryExpr.LOR, lhs, rhs);
		DeclRef freshVar = new DeclRef(generateFreshVariable());
		Stmt declFreshVar = new Decl(freshVar.getName(), "int");
		AssignStmt assignStatement = new AssignStmt(freshVar, biExpression);
		globalPredicate = new BinaryExpr(BinaryExpr.LAND, globalPredicate, freshVar);
		//not sure do i need an assignstatement statement for newG in Block statement
		return super.visit(new BlockStmt(new Stmt[] {declFreshVar, assignStatement}, assumeStmt));
	}

	@Override
	public Object visit(HavocStmt havocStmt) {
		//v = ((G && P) ? h : v)
		DeclRef v = havocStmt.getVariable();
		DeclRef h = new DeclRef(generateFreshVariable());
		Stmt declH = new Decl(h.getName(), "int");
		TernaryExpr ternaryExpression = new TernaryExpr(gAndP(), h, v)
		Stmt e = new AssignStmt(v, ternaryExpression);
		return super.visit(new BlockStmt(new Stmt[] { declH, e}, havocStmt));
	}

}