package srt.ast;

public class IntLiteral extends Expr {
	private int value;

	public IntLiteral(int value) {
		this(value, null);
	}
	
	public IntLiteral(int value, NodeInfo nodeInfo) {
		super(nodeInfo);
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
}
