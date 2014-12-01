package srt.tool;

import java.util.ArrayList;
import java.util.List;
import srt.ast.AssertStmt;
import srt.ast.AssumeStmt;
import srt.ast.BlockStmt;
import srt.ast.EmptyStmt;
import srt.ast.Expr;
import srt.ast.IfStmt;
import srt.ast.Invariant;
import srt.ast.InvariantList;
import srt.ast.Stmt;
import srt.ast.UnaryExpr;
import srt.ast.WhileStmt;
import srt.ast.visitor.impl.DefaultVisitor;

public class LoopUnwinderVisitor extends DefaultVisitor {

	private boolean unsound;
	private int defaultUnwindBound;

	public LoopUnwinderVisitor(boolean unsound, int defaultUnwindBound) {
		super(true);
		this.unsound = unsound;
		this.defaultUnwindBound = defaultUnwindBound;
	}

	@Override
	public Object visit(WhileStmt whileStmt) {
		Stmt whileBody= whileStmt.getBody();
		List<Stmt> statements = new ArrayList<Stmt>();
		List<Stmt> AssertionAndAssume = generateUnwindingAssertionAndAssume(whileStmt);
		List<Stmt> invariantsAssertions  = generateAssertionsFromInvariants(whileStmt);
		statements.addAll(AssertionAndAssume);
		 int bound = 0;
		 if(whileStmt.getBound()==null)
			 bound=defaultUnwindBound;
		 else
			 bound=whileStmt.getBound().getValue();
		 if(bound==0)
		 {
			 return new BlockStmt(statements);
		 }
		 for(int i=0;i<bound;i++)
		 {
			 List<Stmt> newStatements = new ArrayList<Stmt>();
			 newStatements.addAll(invariantsAssertions);
			 newStatements.add(whileStmt.getBody());
			 newStatements.addAll(statements);
			 IfStmt newIf=new IfStmt(whileStmt.getCondition(), new BlockStmt(newStatements), new EmptyStmt());
			 statements=new ArrayList<Stmt>();
			 statements.add(newIf);
		 }
		return  super.visit(new BlockStmt(statements));
	}

	// Generates the unwinding assertions and assume
	private List<Stmt> generateUnwindingAssertionAndAssume(WhileStmt whileStmt) {
		AssertStmt assertion = new AssertStmt(new UnaryExpr(UnaryExpr.LNOT,
				whileStmt.getCondition()), whileStmt.getCondition()
				.getNodeInfo());
		AssumeStmt assume = new AssumeStmt(new UnaryExpr(UnaryExpr.LNOT,
				whileStmt.getCondition()), whileStmt.getCondition()
				.getNodeInfo());
		List<Stmt> statements = new ArrayList<Stmt>();
		if (unsound) {
			statements.add(assertion);
			statements.add(assume);
		} else {
			statements.add(assume);
		}
		return statements;
	}
	private List<Stmt> generateAssertionsFromInvariants(WhileStmt whileStmt){
        List<Stmt> statements = new ArrayList<Stmt>();
        List<Invariant> invariantsList = whileStmt.getInvariantList().getInvariants();
        for (Invariant expression: invariantsList) {
            Stmt assertStmt = new AssertStmt(expression.getExpr(), expression.getNodeInfo());
            statements.add(assertStmt);
        }
        return statements;
    }
}