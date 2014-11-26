package srt.ast;

public class AssumeStmt extends Stmt {
	
	public AssumeStmt(Expr condition) {
		this(condition, null);
	}
	
	public AssumeStmt(Expr condition, NodeInfo nodeInfo) {
		super(nodeInfo);
		children.add(condition);
	}
	
	public Expr getCondition() {
		return (Expr) children.get(0);
	}
}
