package srt.ast;

import java.util.List;

public class BlockStmt extends Stmt {
	
	public BlockStmt(StmtList stmtList) {
		this(stmtList, null);
	}
	
	public BlockStmt(StmtList stmtList, NodeInfo nodeInfo) {
		super(nodeInfo);
		children.add(stmtList);
	}
	
	public BlockStmt(Stmt[] statements) {
		this(statements, null);
	}
	
	public BlockStmt(Stmt[] statements, NodeInfo nodeInfo) {
		super(nodeInfo);
		children.add(new StmtList(statements, nodeInfo));
	}
	
	public BlockStmt(List<Stmt> statements) {
		this(statements, null);
	}
	
	public BlockStmt(List<Stmt> statements, NodeInfo nodeInfo) {
		super(nodeInfo);
		children.add(new StmtList(statements, nodeInfo));
	}
	
	public StmtList getStmtList() {
		return (StmtList) children.get(0);
	}
}
