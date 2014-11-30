package srt.tool;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

import srt.ast.AssertStmt;
import srt.ast.AssignStmt;
import srt.ast.AssumeStmt;
import srt.ast.BlockStmt;
import srt.ast.DeclRef;
import srt.ast.Expr;
import srt.ast.HavocStmt;
import srt.ast.IfStmt;
import srt.ast.IntLiteral;
import srt.ast.Invariant;
import srt.ast.Stmt;
import srt.ast.WhileStmt;
import srt.ast.visitor.impl.DefaultVisitor;
import srt.ast.*;


public class LoopAbstractionVisitor extends DefaultVisitor {

	public LoopAbstractionVisitor() {
		super(true);
	}

	@Override
	public Object visit(WhileStmt whileStmt) {
		List<Stmt> stmts = new LinkedList<Stmt>();
		// get loop components
		List<Invariant> invariants = whileStmt.getInvariantList().getInvariants();
		List<Expr> invariantExprs = new ArrayList<>();
		List<Stmt> AssertStmts = new LinkedList<Stmt>();
		//invariant expression
		for (Invariant invariant : invariants) {
			Expr invariantexpr = invariant.getExpr();
			invariantExprs.add(invariantexpr);
			AssertStmt assertStmt = new AssertStmt(invariantexpr);
			AssertStmts.add(assertStmt);
			stmts.addAll(AssertStmts);
		}
		
		Expr loopCondition = whileStmt.getCondition();
		Stmt loopBody = whileStmt.getBody();
		
		           	
    	Set<DeclRef> modSet = new HashSet<DeclRef>();

    	AssignStmt modAssignStmt = (AssignStmt) loopBody;
    	DeclRef lhs = modAssignStmt.getLhs();
    	modSet.add(lhs);
    	this.visitChildren(modAssignStmt);
    	for (DeclRef var : modSet) {
			stmts.add(new HavocStmt(var));
		}
		
		List<Stmt> AssumeStmts = new LinkedList<Stmt>();
		for (Invariant e : invariants) {
			AssumeStmts.add(new AssumeStmt(e.getExpr()));
		}
		stmts.addAll(AssumeStmts);
		
		// create if then body
		List<Stmt> ifStmtsBody = new LinkedList<Stmt>();
		// visit loop body
		ifStmtsBody.add((Stmt) visit(loopBody));
		
		// insert assert statements to check that loop invariant holds at end of body
		ifStmtsBody.addAll(AssertStmts);
		// insert assume(false) statement to block further loop execution
		ifStmtsBody.add(new AssumeStmt(new IntLiteral(0)));
		
		BlockStmt newIfThenBody = new BlockStmt(ifStmtsBody);
		Stmt ifStmt = new IfStmt(loopCondition, newIfThenBody, null);
		
		stmts.add(ifStmt);
		
		return new BlockStmt(stmts, whileStmt.getNodeInfo());
	}

}