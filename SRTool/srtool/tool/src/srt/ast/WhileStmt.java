package srt.ast;

public class WhileStmt extends Stmt {
	
	public WhileStmt(Expr condition, IntLiteral bound, InvariantList invariants, Stmt body) {
		this(condition, bound, invariants, body, null);
	}
	
	public WhileStmt(Expr condition, IntLiteral bound, InvariantList invariants, Stmt body, NodeInfo nodeInfo) {
		super(nodeInfo);
		children.add(condition);
		children.add(bound);
		children.add(invariants);
		children.add(body);
	}
	
	public Expr getCondition() {
		return (Expr) children.get(0);
	}
	
	/**
	 * Get the unwind bound for this loop.
	 * This may return null if no unwind bound was given.
	 * 
	 * @return The unwind bound IntLiteral or null
	 * if no unwind bound was given.
	 */
	public IntLiteral getBound() {
		return (IntLiteral) children.get(1);
	}
	
	public InvariantList getInvariantList() {
		return (InvariantList) children.get(2);
	}
	
	public Stmt getBody() {
		return (Stmt) children.get(3);
	}
}
