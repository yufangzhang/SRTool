package srt.ast.visitor.impl;

import java.util.List;

import srt.ast.*;
import srt.ast.visitor.Visitor;
import srt.util.ReflectionUtil;

/**
 * {@code DefaultVisitor} visits the children of a Node recursively,
 * starting with the first child. The order of the children of a Node can be
 * determined by looking at the constructor of a particular {@code Node} 
 * subclass. The visit methods usually return the visited {@code Node},
 * or a different {@code Node} object of the same type
 * if the children were "modified" -- see below.
 * Subclasses can override {@code visit} methods to return
 * something different.<p>
 * 
 * {@code DefaultVisitor} also works its way down the class inheritance hierarchy. 
 * So, when an {@code IfStmt} is visited, 
 * {@code visit(Stmt stmt)} is called,
 * which then calls {@code visit(IfStmt ifStmt)} 
 * with the {@code Stmt} cast to an {@code IfStmt}. 
 * Subclasses can therefore perform an action on {@code Stmt}s or
 * {@code IfStmt}s or both.<p>
 * 
 * Nodes are immutable. To "replace" a single node in the AST, all
 * predecessors must be replaced with new nodes as well,
 * which results in a new {@code Program} node.
 * To avoid having to manually recreate all predecessors, the
 * {@code DefaultVisitor} can do this automatically. 
 * The {@code doesModify} parameter of the
 * constructor must be {@code true} for this to work. 
 * {@code DefaultVisitor} detects when a different node is returned
 * from one of the visit methods and replaces the parent node with
 * a copy where the {@code children} field now points to the 
 * new {@code IfStmt}.
 * This propagates up to the root {@code Program} node, 
 * which is returned by the visitor.<p>
 *
 */
public abstract class DefaultVisitor implements Visitor {
	
	protected boolean stopVisitingChildren = false;
	private boolean doesModify;
	
	public DefaultVisitor(boolean doesModify) {
		super();
		this.doesModify = doesModify;
	}
	
	public Object visitChildren(Node node)
	{
		List<Node> children = node.getChildrenCopy();
		boolean modifiedChildren = false;
		for(int i=0; !stopVisitingChildren && i < children.size(); i++)
		{
			Node child = children.get(i);
			if(child != null)
			{
				Object res = visit(child);
				if(doesModify && res != child) {
					children.set(i, (Node) res);
					modifiedChildren = true;
				}
			}
		}
		
		if(modifiedChildren) {
			return node.withNewChildren(children);
		}
		
		return node;
	}
	
	@Override
	public Object visit(AssertStmt assertStmt) {
		return visitChildren(assertStmt);
	}

	@Override
	public Object visit(AssignStmt assignment) {
		return visitChildren(assignment);
	}
	
	@Override
	public Object visit(AssumeStmt assumeStmt) {
		return visitChildren(assumeStmt);
	}

	@Override
	public Object visit(BinaryExpr expr) {
		return visitChildren(expr);
	}

	@Override
	public Object visit(BlockStmt blockStmt) {
		return visitChildren(blockStmt);
	}

	@Override
	public Object visit(Decl decl) {
		return visitChildren(decl);
	}

	@Override
	public Object visit(DeclList declList) {
		return visitChildren(declList);
	}

	@Override
	public Object visit(DeclRef declRef) {
		return visitChildren(declRef);
	}
	
	@Override
	public Object visit(EmptyStmt emptyStmt) {
		return visitChildren(emptyStmt);
	}

	@Override
	public Object visit(Expr expr) {
		return ReflectionUtil.callMethod("visit", this, new Class[] {ReflectionUtil.getNextSubclassDown(expr, Expr.class)}, new Object[] {expr});
	}

	@Override
	public Object visit(HavocStmt havocStmt) {
		return visitChildren(havocStmt);
	}
	
	@Override
	public Object visit(IfStmt ifStmt) {
		return visitChildren(ifStmt);
	}

	@Override
	public Object visit(IntLiteral intLiteral) {
		return visitChildren(intLiteral);
	}
	
	@Override
	public Object visit(Invariant invar) {
		return visitChildren(invar);
	}
	
	@Override
	public Object visit(InvariantList invarList) {
		return visitChildren(invarList);
	}
	
	@Override
	public Object visit(Node node) {
		return ReflectionUtil.callMethod("visit", this, new Class[] {ReflectionUtil.getNextSubclassDown(node, Node.class)}, new Object[] {node});
	}
	
	@Override
	public Object visit(Program program) {
		return visitChildren(program);
	}
	
	

	@Override
	public Object visit(Stmt stmt) {
		return ReflectionUtil.callMethod("visit", this, new Class[] {ReflectionUtil.getNextSubclassDown(stmt, Stmt.class)}, new Object[] {stmt});
	}

	@Override
	public Object visit(StmtList stmtList) {
		return visitChildren(stmtList);
	}

	@Override
	public Object visit(TernaryExpr ternaryExpr) {
		return visitChildren(ternaryExpr);
	}

	@Override
	public Object visit(UnaryExpr unaryExpr) {
		return visitChildren(unaryExpr);
	}

	@Override
	public Object visit(WhileStmt whileStmt) {
		return visitChildren(whileStmt);
	}

}
