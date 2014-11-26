package srt.parser;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import srt.ast.ASTConverter;
import srt.ast.Program;


public class SimpleCParserUtil {

	/**
	 * Returns an antlr AST for the given SimpleC program.
	 * 
	 * @param filepath Path of the SimpleC program to parse.
	 * @return The root of the AST, the token of which will be of type {@code SimpleCLexer.PROGRAM}.
	 * @throws IOException Related to reading of the file.
	 * @throws RecognitionException Related to parsing. 
	 */
	public static Tree createAntlrAST(String filepath) throws IOException, RecognitionException {
		SimpleCLexer lex = new SimpleCLexer(new ANTLRFileStream(filepath));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		SimpleCParser parser = new SimpleCParser(tokens);
		CommonTree root = (CommonTree)parser.start().getTree();
		assert(root.getToken().getType() == SimpleCLexer.PROGRAM);
		return root;
	}
	
	public static Program createAST(String filepath) throws IOException, RecognitionException {
		Tree root = srt.parser.SimpleCParserUtil.createAntlrAST(filepath);
		Program p = new ASTConverter().go(root);
		return p;
	}

}
