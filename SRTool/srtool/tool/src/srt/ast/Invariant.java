package srt.ast;

public class Invariant extends Node {

	private boolean candidate;
	
	public Invariant(boolean candidate, Expr expr)
	{
		this(candidate, expr, null);
	}
	
	public Invariant(boolean candidate, Expr expr, NodeInfo nodeInfo) {
		super(nodeInfo);
		this.candidate = candidate;
		children.add(expr);
	}
	
	public boolean isCandidate()
	{
		return candidate;
	}
	
	public Expr getExpr()
	{
		return (Expr) children.get(0); 
	}
	

}
