package srt.test;

import java.io.IOException;

import org.antlr.runtime.RecognitionException;

import srt.ast.Program;
import srt.ast.visitor.impl.PrinterVisitor;
import srt.ast.visitor.impl.StupidVisitor;
import srt.ast.visitor.impl.MakeBlockVisitor;
import srt.parser.SimpleCParserUtil;

public class StupidVisitorTest {

	/**
	 * @param args
	 * @throws RecognitionException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException, RecognitionException {
		// Parse input Simple C file to AST.
		Program p = SimpleCParserUtil.createAST("../tests/loopfree/stupidif/stupidif_bad.sc");

		p = (Program) new MakeBlockVisitor().visit(p);
		
		p = (Program) new StupidVisitor().visit(p);
		
		String programText = new PrinterVisitor().visit(p);
		System.out.println(programText);
		
	}

}
