package srt.ast.visitor.impl;

import srt.ast.AssignStmt;
import srt.ast.BinaryExpr;
import srt.ast.BlockStmt;
import srt.ast.Expr;
import srt.ast.Stmt;
import srt.parser.SimpleCLexer;
import srt.tool.ExprToSmtlibVisitor;

public class AssignmentVisitor extends DefaultVisitor {

	public AssignmentVisitor() {
		super(true);
	}

	@Override
	public Object visit(AssignStmt assignment) {
		Expr LHS = assignment.getLhs();
		Expr RHS = assignment.getRhs();
		BinaryExpr e=new BinaryExpr(SimpleCLexer.EQUAL, LHS, RHS, assignment.getNodeInfo());
		ExprToSmtlibVisitor expression=new ExprToSmtlibVisitor();
		expression.visit(e);
		return e;
	}
}
