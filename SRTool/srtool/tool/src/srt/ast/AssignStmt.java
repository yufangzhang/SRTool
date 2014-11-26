package srt.ast;


public class AssignStmt extends Stmt {
	
	public AssignStmt(DeclRef lhs, Expr rhs) {
		this(lhs, rhs, null);
	}
	
	public AssignStmt(DeclRef lhs, Expr rhs, NodeInfo nodeInfo)
	{
		super(nodeInfo);
		children.add(lhs);
		children.add(rhs);
	}

	public DeclRef getLhs() {
		return (DeclRef) children.get(0);
	}
	
	public Expr getRhs() {
		return (Expr) children.get(1);
	}
	
}
