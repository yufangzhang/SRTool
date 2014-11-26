package srt.tool;

import srt.ast.AssertStmt;
import srt.ast.AssignStmt;
import srt.ast.AssumeStmt;
import srt.ast.HavocStmt;
import srt.ast.IfStmt;
import srt.ast.visitor.impl.DefaultVisitor;

public class PredicationVisitor extends DefaultVisitor {

	public PredicationVisitor() {
		super(true);
	}
	
	@Override
	public Object visit(IfStmt ifStmt) {
		return super.visit(ifStmt);
	}

	@Override
	public Object visit(AssertStmt assertStmt) {
		return super.visit(assertStmt);
	}

	@Override
	public Object visit(AssignStmt assignment) {
		return super.visit(assignment);
	}

	@Override
	public Object visit(AssumeStmt assumeStmt) {
		return super.visit(assumeStmt);
	}

	@Override
	public Object visit(HavocStmt havocStmt) {
		return super.visit(havocStmt);
	}

}