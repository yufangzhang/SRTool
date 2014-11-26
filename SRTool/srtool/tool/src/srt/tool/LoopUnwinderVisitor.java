package srt.tool;

import srt.ast.WhileStmt;
import srt.ast.visitor.impl.DefaultVisitor;

public class LoopUnwinderVisitor extends DefaultVisitor {

	private boolean unsound;
	private int defaultUnwindBound;

	public LoopUnwinderVisitor(boolean unsound,
			int defaultUnwindBound) {
		super(true);
		this.unsound = unsound;
		this.defaultUnwindBound = defaultUnwindBound;
	}

	@Override
	public Object visit(WhileStmt whileStmt) {
		return super.visit(whileStmt);
	}

}
