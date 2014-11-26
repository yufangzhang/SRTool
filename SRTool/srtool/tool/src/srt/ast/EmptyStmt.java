package srt.ast;

public class EmptyStmt extends Stmt {
	public EmptyStmt() {
		this(null);
	}
	public EmptyStmt(NodeInfo nodeInfo) {
		super(nodeInfo);
	}
}
