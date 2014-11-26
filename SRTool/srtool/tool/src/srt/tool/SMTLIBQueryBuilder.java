package srt.tool;

public class SMTLIBQueryBuilder {

	private ExprToSmtlibVisitor exprConverter;
	private CollectConstraintsVisitor constraints;
	private String queryString = "";

	public SMTLIBQueryBuilder(CollectConstraintsVisitor ccv) {
		this.constraints = ccv;
		this.exprConverter = new ExprToSmtlibVisitor();
	}

	public void buildQuery() {
		StringBuilder query = new StringBuilder();
		query.append("(set-logic QF_BV)\n"
				+ "(define-fun tobv32 ((p Bool)) (_ BitVec 32) (ite p (_ bv1 32) (_ bv0 32)))\n");
		// TODO: Define more functions above (for convenience), as needed.

		// TODO: Declare variables, add constraints, add properties to check
		// here.

		query.append("(check-sat)\n");
		queryString = query.toString();
	}

	public String getQuery() {
		return queryString;
	}

}
