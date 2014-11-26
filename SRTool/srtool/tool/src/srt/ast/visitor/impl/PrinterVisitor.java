package srt.ast.visitor.impl;

import srt.ast.*;

/**
 * Visitor that prints out visited Nodes in source code form.
 */
public class PrinterVisitor extends DefaultVisitor {

	private int indent = 0;
	private final String indentStr = "  ";
	
	public PrinterVisitor() {
		super(false);
	}
	
	private String getIndentAsString() {
		StringBuilder indentBuilder = new StringBuilder();
		for(int i=0; i < indent; ++i)
		{
			indentBuilder.append(indentStr);
		}
		return indentBuilder.toString();
	}
	
	@Override
	public String visit(AssertStmt assertStmt) {
		return "assert(" + visit(assertStmt.getCondition()) + ");";
	}

	@Override
	public String visit(AssignStmt assignment) {
		return visit(assignment.getLhs()) + "=" + visit(assignment.getRhs()) + ";";
	}

	@Override
	public Object visit(AssumeStmt assumeStmt) {
		return "assume(" + visit(assumeStmt.getCondition()) + ");";
	}

	@Override
	public String visit(BinaryExpr expr) {
		return "(" + visit(expr.getLhs())
				+ " " + BinaryExpr.getOperatorString(expr.getOperator())
				+ " " + visit(expr.getRhs()) + ")";
	}

	@Override
	public String visit(BlockStmt blockStmt) {
		String res = "{\n";
		indent++;
		res += visit(blockStmt.getStmtList());
		indent--;
		res += getIndentAsString() + "}";
		return res;
	}

	@Override
	public String visit(Decl decl) {
		return decl.getType() + " " + decl.getName() + ";";
	}

	@Override
	public String visit(DeclRef declRef) {
		return declRef.getName();
	}

	@Override
	public Object visit(EmptyStmt emptyStmt) {
		return ";";
	}
	
	@Override
	public Object visit(Invariant invar) {
		throw new IllegalStateException("Should not reach Invariant.");
	}

	@Override
	public String visit(InvariantList exprList) {
		throw new IllegalStateException("Should not reach ExprList.");
	}
	
	@Override
	public String visit(HavocStmt havocStmt) {
		
		return "havoc(" + visit(havocStmt.getVariable()) + ");";
	}

	@Override
	public String visit(IfStmt ifStmt) {
		String res = "if(" + visit(ifStmt.getCondition())
				+ ")";
		res += "\n";
		if( !(ifStmt.getThenStmt() instanceof BlockStmt) )
		{
			indent++;
			res += visit(ifStmt.getThenStmt());
			indent--;
		}
		else
		{
			res += visit(ifStmt.getThenStmt());
		}
		
		if(ifStmt.getElseStmt() != null)
		{
			res += "\n" + getIndentAsString() + "else\n";
			if( !(ifStmt.getElseStmt() instanceof BlockStmt) )
			{
				indent++;
				res += visit(ifStmt.getElseStmt());
				indent--;
			}
			else
			{
				res += visit(ifStmt.getElseStmt());
			}
		}
		
		return res;
	}

	@Override
	public String visit(IntLiteral intLiteral) {
		return "" + intLiteral.getValue();
	}

	@Override
	public String visit(Node node) {
		return (String) super.visit(node);
	}

	@Override
	public String visit(Program program) {
		StringBuilder sb = new StringBuilder(program.getFunctionName() + "(");
		boolean afterOne = false;
		for(Decl decl : program.getDeclList().getDecls()) {
			if(afterOne) {
				sb.append(", ");
			}
			else {
				afterOne = true;
			}
			sb.append(decl.getType() + " " + decl.getName()); 
		}
		sb.append(")\n");
		sb.append(visit(program.getBlockStmt()));
		return sb.toString();
	}

	@Override
	public String visit(Stmt stmt) {
		return getIndentAsString() + super.visit(stmt);
	}

	@Override
	public String visit(StmtList stmtList) {
		String res = "";
		for(Stmt stmt : stmtList.getStatements())
		{
			res += visit(stmt) + "\n";
		}
		return res;
	}

	@Override
	public String visit(TernaryExpr ternaryExpr) {
		return "(" + visit(ternaryExpr.getCondition())
				+ " ? " + visit(ternaryExpr.getTrueExpr())
				+ " : " + visit(ternaryExpr.getFalseExpr()) + ")";
	}

	@Override
	public String visit(UnaryExpr unaryExpr) {
		return "(" + UnaryExpr.getOperatorString(unaryExpr.getOperator()) + visit(unaryExpr.getOperand()) + ")";
	}

	@Override
	public String visit(WhileStmt whileStmt) {
		String res = "while(" + visit(whileStmt.getCondition())
				+ ")\n";
		
		if(whileStmt.getBound() != null)
		{
			res += "bound(" + whileStmt.getBound().getValue() + ")\n";
		}
		
		for(Invariant invar : whileStmt.getInvariantList().getInvariants())
		{
			res += invar.isCandidate() ? "cand" : "inv";
			res += "(" + visit(invar.getExpr()) + ")\n";
		}
		
		if(!(whileStmt.getBody() instanceof BlockStmt))
		{
			indent++;
			res += visit(whileStmt.getBody());
			indent--;
		}
		else
		{
			res += visit(whileStmt.getBody());
		}
		return res;
	}

	
	


}
