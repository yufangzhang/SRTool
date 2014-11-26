package srt.tool;

import java.util.List;
import java.util.Set;

import com.sun.xml.internal.ws.policy.AssertionSet;

import srt.ast.AssertStmt;
import srt.ast.AssignStmt;
import srt.ast.BinaryExpr;
import srt.ast.Expr;
import srt.parser.SimpleCLexer;
import sun.org.mozilla.javascript.internal.ast.Assignment;

public class SMTLIBQueryBuilder {

	private ExprToSmtlibVisitor exprConverter;
	private CollectConstraintsVisitor constraints;
	private String queryString = "";

	public SMTLIBQueryBuilder(CollectConstraintsVisitor ccv) {
		this.constraints = ccv;
		this.exprConverter = new ExprToSmtlibVisitor();
	}

	public void buildQuery(Set<String> variable) {
		List<AssignStmt> transitionNodes = constraints.transitionNodes;
		List<AssertStmt> propertyNodes = constraints.propertyNodes;
		StringBuilder query = new StringBuilder();
		query.append("(set-logic QF_BV)\n"
				+ "(define-fun tobv32 ((p Bool)) (_ BitVec 32) (ite p (_ bv1 32) (_ bv0 32)))\n");
		// TODO: Define more functions above (for convenience), as needed.

		// TODO: Declare variables, add constraints, add properties to check
		// here.

		// Declare Variables
		for (String var : variable) {
			String v = "(declare-fun " + var + " () (_ BitVec 32))\n";
			query.append(v);
		}
		// Add constraints
		for (AssignStmt a : transitionNodes) {
			String lhs = a.getLhs().getName();
			String rhs = exprConverter.visit(a.getRhs());
			String c = "(assert (= " + lhs + " " + rhs + ")"
					+ ")";
			query.append(c+ "\n");
		}

		for (AssertStmt e : propertyNodes) {
			String t = "(assert " + exprConverter.visit(e.getCondition()) + ")";
			query.append(t + "\n");
		}
		query.append("(check-sat)\n");
		queryString = query.toString();
	}

	public String getQuery() {
		return queryString;
	}

}
