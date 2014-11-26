package srt.tool;

import srt.ast.AssignStmt;
import srt.ast.Decl;
import srt.ast.DeclRef;
import srt.ast.visitor.impl.DefaultVisitor;

public class SSAVisitor extends DefaultVisitor {

	public SSAVisitor() {
		super(true);
	}

	@Override
	public Object visit(Decl decl) {
		return super.visit(decl);
	}

	@Override
	public Object visit(DeclRef declRef) {
		return super.visit(declRef);
	}

	@Override
	public Object visit(AssignStmt assignment) {
		return super.visit(assignment);
	}

}
