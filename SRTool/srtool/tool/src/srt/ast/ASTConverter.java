package srt.ast;

import org.antlr.runtime.tree.Tree;
import srt.parser.SimpleCLexer;

public class ASTConverter {

	public ASTConverter() {

	}

	public Program go(Tree root) {
		return (Program) convert(root);
	}

	private Node convert(Tree tree) {
		Node node = null;
		NodeInfo nodeInfo = new NodeInfo(null, tree.getLine(),
				tree.getCharPositionInLine());
		switch (tree.getType()) {
		case SimpleCLexer.UMINUS:
		case SimpleCLexer.UPLUS:
		case SimpleCLexer.LNOT:
		case SimpleCLexer.BNOT:
			node = new UnaryExpr(tree.getType(),
					(Expr) convert(tree.getChild(0)), nodeInfo);
			nodeInfo.setOrigNode(node);
			return node;
		case SimpleCLexer.ADD:
		case SimpleCLexer.BAND:
		case SimpleCLexer.BOR:
		case SimpleCLexer.BXOR:
		case SimpleCLexer.DIVIDE:
		case SimpleCLexer.GEQ:
		case SimpleCLexer.GT:
		case SimpleCLexer.LAND:
		case SimpleCLexer.LEQ:
		case SimpleCLexer.LOR:
		case SimpleCLexer.LSHIFT:
		case SimpleCLexer.LT:
		case SimpleCLexer.MOD:
		case SimpleCLexer.MULTIPLY:
		case SimpleCLexer.NEQUAL:
		case SimpleCLexer.EQUAL:
		case SimpleCLexer.RSHIFT:
		case SimpleCLexer.SUBTRACT:
			node = new BinaryExpr(tree.getType(),
					(Expr) convert(tree.getChild(0)),
					(Expr) convert(tree.getChild(1)), nodeInfo);
			nodeInfo.setOrigNode(node);
			return node;
		case SimpleCLexer.ASSERT:
			node = new AssertStmt((Expr) convert(tree.getChild(0)), nodeInfo);
			nodeInfo.setOrigNode(node);
			return node;
		case SimpleCLexer.ASSUME:
			node = new AssumeStmt((Expr) convert(tree.getChild(0)), nodeInfo);
			nodeInfo.setOrigNode(node);
			return node;
		case SimpleCLexer.ASSIGNMENT:
			node = new AssignStmt((DeclRef) convert(tree.getChild(0)),
					(Expr) convert(tree.getChild(1)), nodeInfo);
			nodeInfo.setOrigNode(node);
			return node;
		case SimpleCLexer.BLOCK:
			node = new BlockStmt((StmtList) convert(tree.getChild(0)), nodeInfo);
			nodeInfo.setOrigNode(node);
			return node;
		case SimpleCLexer.CANDIDATE_INV:
			node = new Invariant(true, (Expr) convert(tree.getChild(0)),
					nodeInfo);
			nodeInfo.setOrigNode(node);
			return node;
		case SimpleCLexer.COMPOUND_STATEMENT: {
			int max = tree.getChildCount();
			Stmt[] stmts = new Stmt[max];
			for (int i = 0; i < max; ++i) {
				stmts[i] = (Stmt) convert(tree.getChild(i));
			}
			node = new StmtList(stmts, nodeInfo);
			nodeInfo.setOrigNode(node);
			return node;
		}
		case SimpleCLexer.DECL:
			node = new Decl(tree.getChild(0).getText(), tree.getChild(1)
					.getText(), nodeInfo);
			nodeInfo.setOrigNode(node);
			return node;
		case SimpleCLexer.DECL_LIST: {
			int max = tree.getChildCount();
			Decl[] decls = new Decl[max];
			for (int i = 0; i < max; ++i) {
				decls[i] = (Decl) convert(tree.getChild(i));
			}
			node = new DeclList(decls, nodeInfo);
			nodeInfo.setOrigNode(node);
			return node;
		}
		case SimpleCLexer.DIGIT:
			throw new IllegalStateException("Should not reach digit");
		case SimpleCLexer.EMPTY_STMT:
			node = new EmptyStmt(nodeInfo);
			nodeInfo.setOrigNode(node);
			return node;
		case SimpleCLexer.HAVOC:
			node = new HavocStmt((DeclRef) convert(tree.getChild(0)), nodeInfo);
			nodeInfo.setOrigNode(node);
			return node;
		case SimpleCLexer.ID:
			node = new DeclRef(tree.getText(), nodeInfo);
			nodeInfo.setOrigNode(node);
			return node;
		case SimpleCLexer.IF:
			node = new IfStmt((Expr) convert(tree.getChild(0)),
					(Stmt) convert(tree.getChild(1)),
					tree.getChild(2) == null ? null : (Stmt) convert(tree
							.getChild(2)), nodeInfo);
			nodeInfo.setOrigNode(node);
			return node;
		case SimpleCLexer.INVARIANT_LIST: {
			int num = tree.getChildCount();
			Invariant[] invars = new Invariant[num];
			for (int i = 0; i < num; ++i) {
				invars[i] = (Invariant) convert(tree.getChild(i));
			}
			node = new InvariantList(invars, nodeInfo);
			nodeInfo.setOrigNode(node);
			return node;
		}
		case SimpleCLexer.NUMBER:
			node = new IntLiteral(Integer.parseInt(tree.getText()), nodeInfo);
			nodeInfo.setOrigNode(node);
			return node;
		case SimpleCLexer.PROGRAM:
			node = new Program(tree.getChild(0).getText(),
					(DeclList) convert(tree.getChild(1)),
					(BlockStmt) convert(tree.getChild(2)), nodeInfo);
			nodeInfo.setOrigNode(node);
			return node;
		case SimpleCLexer.REQUIRED_INV:
			node = new Invariant(false, (Expr) convert(tree.getChild(0)),
					nodeInfo);
			nodeInfo.setOrigNode(node);
			return node;
		case SimpleCLexer.TERNARY:
			node = new TernaryExpr((Expr) convert(tree.getChild(0)),
					(Expr) convert(tree.getChild(1)),
					(Expr) convert(tree.getChild(2)), nodeInfo);
			nodeInfo.setOrigNode(node);
			return node;
		case SimpleCLexer.WHILE: {
			Tree unwind = tree.getChild(1);
			assert unwind.getType() == SimpleCLexer.BOUND;
			IntLiteral unwindLiteral = unwind.getChild(0) == null ? null
					: (IntLiteral) convert(unwind.getChild(0));
			node = new WhileStmt((Expr) convert(tree.getChild(0)),
					unwindLiteral, (InvariantList) convert(tree.getChild(2)),
					(Stmt) convert(tree.getChild(3)), nodeInfo);
			nodeInfo.setOrigNode(node);
			return node;
		}
		case SimpleCLexer.WHITESPACE:
		default:
		}

		throw new IllegalStateException("Unexpected token in antlr AST");
	}

}
