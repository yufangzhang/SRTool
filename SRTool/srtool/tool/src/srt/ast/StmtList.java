package srt.ast;

import java.util.List;

public class StmtList extends Node {
	
	public StmtList(Stmt[] statements) {
		this(statements, null);
	}
	
	public StmtList(Stmt[] statements, NodeInfo nodeInfo) {
		super(nodeInfo);
		for(Stmt stmt : statements) {
			children.add(stmt);
		}
	}
	
	public StmtList(List<Stmt> statements) {
		this(statements, null);
	}
	
	public StmtList(List<Stmt> statements, NodeInfo nodeInfo) {
		super(nodeInfo);
		children.addAll(statements);
	}
	
	@SuppressWarnings("unchecked")
	public List<Stmt> getStatements()
	{
		return (List<Stmt>)children.clone();
	}
	
}
