package srt.ast.visitor.impl;

import srt.ast.*;

/**
 * Visits IfStmt, WhileStmt and changes immediate child Stmts
 * that are not BlockStmt to BlockStmts.<p>
 * 
 * e.g. if(1) x=1; becomes if(1) { x=1; } else {}<p>
 *
 */
public class MakeBlockVisitor extends DefaultVisitor {
	
	public MakeBlockVisitor() {
		super(true);
	}

	public static BlockStmt getStmtAsBlockStmt(Stmt stmt) {
		if((stmt == null))
		{
			return new BlockStmt(new Stmt[] {}, null);
		}
		else if(stmt instanceof BlockStmt)
		{
			return (BlockStmt) stmt;
		}
		else
		{
			return new BlockStmt(new Stmt[] {stmt}, stmt.getNodeInfo());
		}
	}
	
	@Override
	public Object visit(IfStmt ifStmt) {
		Stmt thenStmt = getStmtAsBlockStmt(ifStmt.getThenStmt());
		Stmt elseStmt = getStmtAsBlockStmt(ifStmt.getElseStmt());

		if (ifStmt.getThenStmt() != thenStmt
				|| ifStmt.getElseStmt() != elseStmt) {
			return new IfStmt((Expr) visit(ifStmt.getCondition()),
					(Stmt) visit(thenStmt), (Stmt) visit(elseStmt),
					ifStmt.getNodeInfo());
		}
		return super.visit(ifStmt);
	}

	@Override
	public Object visit(WhileStmt whileStmt) {
		Stmt body = getStmtAsBlockStmt(whileStmt.getBody());
		if (whileStmt.getBody() != body) {
			return new WhileStmt((Expr) visit(whileStmt.getCondition()),
					(IntLiteral) visit(whileStmt.getBound()),
					(InvariantList) visit(whileStmt.getInvariantList()),
					(Stmt) visit(body), whileStmt.getNodeInfo());
		}
		return super.visit(whileStmt);
	}

	
	
}
