package srt.ast;

public class HavocStmt extends Stmt {
	
	public HavocStmt(DeclRef variable) {
		this(variable, null);
	}
	
	public HavocStmt(DeclRef variable, NodeInfo nodeInfo)
	{
		super(nodeInfo);
		children.add(variable);
	}
	
	public DeclRef getVariable() {
		return (DeclRef) children.get(0);
	}
}
