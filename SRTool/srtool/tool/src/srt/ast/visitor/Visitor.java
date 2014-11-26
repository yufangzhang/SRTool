package srt.ast.visitor;

import srt.ast.*;

/**
 * Includes visit methods for all {@code srt.ast.Node} subclasses.
 * For implementing the Visitor design pattern.
 */
public interface Visitor {
	public Object visit(AssertStmt assertStmt);
	public Object visit(AssignStmt assignment);
	public Object visit(AssumeStmt assumeStmt);
	public Object visit(BinaryExpr binaryExpr);
	public Object visit(BlockStmt blockStmt);
	public Object visit(Decl decl);
	public Object visit(DeclList declList);
	public Object visit(DeclRef declRef);
	public Object visit(EmptyStmt emptyStmt);
	public Object visit(Expr expr);
	public Object visit(Invariant invar);
	public Object visit(InvariantList invarList);
	public Object visit(HavocStmt havocStmt);
	public Object visit(IfStmt ifStmt);
	public Object visit(IntLiteral intLiteral);
	public Object visit(Node node);
	public Object visit(Program program);
	public Object visit(Stmt stmt);
	public Object visit(StmtList stmtList);
	public Object visit(TernaryExpr ternaryExpr);
	public Object visit(UnaryExpr unaryExpr);
	public Object visit(WhileStmt whileStmt);
}
