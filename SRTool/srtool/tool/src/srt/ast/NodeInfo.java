package srt.ast;

/**
 * Stores information about a Node.
 */
public class NodeInfo {

	private Node origNode;
	private int lineNumber;
	private int charNumber;

	public NodeInfo(Node origNode, int lineNumber, int charNumber) {
		this.origNode = origNode;
		this.lineNumber = lineNumber;
		this.charNumber = charNumber;
	}

	/**
	 * This is used to point to the Node from which a Node is derived. E.g. an
	 * AssertStmt might be derived from an Invariant.
	 * 
	 * @return original Node.
	 */
	public Node getOrigNode() {
		return origNode;
	}

	/**
	 * @return The line number in the original source code from which this Node
	 *         is derived.
	 */
	public int getLineNumber() {
		return lineNumber;
	}

	/**
	 * @return The character column in the original source code from which this
	 *         Node is derived.
	 */
	public int getCharNumber() {
		return charNumber;
	}
	
	
	/**
	 * Sets the original Node.
	 * Only used by ASTConverter when creating the original Nodes of the AST.
	 * @param origNode
	 */
	void setOrigNode(Node origNode) {
		this.origNode = origNode;
	}

}
