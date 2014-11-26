package srt.ast.visitor.impl;

import srt.ast.Node;

public class PrintClassVisitor extends DefaultVisitor {
	
	public PrintClassVisitor() {
		super(false);
	}

	@Override
	public Object visit(Node node) {
		System.out.println("Visiting " + node.getClass().getName());
		return super.visit(node);
	}
	
}
