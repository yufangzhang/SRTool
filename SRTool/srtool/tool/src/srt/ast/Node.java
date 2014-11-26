package srt.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * A Node in the abstract syntax tree (AST). Nodes are immutable, so
 * modification requires constructing a new node.
 * <p>
 * 
 * Each node has a {@code children} field that stores a {@code List} of child
 * nodes. For example, the following if statement: if([C]) [S1] else [S2] is
 * parsed into an {@code IfStmt}, which extends {@code Stmt}, which extends
 * {@code Node}. It has three {@code children} representing [C], [S1] and [S2].
 * These are accessed using the accessor methods of {@code IfStmt}:
 * {@code getCondition()}, {@code getThenStmt()} and {@code getElseStmt()},
 * respectively. All Nodes have accessor methods for their {@code children} and,
 * in some cases, for other data. E.g. {@code IntLiteral} has a
 * {@code getValue()} method.
 * <p>
 * 
 * You can look at the constructor of a {@code Node} subclass and/or its
 * accessor methods to determine what children it has. See
 * {@code DefaultVisitor} for visiting an AST.
 * <p>
 * 
 * Subclasses of {@code Node} all accept a {@code NodeInfo} parameter. Nodes
 * from the original AST have a {@code NodeInfo} that contains the line and
 * column number of where this {@code Node} comes from in the source code.
 * Further, {@code NodeInfo} has an {@code origNode} field which points to the
 * original {@code Node} from which this {@code Node} is derived. Nodes created
 * with a null {@code NodeInfo} will have a {@code NodeInfo} created
 * automatically. If the {@code origNode} of a {@code NodeInfo} is null, then
 * the {@code Node} constructor will set {@code origNode} to be the constructed
 * {@code Node}. It is highly recommended that you use this information. E.g. if
 * you are adding an {@code AssertStmt} that is derived from an
 * {@code Invariant}, then you should use {@code invariant.getNodeInfo()} as the
 * {@code NodeInfo} for the {@code AssertStmt}. This makes it easier to report
 * the line number of the invariant that caused the assertion failure.
 * 
 */
public abstract class Node implements Cloneable {
	protected ArrayList<Node> children = new ArrayList<Node>();
	protected NodeInfo nodeInfo;

	public Node(NodeInfo nodeInfo) {
		this.nodeInfo = nodeInfo;
		if (this.nodeInfo == null) {
			this.nodeInfo = new NodeInfo(this, -1, 0);
		} else if (this.nodeInfo.getOrigNode() == null) {
			this.nodeInfo = new NodeInfo(this, this.nodeInfo.getLineNumber(),
					this.nodeInfo.getCharNumber());
		}
	}

	public List<Node> getChildrenCopy() {
		return new ArrayList<Node>(children);
	}

	public Node withNewChildren(List<Node> newChildren) {
		try {
			Node newNode = (Node) super.clone();
			newNode.children = new ArrayList<Node>(newChildren);
			return newNode;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public NodeInfo getNodeInfo() {
		return nodeInfo;
	}

}
