package srt.ast;

public class DeclRef extends Expr {
	private String name;

	public DeclRef(String name) {
		this(name, null);
	}
	
	public DeclRef(String name, NodeInfo nodeInfo) {
		super(nodeInfo);
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
