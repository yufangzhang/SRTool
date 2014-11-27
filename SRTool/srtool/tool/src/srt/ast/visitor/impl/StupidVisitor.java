package srt.ast.visitor.impl;

import srt.ast.*;

/**
 * This is a stupid visitor that demonstrates a few techniques. This visitor:
 * <ul>
 * <li>removes assignment statements from "else blocks".</li>
 * <li>inserts "assume(1)" before every if statement.</li>
 * </ul>
 * <p>
 * 
 * Run {@link srt.test.StupidVisitorTest} to run the visitor on
 * "test/stupidif/stupidif_bad.sc".
 * <p>
 * 
 */
public class StupidVisitor extends DefaultVisitor {

	private boolean removeAssignment = false;

	public StupidVisitor() {
		// Must be true.
		// This means that visit methods
		// should return a Node which will replace
		// the Node that is being visited.
		super(true);
	}

	@Override
	public Object visit(IfStmt ifStmt) {

		// No need to visit condition, as it is just an expression
		// But we store it in a variable for convenience.
		Expr condition = ifStmt.getCondition();

		// Visit "then block" to process nested if statements.
		// Returns a (potentially) new then block,
		// which has been processed.
		Stmt thenStmt = (Stmt) visit(ifStmt.getThenStmt());

		// We want to remove assignments inside "else blocks",
		// so we set removeAssignment to true while we visit the
		// else block.
		boolean oldValue = removeAssignment;
		removeAssignment = true;
		Stmt elseStmt = (Stmt) visit(ifStmt.getElseStmt());
		// removeAssignment might already have been true,
		// so we cannot just set removeAssignment to false.
		// So we restore the value it had before.
		removeAssignment = oldValue;

		// ifStmt is immutable, so we will construct a new IfStmt,
		// with our new then and else blocks.
		// The basedOn parameter allows the line number etc. of ifStmt to be
		// copied to our new IfStmt.
		IfStmt newIfStmt = new IfStmt(condition, thenStmt, elseStmt,
				ifStmt.getNodeInfo());

		// We want to add an assume(1) statement right before the IfStmt.
		AssumeStmt assumeTrue = new AssumeStmt(new IntLiteral(1, null), null);

		// In order to replace a statement (the original ifStmt) with multiple
		// statements, we create a BlockStmt that contains our statements.
		BlockStmt block = new BlockStmt(new Stmt[] { assumeTrue, newIfStmt },
				ifStmt.getNodeInfo());

		// return the block, which replaces the original ifStmt.
		return block;
	}

	@Override
	public Object visit(AssignStmt assignment) {
		if (removeAssignment) {

			// We are processing an "else block"
			// so replace the assignment with
			// an EmptyStmt.
			return new EmptyStmt(assignment.getNodeInfo());

		} else {

			// Could just return assignment.
			// The super implementation will do the same,
			// but will also visit the children;
			// this is unnecessary in this case,
			// but we include it here as a reference.
			return super.visit(assignment);

		}
	}

}
