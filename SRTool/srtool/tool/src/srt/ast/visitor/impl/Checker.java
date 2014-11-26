package srt.ast.visitor.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.antlr.runtime.tree.Tree;

import srt.ast.*;

/**
 * This class uses a Visitor to check that
 * variables are declared before use
 * and that there are no duplicate local variables
 * in the same scope.
 */
public class Checker {
	
	private Scopes scopes;
	private CheckerError checkerError = null;
	
	private DefaultVisitor visitor = new DefaultVisitor(false) {
		private void error(String msg, Node node) {
			NodeInfo nodeInfo = node.getNodeInfo();
			msg += " at line " + nodeInfo.getLineNumber() + ":" + nodeInfo.getCharNumber();
			checkerError = new CheckerError(msg, node);
			stopVisitingChildren = true;
		}
		
		@Override
		public Object visit(BlockStmt blockStmt) {
			scopes.pushScope();
			Object res = super.visit(blockStmt);
			scopes.popScope();
			return res;
		}
		
		@Override
		public Object visit(Decl decl) {
			if(!scopes.addVariable(decl.getName()))
			{
				error("Duplicate variable " + decl.getName(), decl);
			}
			return super.visit(decl);
		}
		
		@Override
		public Object visit(DeclRef declRef) {
			if(!scopes.isVariableInScope(declRef.getName()))
			{
				error("Undefined variable " + declRef.getName(), declRef);
			}
			return super.visit(declRef);
		}
	};
	
	public boolean check(Program p) {
		scopes = new Scopes();
		checkerError = null;
		visitor.visit(p);
		return checkerError == null;
	}

	public CheckerError getCheckerError() {
		return checkerError;
	}

	public class CheckerError extends Exception {
		private static final long serialVersionUID = 1L;
		public Node errorNode;

		public CheckerError(String message, Node errorNode) {
			super(message);
			this.errorNode = errorNode;
		}
	}

	private class Scopes {
		private Set<String> variablesInScope = new HashSet<String>();
		private List<Set<String>> scopes = new ArrayList<Set<String>>();
		
		public Scopes() {
			pushScope();
		}
		
		public void pushScope() {
			scopes.add(new HashSet<String>());
		}
		
		public void popScope() {
			int last = scopes.size()-1;
			Set<String> variablesLost = scopes.get(last);
			scopes.remove(last);
			variablesInScope.removeAll(variablesLost);
		}
		
		public boolean addVariable(String var) {
			if(variablesInScope.contains(var))
			{
				return false;
			}
			variablesInScope.add(var);
			int last = scopes.size()-1;
			scopes.get(last).add(var);
			return true;
		}
		
		public boolean isVariableInScope(String var) {
			return variablesInScope.contains(var);
		}
		
	}
	
	
}
