// $ANTLR 3.4 SimpleC.g 2014-01-27 15:17:27

  package srt.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SimpleCParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "ASSERT", "ASSIGNMENT", "ASSUME", "BAND", "BLOCK", "BNOT", "BOR", "BOUND", "BXOR", "CANDIDATE_INV", "COMMENT", "COMPOUND_STATEMENT", "DECL", "DECL_LIST", "DIGIT", "DIVIDE", "EMPTY_STMT", "EQUAL", "GEQ", "GT", "HAVOC", "ID", "IF", "INVARIANT_LIST", "LAND", "LEQ", "LNOT", "LOR", "LSHIFT", "LT", "MOD", "MULTIPLY", "NEQUAL", "NUMBER", "PROGRAM", "REQUIRED_INV", "RSHIFT", "SUBTRACT", "TERNARY", "UMINUS", "UPLUS", "WHILE", "WHITESPACE", "'('", "')'", "','", "':'", "';'", "'bound'", "'cand'", "'else'", "'int'", "'inv'", "'void'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int ADD=4;
    public static final int ASSERT=5;
    public static final int ASSIGNMENT=6;
    public static final int ASSUME=7;
    public static final int BAND=8;
    public static final int BLOCK=9;
    public static final int BNOT=10;
    public static final int BOR=11;
    public static final int BOUND=12;
    public static final int BXOR=13;
    public static final int CANDIDATE_INV=14;
    public static final int COMMENT=15;
    public static final int COMPOUND_STATEMENT=16;
    public static final int DECL=17;
    public static final int DECL_LIST=18;
    public static final int DIGIT=19;
    public static final int DIVIDE=20;
    public static final int EMPTY_STMT=21;
    public static final int EQUAL=22;
    public static final int GEQ=23;
    public static final int GT=24;
    public static final int HAVOC=25;
    public static final int ID=26;
    public static final int IF=27;
    public static final int INVARIANT_LIST=28;
    public static final int LAND=29;
    public static final int LEQ=30;
    public static final int LNOT=31;
    public static final int LOR=32;
    public static final int LSHIFT=33;
    public static final int LT=34;
    public static final int MOD=35;
    public static final int MULTIPLY=36;
    public static final int NEQUAL=37;
    public static final int NUMBER=38;
    public static final int PROGRAM=39;
    public static final int REQUIRED_INV=40;
    public static final int RSHIFT=41;
    public static final int SUBTRACT=42;
    public static final int TERNARY=43;
    public static final int UMINUS=44;
    public static final int UPLUS=45;
    public static final int WHILE=46;
    public static final int WHITESPACE=47;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SimpleCParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SimpleCParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SimpleCParser.tokenNames; }
    public String getGrammarFileName() { return "SimpleC.g"; }


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // SimpleC.g:35:1: start : 'void' ID '(' declList ')' block EOF -> ^( PROGRAM ID declList block ) ;
    public final SimpleCParser.start_return start() throws RecognitionException {
        SimpleCParser.start_return retval = new SimpleCParser.start_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal1=null;
        Token ID2=null;
        Token char_literal3=null;
        Token char_literal5=null;
        Token EOF7=null;
        SimpleCParser.declList_return declList4 =null;

        SimpleCParser.block_return block6 =null;


        Object string_literal1_tree=null;
        Object ID2_tree=null;
        Object char_literal3_tree=null;
        Object char_literal5_tree=null;
        Object EOF7_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_declList=new RewriteRuleSubtreeStream(adaptor,"rule declList");
        try {
            // SimpleC.g:35:6: ( 'void' ID '(' declList ')' block EOF -> ^( PROGRAM ID declList block ) )
            // SimpleC.g:36:3: 'void' ID '(' declList ')' block EOF
            {
            string_literal1=(Token)match(input,58,FOLLOW_58_in_start100);  
            stream_58.add(string_literal1);


            ID2=(Token)match(input,ID,FOLLOW_ID_in_start102);  
            stream_ID.add(ID2);


            char_literal3=(Token)match(input,48,FOLLOW_48_in_start104);  
            stream_48.add(char_literal3);


            pushFollow(FOLLOW_declList_in_start106);
            declList4=declList();

            state._fsp--;

            stream_declList.add(declList4.getTree());

            char_literal5=(Token)match(input,49,FOLLOW_49_in_start108);  
            stream_49.add(char_literal5);


            pushFollow(FOLLOW_block_in_start110);
            block6=block();

            state._fsp--;

            stream_block.add(block6.getTree());

            EOF7=(Token)match(input,EOF,FOLLOW_EOF_in_start112);  
            stream_EOF.add(EOF7);


            // AST REWRITE
            // elements: block, declList, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 36:40: -> ^( PROGRAM ID declList block )
            {
                // SimpleC.g:36:43: ^( PROGRAM ID declList block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PROGRAM, "PROGRAM")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_declList.nextTree());

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "start"


    public static class declList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declList"
    // SimpleC.g:39:1: declList : ( decl ( ',' decl )* )? -> ^( DECL_LIST ( decl )* ) ;
    public final SimpleCParser.declList_return declList() throws RecognitionException {
        SimpleCParser.declList_return retval = new SimpleCParser.declList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal9=null;
        SimpleCParser.decl_return decl8 =null;

        SimpleCParser.decl_return decl10 =null;


        Object char_literal9_tree=null;
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl");
        try {
            // SimpleC.g:39:9: ( ( decl ( ',' decl )* )? -> ^( DECL_LIST ( decl )* ) )
            // SimpleC.g:39:11: ( decl ( ',' decl )* )?
            {
            // SimpleC.g:39:11: ( decl ( ',' decl )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==56) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // SimpleC.g:39:13: decl ( ',' decl )*
                    {
                    pushFollow(FOLLOW_decl_in_declList134);
                    decl8=decl();

                    state._fsp--;

                    stream_decl.add(decl8.getTree());

                    // SimpleC.g:39:18: ( ',' decl )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==50) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // SimpleC.g:39:20: ',' decl
                    	    {
                    	    char_literal9=(Token)match(input,50,FOLLOW_50_in_declList138);  
                    	    stream_50.add(char_literal9);


                    	    pushFollow(FOLLOW_decl_in_declList140);
                    	    decl10=decl();

                    	    state._fsp--;

                    	    stream_decl.add(decl10.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            // AST REWRITE
            // elements: decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 39:33: -> ^( DECL_LIST ( decl )* )
            {
                // SimpleC.g:39:36: ^( DECL_LIST ( decl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECL_LIST, "DECL_LIST")
                , root_1);

                // SimpleC.g:39:48: ( decl )*
                while ( stream_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_decl.nextTree());

                }
                stream_decl.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declList"


    public static class compoundStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compoundStmt"
    // SimpleC.g:42:1: compoundStmt : ( statement )* -> ^( COMPOUND_STATEMENT ( statement )* ) ;
    public final SimpleCParser.compoundStmt_return compoundStmt() throws RecognitionException {
        SimpleCParser.compoundStmt_return retval = new SimpleCParser.compoundStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SimpleCParser.statement_return statement11 =null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // SimpleC.g:42:13: ( ( statement )* -> ^( COMPOUND_STATEMENT ( statement )* ) )
            // SimpleC.g:43:2: ( statement )*
            {
            // SimpleC.g:43:2: ( statement )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ASSERT||LA3_0==ASSUME||(LA3_0 >= HAVOC && LA3_0 <= IF)||LA3_0==WHILE||LA3_0==52||LA3_0==56||LA3_0==59) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // SimpleC.g:43:2: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_compoundStmt162);
            	    statement11=statement();

            	    state._fsp--;

            	    stream_statement.add(statement11.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 43:16: -> ^( COMPOUND_STATEMENT ( statement )* )
            {
                // SimpleC.g:43:19: ^( COMPOUND_STATEMENT ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMPOUND_STATEMENT, "COMPOUND_STATEMENT")
                , root_1);

                // SimpleC.g:43:40: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compoundStmt"


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // SimpleC.g:46:1: statement : ( terminatedStatement ';' !| nonterminatedStatement ) ;
    public final SimpleCParser.statement_return statement() throws RecognitionException {
        SimpleCParser.statement_return retval = new SimpleCParser.statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal13=null;
        SimpleCParser.terminatedStatement_return terminatedStatement12 =null;

        SimpleCParser.nonterminatedStatement_return nonterminatedStatement14 =null;


        Object char_literal13_tree=null;

        try {
            // SimpleC.g:46:10: ( ( terminatedStatement ';' !| nonterminatedStatement ) )
            // SimpleC.g:47:2: ( terminatedStatement ';' !| nonterminatedStatement )
            {
            root_0 = (Object)adaptor.nil();


            // SimpleC.g:47:2: ( terminatedStatement ';' !| nonterminatedStatement )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ASSERT||LA4_0==ASSUME||(LA4_0 >= HAVOC && LA4_0 <= ID)||LA4_0==52||LA4_0==56) ) {
                alt4=1;
            }
            else if ( (LA4_0==IF||LA4_0==WHILE||LA4_0==59) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // SimpleC.g:47:2: terminatedStatement ';' !
                    {
                    pushFollow(FOLLOW_terminatedStatement_in_statement184);
                    terminatedStatement12=terminatedStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, terminatedStatement12.getTree());

                    char_literal13=(Token)match(input,52,FOLLOW_52_in_statement186); 

                    }
                    break;
                case 2 :
                    // SimpleC.g:48:4: nonterminatedStatement
                    {
                    pushFollow(FOLLOW_nonterminatedStatement_in_statement192);
                    nonterminatedStatement14=nonterminatedStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, nonterminatedStatement14.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class nonterminatedStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nonterminatedStatement"
    // SimpleC.g:51:1: nonterminatedStatement : ( block | ifStatement | whileStatement );
    public final SimpleCParser.nonterminatedStatement_return nonterminatedStatement() throws RecognitionException {
        SimpleCParser.nonterminatedStatement_return retval = new SimpleCParser.nonterminatedStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SimpleCParser.block_return block15 =null;

        SimpleCParser.ifStatement_return ifStatement16 =null;

        SimpleCParser.whileStatement_return whileStatement17 =null;



        try {
            // SimpleC.g:51:23: ( block | ifStatement | whileStatement )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt5=1;
                }
                break;
            case IF:
                {
                alt5=2;
                }
                break;
            case WHILE:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // SimpleC.g:52:4: block
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_block_in_nonterminatedStatement204);
                    block15=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block15.getTree());

                    }
                    break;
                case 2 :
                    // SimpleC.g:53:4: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ifStatement_in_nonterminatedStatement209);
                    ifStatement16=ifStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStatement16.getTree());

                    }
                    break;
                case 3 :
                    // SimpleC.g:54:4: whileStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_whileStatement_in_nonterminatedStatement214);
                    whileStatement17=whileStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, whileStatement17.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nonterminatedStatement"


    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // SimpleC.g:57:1: block : '{' compoundStmt '}' -> ^( BLOCK ( compoundStmt )? ) ;
    public final SimpleCParser.block_return block() throws RecognitionException {
        SimpleCParser.block_return retval = new SimpleCParser.block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal18=null;
        Token char_literal20=null;
        SimpleCParser.compoundStmt_return compoundStmt19 =null;


        Object char_literal18_tree=null;
        Object char_literal20_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_compoundStmt=new RewriteRuleSubtreeStream(adaptor,"rule compoundStmt");
        try {
            // SimpleC.g:57:6: ( '{' compoundStmt '}' -> ^( BLOCK ( compoundStmt )? ) )
            // SimpleC.g:58:2: '{' compoundStmt '}'
            {
            char_literal18=(Token)match(input,59,FOLLOW_59_in_block223);  
            stream_59.add(char_literal18);


            pushFollow(FOLLOW_compoundStmt_in_block225);
            compoundStmt19=compoundStmt();

            state._fsp--;

            stream_compoundStmt.add(compoundStmt19.getTree());

            char_literal20=(Token)match(input,60,FOLLOW_60_in_block227);  
            stream_60.add(char_literal20);


            // AST REWRITE
            // elements: compoundStmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 58:23: -> ^( BLOCK ( compoundStmt )? )
            {
                // SimpleC.g:58:26: ^( BLOCK ( compoundStmt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                // SimpleC.g:58:34: ( compoundStmt )?
                if ( stream_compoundStmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_compoundStmt.nextTree());

                }
                stream_compoundStmt.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block"


    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifStatement"
    // SimpleC.g:61:1: ifStatement : IF ^ '(' ! expr ')' ! statement ( options {greedy=true; } : 'else' ! statement )? ;
    public final SimpleCParser.ifStatement_return ifStatement() throws RecognitionException {
        SimpleCParser.ifStatement_return retval = new SimpleCParser.ifStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF21=null;
        Token char_literal22=null;
        Token char_literal24=null;
        Token string_literal26=null;
        SimpleCParser.expr_return expr23 =null;

        SimpleCParser.statement_return statement25 =null;

        SimpleCParser.statement_return statement27 =null;


        Object IF21_tree=null;
        Object char_literal22_tree=null;
        Object char_literal24_tree=null;
        Object string_literal26_tree=null;

        try {
            // SimpleC.g:61:12: ( IF ^ '(' ! expr ')' ! statement ( options {greedy=true; } : 'else' ! statement )? )
            // SimpleC.g:62:2: IF ^ '(' ! expr ')' ! statement ( options {greedy=true; } : 'else' ! statement )?
            {
            root_0 = (Object)adaptor.nil();


            IF21=(Token)match(input,IF,FOLLOW_IF_in_ifStatement245); 
            IF21_tree = 
            (Object)adaptor.create(IF21)
            ;
            root_0 = (Object)adaptor.becomeRoot(IF21_tree, root_0);


            char_literal22=(Token)match(input,48,FOLLOW_48_in_ifStatement248); 

            pushFollow(FOLLOW_expr_in_ifStatement251);
            expr23=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr23.getTree());

            char_literal24=(Token)match(input,49,FOLLOW_49_in_ifStatement253); 

            pushFollow(FOLLOW_statement_in_ifStatement256);
            statement25=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement25.getTree());

            // SimpleC.g:62:31: ( options {greedy=true; } : 'else' ! statement )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==55) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // SimpleC.g:62:57: 'else' ! statement
                    {
                    string_literal26=(Token)match(input,55,FOLLOW_55_in_ifStatement268); 

                    pushFollow(FOLLOW_statement_in_ifStatement271);
                    statement27=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement27.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifStatement"


    public static class whileStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileStatement"
    // SimpleC.g:65:1: whileStatement : WHILE ^ '(' ! expr ')' ! bound invariantList statement ;
    public final SimpleCParser.whileStatement_return whileStatement() throws RecognitionException {
        SimpleCParser.whileStatement_return retval = new SimpleCParser.whileStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHILE28=null;
        Token char_literal29=null;
        Token char_literal31=null;
        SimpleCParser.expr_return expr30 =null;

        SimpleCParser.bound_return bound32 =null;

        SimpleCParser.invariantList_return invariantList33 =null;

        SimpleCParser.statement_return statement34 =null;


        Object WHILE28_tree=null;
        Object char_literal29_tree=null;
        Object char_literal31_tree=null;

        try {
            // SimpleC.g:65:15: ( WHILE ^ '(' ! expr ')' ! bound invariantList statement )
            // SimpleC.g:66:2: WHILE ^ '(' ! expr ')' ! bound invariantList statement
            {
            root_0 = (Object)adaptor.nil();


            WHILE28=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement282); 
            WHILE28_tree = 
            (Object)adaptor.create(WHILE28)
            ;
            root_0 = (Object)adaptor.becomeRoot(WHILE28_tree, root_0);


            char_literal29=(Token)match(input,48,FOLLOW_48_in_whileStatement285); 

            pushFollow(FOLLOW_expr_in_whileStatement288);
            expr30=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr30.getTree());

            char_literal31=(Token)match(input,49,FOLLOW_49_in_whileStatement290); 

            pushFollow(FOLLOW_bound_in_whileStatement293);
            bound32=bound();

            state._fsp--;

            adaptor.addChild(root_0, bound32.getTree());

            pushFollow(FOLLOW_invariantList_in_whileStatement295);
            invariantList33=invariantList();

            state._fsp--;

            adaptor.addChild(root_0, invariantList33.getTree());

            pushFollow(FOLLOW_statement_in_whileStatement297);
            statement34=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement34.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whileStatement"


    public static class invariantList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "invariantList"
    // SimpleC.g:69:1: invariantList : ( invariant )* -> ^( INVARIANT_LIST ( invariant )* ) ;
    public final SimpleCParser.invariantList_return invariantList() throws RecognitionException {
        SimpleCParser.invariantList_return retval = new SimpleCParser.invariantList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SimpleCParser.invariant_return invariant35 =null;


        RewriteRuleSubtreeStream stream_invariant=new RewriteRuleSubtreeStream(adaptor,"rule invariant");
        try {
            // SimpleC.g:69:14: ( ( invariant )* -> ^( INVARIANT_LIST ( invariant )* ) )
            // SimpleC.g:69:16: ( invariant )*
            {
            // SimpleC.g:69:16: ( invariant )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==54||LA7_0==57) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // SimpleC.g:69:16: invariant
            	    {
            	    pushFollow(FOLLOW_invariant_in_invariantList305);
            	    invariant35=invariant();

            	    state._fsp--;

            	    stream_invariant.add(invariant35.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // AST REWRITE
            // elements: invariant
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 69:27: -> ^( INVARIANT_LIST ( invariant )* )
            {
                // SimpleC.g:69:30: ^( INVARIANT_LIST ( invariant )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INVARIANT_LIST, "INVARIANT_LIST")
                , root_1);

                // SimpleC.g:69:47: ( invariant )*
                while ( stream_invariant.hasNext() ) {
                    adaptor.addChild(root_1, stream_invariant.nextTree());

                }
                stream_invariant.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "invariantList"


    public static class invariant_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "invariant"
    // SimpleC.g:71:1: invariant : ( 'inv' '(' expr ')' -> ^( REQUIRED_INV expr ) | 'cand' '(' expr ')' -> ^( CANDIDATE_INV expr ) );
    public final SimpleCParser.invariant_return invariant() throws RecognitionException {
        SimpleCParser.invariant_return retval = new SimpleCParser.invariant_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal36=null;
        Token char_literal37=null;
        Token char_literal39=null;
        Token string_literal40=null;
        Token char_literal41=null;
        Token char_literal43=null;
        SimpleCParser.expr_return expr38 =null;

        SimpleCParser.expr_return expr42 =null;


        Object string_literal36_tree=null;
        Object char_literal37_tree=null;
        Object char_literal39_tree=null;
        Object string_literal40_tree=null;
        Object char_literal41_tree=null;
        Object char_literal43_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // SimpleC.g:71:10: ( 'inv' '(' expr ')' -> ^( REQUIRED_INV expr ) | 'cand' '(' expr ')' -> ^( CANDIDATE_INV expr ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==57) ) {
                alt8=1;
            }
            else if ( (LA8_0==54) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // SimpleC.g:72:5: 'inv' '(' expr ')'
                    {
                    string_literal36=(Token)match(input,57,FOLLOW_57_in_invariant327);  
                    stream_57.add(string_literal36);


                    char_literal37=(Token)match(input,48,FOLLOW_48_in_invariant330);  
                    stream_48.add(char_literal37);


                    pushFollow(FOLLOW_expr_in_invariant332);
                    expr38=expr();

                    state._fsp--;

                    stream_expr.add(expr38.getTree());

                    char_literal39=(Token)match(input,49,FOLLOW_49_in_invariant334);  
                    stream_49.add(char_literal39);


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 72:25: -> ^( REQUIRED_INV expr )
                    {
                        // SimpleC.g:72:28: ^( REQUIRED_INV expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(REQUIRED_INV, "REQUIRED_INV")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // SimpleC.g:73:5: 'cand' '(' expr ')'
                    {
                    string_literal40=(Token)match(input,54,FOLLOW_54_in_invariant348);  
                    stream_54.add(string_literal40);


                    char_literal41=(Token)match(input,48,FOLLOW_48_in_invariant350);  
                    stream_48.add(char_literal41);


                    pushFollow(FOLLOW_expr_in_invariant352);
                    expr42=expr();

                    state._fsp--;

                    stream_expr.add(expr42.getTree());

                    char_literal43=(Token)match(input,49,FOLLOW_49_in_invariant354);  
                    stream_49.add(char_literal43);


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 73:25: -> ^( CANDIDATE_INV expr )
                    {
                        // SimpleC.g:73:28: ^( CANDIDATE_INV expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CANDIDATE_INV, "CANDIDATE_INV")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "invariant"


    public static class bound_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bound"
    // SimpleC.g:76:1: bound : ( 'bound' '(' NUMBER ')' )? -> ^( BOUND ( NUMBER )? ) ;
    public final SimpleCParser.bound_return bound() throws RecognitionException {
        SimpleCParser.bound_return retval = new SimpleCParser.bound_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal44=null;
        Token char_literal45=null;
        Token NUMBER46=null;
        Token char_literal47=null;

        Object string_literal44_tree=null;
        Object char_literal45_tree=null;
        Object NUMBER46_tree=null;
        Object char_literal47_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");

        try {
            // SimpleC.g:76:6: ( ( 'bound' '(' NUMBER ')' )? -> ^( BOUND ( NUMBER )? ) )
            // SimpleC.g:76:8: ( 'bound' '(' NUMBER ')' )?
            {
            // SimpleC.g:76:8: ( 'bound' '(' NUMBER ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==53) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // SimpleC.g:76:9: 'bound' '(' NUMBER ')'
                    {
                    string_literal44=(Token)match(input,53,FOLLOW_53_in_bound371);  
                    stream_53.add(string_literal44);


                    char_literal45=(Token)match(input,48,FOLLOW_48_in_bound373);  
                    stream_48.add(char_literal45);


                    NUMBER46=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_bound375);  
                    stream_NUMBER.add(NUMBER46);


                    char_literal47=(Token)match(input,49,FOLLOW_49_in_bound377);  
                    stream_49.add(char_literal47);


                    }
                    break;

            }


            // AST REWRITE
            // elements: NUMBER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 76:35: -> ^( BOUND ( NUMBER )? )
            {
                // SimpleC.g:76:38: ^( BOUND ( NUMBER )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BOUND, "BOUND")
                , root_1);

                // SimpleC.g:76:46: ( NUMBER )?
                if ( stream_NUMBER.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_NUMBER.nextNode()
                    );

                }
                stream_NUMBER.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bound"


    public static class terminatedStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "terminatedStatement"
    // SimpleC.g:78:1: terminatedStatement : ( assigmentStmt | assertStmt | havocStmt | decl | assumeStmt | -> ^( EMPTY_STMT ) );
    public final SimpleCParser.terminatedStatement_return terminatedStatement() throws RecognitionException {
        SimpleCParser.terminatedStatement_return retval = new SimpleCParser.terminatedStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SimpleCParser.assigmentStmt_return assigmentStmt48 =null;

        SimpleCParser.assertStmt_return assertStmt49 =null;

        SimpleCParser.havocStmt_return havocStmt50 =null;

        SimpleCParser.decl_return decl51 =null;

        SimpleCParser.assumeStmt_return assumeStmt52 =null;



        try {
            // SimpleC.g:78:20: ( assigmentStmt | assertStmt | havocStmt | decl | assumeStmt | -> ^( EMPTY_STMT ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt10=1;
                }
                break;
            case ASSERT:
                {
                alt10=2;
                }
                break;
            case HAVOC:
                {
                alt10=3;
                }
                break;
            case 56:
                {
                alt10=4;
                }
                break;
            case ASSUME:
                {
                alt10=5;
                }
                break;
            case 52:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // SimpleC.g:79:3: assigmentStmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assigmentStmt_in_terminatedStatement399);
                    assigmentStmt48=assigmentStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, assigmentStmt48.getTree());

                    }
                    break;
                case 2 :
                    // SimpleC.g:80:5: assertStmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assertStmt_in_terminatedStatement405);
                    assertStmt49=assertStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, assertStmt49.getTree());

                    }
                    break;
                case 3 :
                    // SimpleC.g:81:5: havocStmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_havocStmt_in_terminatedStatement411);
                    havocStmt50=havocStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, havocStmt50.getTree());

                    }
                    break;
                case 4 :
                    // SimpleC.g:82:5: decl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_decl_in_terminatedStatement417);
                    decl51=decl();

                    state._fsp--;

                    adaptor.addChild(root_0, decl51.getTree());

                    }
                    break;
                case 5 :
                    // SimpleC.g:83:5: assumeStmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assumeStmt_in_terminatedStatement423);
                    assumeStmt52=assumeStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, assumeStmt52.getTree());

                    }
                    break;
                case 6 :
                    // SimpleC.g:84:6: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 84:6: -> ^( EMPTY_STMT )
                    {
                        // SimpleC.g:84:9: ^( EMPTY_STMT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EMPTY_STMT, "EMPTY_STMT")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "terminatedStatement"


    public static class assumeStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assumeStmt"
    // SimpleC.g:87:1: assumeStmt : ASSUME ^ '(' ! expr ')' !;
    public final SimpleCParser.assumeStmt_return assumeStmt() throws RecognitionException {
        SimpleCParser.assumeStmt_return retval = new SimpleCParser.assumeStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ASSUME53=null;
        Token char_literal54=null;
        Token char_literal56=null;
        SimpleCParser.expr_return expr55 =null;


        Object ASSUME53_tree=null;
        Object char_literal54_tree=null;
        Object char_literal56_tree=null;

        try {
            // SimpleC.g:87:11: ( ASSUME ^ '(' ! expr ')' !)
            // SimpleC.g:88:3: ASSUME ^ '(' ! expr ')' !
            {
            root_0 = (Object)adaptor.nil();


            ASSUME53=(Token)match(input,ASSUME,FOLLOW_ASSUME_in_assumeStmt444); 
            ASSUME53_tree = 
            (Object)adaptor.create(ASSUME53)
            ;
            root_0 = (Object)adaptor.becomeRoot(ASSUME53_tree, root_0);


            char_literal54=(Token)match(input,48,FOLLOW_48_in_assumeStmt447); 

            pushFollow(FOLLOW_expr_in_assumeStmt450);
            expr55=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr55.getTree());

            char_literal56=(Token)match(input,49,FOLLOW_49_in_assumeStmt452); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assumeStmt"


    public static class havocStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "havocStmt"
    // SimpleC.g:91:1: havocStmt : HAVOC ^ '(' ! ID ')' !;
    public final SimpleCParser.havocStmt_return havocStmt() throws RecognitionException {
        SimpleCParser.havocStmt_return retval = new SimpleCParser.havocStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token HAVOC57=null;
        Token char_literal58=null;
        Token ID59=null;
        Token char_literal60=null;

        Object HAVOC57_tree=null;
        Object char_literal58_tree=null;
        Object ID59_tree=null;
        Object char_literal60_tree=null;

        try {
            // SimpleC.g:91:10: ( HAVOC ^ '(' ! ID ')' !)
            // SimpleC.g:92:2: HAVOC ^ '(' ! ID ')' !
            {
            root_0 = (Object)adaptor.nil();


            HAVOC57=(Token)match(input,HAVOC,FOLLOW_HAVOC_in_havocStmt462); 
            HAVOC57_tree = 
            (Object)adaptor.create(HAVOC57)
            ;
            root_0 = (Object)adaptor.becomeRoot(HAVOC57_tree, root_0);


            char_literal58=(Token)match(input,48,FOLLOW_48_in_havocStmt465); 

            ID59=(Token)match(input,ID,FOLLOW_ID_in_havocStmt468); 
            ID59_tree = 
            (Object)adaptor.create(ID59)
            ;
            adaptor.addChild(root_0, ID59_tree);


            char_literal60=(Token)match(input,49,FOLLOW_49_in_havocStmt470); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "havocStmt"


    public static class decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "decl"
    // SimpleC.g:95:1: decl : typename ID -> ^( DECL[$ID] ID typename ) ;
    public final SimpleCParser.decl_return decl() throws RecognitionException {
        SimpleCParser.decl_return retval = new SimpleCParser.decl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID62=null;
        SimpleCParser.typename_return typename61 =null;


        Object ID62_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_typename=new RewriteRuleSubtreeStream(adaptor,"rule typename");
        try {
            // SimpleC.g:95:5: ( typename ID -> ^( DECL[$ID] ID typename ) )
            // SimpleC.g:96:2: typename ID
            {
            pushFollow(FOLLOW_typename_in_decl480);
            typename61=typename();

            state._fsp--;

            stream_typename.add(typename61.getTree());

            ID62=(Token)match(input,ID,FOLLOW_ID_in_decl482);  
            stream_ID.add(ID62);


            // AST REWRITE
            // elements: ID, typename
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 96:14: -> ^( DECL[$ID] ID typename )
            {
                // SimpleC.g:96:17: ^( DECL[$ID] ID typename )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECL, ID62)
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_typename.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "decl"


    public static class typename_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typename"
    // SimpleC.g:99:1: typename : 'int' ;
    public final SimpleCParser.typename_return typename() throws RecognitionException {
        SimpleCParser.typename_return retval = new SimpleCParser.typename_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal63=null;

        Object string_literal63_tree=null;

        try {
            // SimpleC.g:99:9: ( 'int' )
            // SimpleC.g:99:11: 'int'
            {
            root_0 = (Object)adaptor.nil();


            string_literal63=(Token)match(input,56,FOLLOW_56_in_typename501); 
            string_literal63_tree = 
            (Object)adaptor.create(string_literal63)
            ;
            adaptor.addChild(root_0, string_literal63_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typename"


    public static class assigmentStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assigmentStmt"
    // SimpleC.g:101:1: assigmentStmt : ID ASSIGNMENT ^ expr ;
    public final SimpleCParser.assigmentStmt_return assigmentStmt() throws RecognitionException {
        SimpleCParser.assigmentStmt_return retval = new SimpleCParser.assigmentStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID64=null;
        Token ASSIGNMENT65=null;
        SimpleCParser.expr_return expr66 =null;


        Object ID64_tree=null;
        Object ASSIGNMENT65_tree=null;

        try {
            // SimpleC.g:101:14: ( ID ASSIGNMENT ^ expr )
            // SimpleC.g:102:2: ID ASSIGNMENT ^ expr
            {
            root_0 = (Object)adaptor.nil();


            ID64=(Token)match(input,ID,FOLLOW_ID_in_assigmentStmt509); 
            ID64_tree = 
            (Object)adaptor.create(ID64)
            ;
            adaptor.addChild(root_0, ID64_tree);


            ASSIGNMENT65=(Token)match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assigmentStmt511); 
            ASSIGNMENT65_tree = 
            (Object)adaptor.create(ASSIGNMENT65)
            ;
            root_0 = (Object)adaptor.becomeRoot(ASSIGNMENT65_tree, root_0);


            pushFollow(FOLLOW_expr_in_assigmentStmt514);
            expr66=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr66.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assigmentStmt"


    public static class assertStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assertStmt"
    // SimpleC.g:105:1: assertStmt : ASSERT ^ '(' ! expr ')' !;
    public final SimpleCParser.assertStmt_return assertStmt() throws RecognitionException {
        SimpleCParser.assertStmt_return retval = new SimpleCParser.assertStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ASSERT67=null;
        Token char_literal68=null;
        Token char_literal70=null;
        SimpleCParser.expr_return expr69 =null;


        Object ASSERT67_tree=null;
        Object char_literal68_tree=null;
        Object char_literal70_tree=null;

        try {
            // SimpleC.g:105:11: ( ASSERT ^ '(' ! expr ')' !)
            // SimpleC.g:106:2: ASSERT ^ '(' ! expr ')' !
            {
            root_0 = (Object)adaptor.nil();


            ASSERT67=(Token)match(input,ASSERT,FOLLOW_ASSERT_in_assertStmt523); 
            ASSERT67_tree = 
            (Object)adaptor.create(ASSERT67)
            ;
            root_0 = (Object)adaptor.becomeRoot(ASSERT67_tree, root_0);


            char_literal68=(Token)match(input,48,FOLLOW_48_in_assertStmt526); 

            pushFollow(FOLLOW_expr_in_assertStmt529);
            expr69=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr69.getTree());

            char_literal70=(Token)match(input,49,FOLLOW_49_in_assertStmt531); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assertStmt"


    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // SimpleC.g:110:1: expr : ternExp ;
    public final SimpleCParser.expr_return expr() throws RecognitionException {
        SimpleCParser.expr_return retval = new SimpleCParser.expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SimpleCParser.ternExp_return ternExp71 =null;



        try {
            // SimpleC.g:110:5: ( ternExp )
            // SimpleC.g:110:6: ternExp
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_ternExp_in_expr540);
            ternExp71=ternExp();

            state._fsp--;

            adaptor.addChild(root_0, ternExp71.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class ternExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ternExp"
    // SimpleC.g:112:1: ternExp : lorExp ( TERNARY ^ lorExp ':' ! lorExp )* ;
    public final SimpleCParser.ternExp_return ternExp() throws RecognitionException {
        SimpleCParser.ternExp_return retval = new SimpleCParser.ternExp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TERNARY73=null;
        Token char_literal75=null;
        SimpleCParser.lorExp_return lorExp72 =null;

        SimpleCParser.lorExp_return lorExp74 =null;

        SimpleCParser.lorExp_return lorExp76 =null;


        Object TERNARY73_tree=null;
        Object char_literal75_tree=null;

        try {
            // SimpleC.g:112:8: ( lorExp ( TERNARY ^ lorExp ':' ! lorExp )* )
            // SimpleC.g:112:10: lorExp ( TERNARY ^ lorExp ':' ! lorExp )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_lorExp_in_ternExp547);
            lorExp72=lorExp();

            state._fsp--;

            adaptor.addChild(root_0, lorExp72.getTree());

            // SimpleC.g:112:17: ( TERNARY ^ lorExp ':' ! lorExp )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==TERNARY) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // SimpleC.g:112:18: TERNARY ^ lorExp ':' ! lorExp
            	    {
            	    TERNARY73=(Token)match(input,TERNARY,FOLLOW_TERNARY_in_ternExp550); 
            	    TERNARY73_tree = 
            	    (Object)adaptor.create(TERNARY73)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(TERNARY73_tree, root_0);


            	    pushFollow(FOLLOW_lorExp_in_ternExp553);
            	    lorExp74=lorExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, lorExp74.getTree());

            	    char_literal75=(Token)match(input,51,FOLLOW_51_in_ternExp555); 

            	    pushFollow(FOLLOW_lorExp_in_ternExp558);
            	    lorExp76=lorExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, lorExp76.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ternExp"


    public static class lorExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lorExp"
    // SimpleC.g:114:1: lorExp : landExp ( LOR ^ landExp )* ;
    public final SimpleCParser.lorExp_return lorExp() throws RecognitionException {
        SimpleCParser.lorExp_return retval = new SimpleCParser.lorExp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LOR78=null;
        SimpleCParser.landExp_return landExp77 =null;

        SimpleCParser.landExp_return landExp79 =null;


        Object LOR78_tree=null;

        try {
            // SimpleC.g:114:7: ( landExp ( LOR ^ landExp )* )
            // SimpleC.g:114:9: landExp ( LOR ^ landExp )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_landExp_in_lorExp567);
            landExp77=landExp();

            state._fsp--;

            adaptor.addChild(root_0, landExp77.getTree());

            // SimpleC.g:114:17: ( LOR ^ landExp )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==LOR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // SimpleC.g:114:18: LOR ^ landExp
            	    {
            	    LOR78=(Token)match(input,LOR,FOLLOW_LOR_in_lorExp570); 
            	    LOR78_tree = 
            	    (Object)adaptor.create(LOR78)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(LOR78_tree, root_0);


            	    pushFollow(FOLLOW_landExp_in_lorExp573);
            	    landExp79=landExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, landExp79.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lorExp"


    public static class landExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "landExp"
    // SimpleC.g:116:1: landExp : borExp ( LAND ^ borExp )* ;
    public final SimpleCParser.landExp_return landExp() throws RecognitionException {
        SimpleCParser.landExp_return retval = new SimpleCParser.landExp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LAND81=null;
        SimpleCParser.borExp_return borExp80 =null;

        SimpleCParser.borExp_return borExp82 =null;


        Object LAND81_tree=null;

        try {
            // SimpleC.g:116:8: ( borExp ( LAND ^ borExp )* )
            // SimpleC.g:116:10: borExp ( LAND ^ borExp )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_borExp_in_landExp582);
            borExp80=borExp();

            state._fsp--;

            adaptor.addChild(root_0, borExp80.getTree());

            // SimpleC.g:116:17: ( LAND ^ borExp )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==LAND) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // SimpleC.g:116:18: LAND ^ borExp
            	    {
            	    LAND81=(Token)match(input,LAND,FOLLOW_LAND_in_landExp585); 
            	    LAND81_tree = 
            	    (Object)adaptor.create(LAND81)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(LAND81_tree, root_0);


            	    pushFollow(FOLLOW_borExp_in_landExp588);
            	    borExp82=borExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, borExp82.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "landExp"


    public static class borExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "borExp"
    // SimpleC.g:118:1: borExp : bxorExp ( BOR ^ bxorExp )* ;
    public final SimpleCParser.borExp_return borExp() throws RecognitionException {
        SimpleCParser.borExp_return retval = new SimpleCParser.borExp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BOR84=null;
        SimpleCParser.bxorExp_return bxorExp83 =null;

        SimpleCParser.bxorExp_return bxorExp85 =null;


        Object BOR84_tree=null;

        try {
            // SimpleC.g:118:7: ( bxorExp ( BOR ^ bxorExp )* )
            // SimpleC.g:118:9: bxorExp ( BOR ^ bxorExp )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bxorExp_in_borExp597);
            bxorExp83=bxorExp();

            state._fsp--;

            adaptor.addChild(root_0, bxorExp83.getTree());

            // SimpleC.g:118:17: ( BOR ^ bxorExp )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==BOR) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // SimpleC.g:118:18: BOR ^ bxorExp
            	    {
            	    BOR84=(Token)match(input,BOR,FOLLOW_BOR_in_borExp600); 
            	    BOR84_tree = 
            	    (Object)adaptor.create(BOR84)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(BOR84_tree, root_0);


            	    pushFollow(FOLLOW_bxorExp_in_borExp603);
            	    bxorExp85=bxorExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bxorExp85.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "borExp"


    public static class bxorExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bxorExp"
    // SimpleC.g:120:1: bxorExp : bandExp ( BXOR ^ bandExp )* ;
    public final SimpleCParser.bxorExp_return bxorExp() throws RecognitionException {
        SimpleCParser.bxorExp_return retval = new SimpleCParser.bxorExp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BXOR87=null;
        SimpleCParser.bandExp_return bandExp86 =null;

        SimpleCParser.bandExp_return bandExp88 =null;


        Object BXOR87_tree=null;

        try {
            // SimpleC.g:120:8: ( bandExp ( BXOR ^ bandExp )* )
            // SimpleC.g:120:10: bandExp ( BXOR ^ bandExp )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bandExp_in_bxorExp612);
            bandExp86=bandExp();

            state._fsp--;

            adaptor.addChild(root_0, bandExp86.getTree());

            // SimpleC.g:120:18: ( BXOR ^ bandExp )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==BXOR) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // SimpleC.g:120:19: BXOR ^ bandExp
            	    {
            	    BXOR87=(Token)match(input,BXOR,FOLLOW_BXOR_in_bxorExp615); 
            	    BXOR87_tree = 
            	    (Object)adaptor.create(BXOR87)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(BXOR87_tree, root_0);


            	    pushFollow(FOLLOW_bandExp_in_bxorExp618);
            	    bandExp88=bandExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bandExp88.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bxorExp"


    public static class bandExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bandExp"
    // SimpleC.g:122:1: bandExp : equalityExp ( BAND ^ equalityExp )* ;
    public final SimpleCParser.bandExp_return bandExp() throws RecognitionException {
        SimpleCParser.bandExp_return retval = new SimpleCParser.bandExp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BAND90=null;
        SimpleCParser.equalityExp_return equalityExp89 =null;

        SimpleCParser.equalityExp_return equalityExp91 =null;


        Object BAND90_tree=null;

        try {
            // SimpleC.g:122:8: ( equalityExp ( BAND ^ equalityExp )* )
            // SimpleC.g:122:10: equalityExp ( BAND ^ equalityExp )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_equalityExp_in_bandExp627);
            equalityExp89=equalityExp();

            state._fsp--;

            adaptor.addChild(root_0, equalityExp89.getTree());

            // SimpleC.g:122:22: ( BAND ^ equalityExp )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==BAND) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // SimpleC.g:122:23: BAND ^ equalityExp
            	    {
            	    BAND90=(Token)match(input,BAND,FOLLOW_BAND_in_bandExp630); 
            	    BAND90_tree = 
            	    (Object)adaptor.create(BAND90)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(BAND90_tree, root_0);


            	    pushFollow(FOLLOW_equalityExp_in_bandExp633);
            	    equalityExp91=equalityExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, equalityExp91.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bandExp"


    public static class equalityExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalityExp"
    // SimpleC.g:124:1: equalityExp : relExp ( EQUAL ^ relExp | NEQUAL ^ relExp )* ;
    public final SimpleCParser.equalityExp_return equalityExp() throws RecognitionException {
        SimpleCParser.equalityExp_return retval = new SimpleCParser.equalityExp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUAL93=null;
        Token NEQUAL95=null;
        SimpleCParser.relExp_return relExp92 =null;

        SimpleCParser.relExp_return relExp94 =null;

        SimpleCParser.relExp_return relExp96 =null;


        Object EQUAL93_tree=null;
        Object NEQUAL95_tree=null;

        try {
            // SimpleC.g:124:12: ( relExp ( EQUAL ^ relExp | NEQUAL ^ relExp )* )
            // SimpleC.g:125:2: relExp ( EQUAL ^ relExp | NEQUAL ^ relExp )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_relExp_in_equalityExp643);
            relExp92=relExp();

            state._fsp--;

            adaptor.addChild(root_0, relExp92.getTree());

            // SimpleC.g:126:2: ( EQUAL ^ relExp | NEQUAL ^ relExp )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==EQUAL) ) {
                    alt17=1;
                }
                else if ( (LA17_0==NEQUAL) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // SimpleC.g:127:4: EQUAL ^ relExp
            	    {
            	    EQUAL93=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_equalityExp651); 
            	    EQUAL93_tree = 
            	    (Object)adaptor.create(EQUAL93)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(EQUAL93_tree, root_0);


            	    pushFollow(FOLLOW_relExp_in_equalityExp655);
            	    relExp94=relExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relExp94.getTree());

            	    }
            	    break;
            	case 2 :
            	    // SimpleC.g:128:4: NEQUAL ^ relExp
            	    {
            	    NEQUAL95=(Token)match(input,NEQUAL,FOLLOW_NEQUAL_in_equalityExp660); 
            	    NEQUAL95_tree = 
            	    (Object)adaptor.create(NEQUAL95)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(NEQUAL95_tree, root_0);


            	    pushFollow(FOLLOW_relExp_in_equalityExp663);
            	    relExp96=relExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relExp96.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "equalityExp"


    public static class relExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relExp"
    // SimpleC.g:132:1: relExp : shiftExp ( LT ^ shiftExp | LEQ ^ shiftExp | GT ^ shiftExp | GEQ ^ shiftExp )* ;
    public final SimpleCParser.relExp_return relExp() throws RecognitionException {
        SimpleCParser.relExp_return retval = new SimpleCParser.relExp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LT98=null;
        Token LEQ100=null;
        Token GT102=null;
        Token GEQ104=null;
        SimpleCParser.shiftExp_return shiftExp97 =null;

        SimpleCParser.shiftExp_return shiftExp99 =null;

        SimpleCParser.shiftExp_return shiftExp101 =null;

        SimpleCParser.shiftExp_return shiftExp103 =null;

        SimpleCParser.shiftExp_return shiftExp105 =null;


        Object LT98_tree=null;
        Object LEQ100_tree=null;
        Object GT102_tree=null;
        Object GEQ104_tree=null;

        try {
            // SimpleC.g:132:7: ( shiftExp ( LT ^ shiftExp | LEQ ^ shiftExp | GT ^ shiftExp | GEQ ^ shiftExp )* )
            // SimpleC.g:133:2: shiftExp ( LT ^ shiftExp | LEQ ^ shiftExp | GT ^ shiftExp | GEQ ^ shiftExp )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shiftExp_in_relExp677);
            shiftExp97=shiftExp();

            state._fsp--;

            adaptor.addChild(root_0, shiftExp97.getTree());

            // SimpleC.g:134:2: ( LT ^ shiftExp | LEQ ^ shiftExp | GT ^ shiftExp | GEQ ^ shiftExp )*
            loop18:
            do {
                int alt18=5;
                switch ( input.LA(1) ) {
                case LT:
                    {
                    alt18=1;
                    }
                    break;
                case LEQ:
                    {
                    alt18=2;
                    }
                    break;
                case GT:
                    {
                    alt18=3;
                    }
                    break;
                case GEQ:
                    {
                    alt18=4;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // SimpleC.g:135:4: LT ^ shiftExp
            	    {
            	    LT98=(Token)match(input,LT,FOLLOW_LT_in_relExp685); 
            	    LT98_tree = 
            	    (Object)adaptor.create(LT98)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(LT98_tree, root_0);


            	    pushFollow(FOLLOW_shiftExp_in_relExp689);
            	    shiftExp99=shiftExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, shiftExp99.getTree());

            	    }
            	    break;
            	case 2 :
            	    // SimpleC.g:136:4: LEQ ^ shiftExp
            	    {
            	    LEQ100=(Token)match(input,LEQ,FOLLOW_LEQ_in_relExp695); 
            	    LEQ100_tree = 
            	    (Object)adaptor.create(LEQ100)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(LEQ100_tree, root_0);


            	    pushFollow(FOLLOW_shiftExp_in_relExp698);
            	    shiftExp101=shiftExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, shiftExp101.getTree());

            	    }
            	    break;
            	case 3 :
            	    // SimpleC.g:137:4: GT ^ shiftExp
            	    {
            	    GT102=(Token)match(input,GT,FOLLOW_GT_in_relExp704); 
            	    GT102_tree = 
            	    (Object)adaptor.create(GT102)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(GT102_tree, root_0);


            	    pushFollow(FOLLOW_shiftExp_in_relExp708);
            	    shiftExp103=shiftExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, shiftExp103.getTree());

            	    }
            	    break;
            	case 4 :
            	    // SimpleC.g:138:4: GEQ ^ shiftExp
            	    {
            	    GEQ104=(Token)match(input,GEQ,FOLLOW_GEQ_in_relExp714); 
            	    GEQ104_tree = 
            	    (Object)adaptor.create(GEQ104)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(GEQ104_tree, root_0);


            	    pushFollow(FOLLOW_shiftExp_in_relExp717);
            	    shiftExp105=shiftExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, shiftExp105.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relExp"


    public static class shiftExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "shiftExp"
    // SimpleC.g:142:1: shiftExp : additionExp ( LSHIFT ^ additionExp | RSHIFT ^ additionExp )* ;
    public final SimpleCParser.shiftExp_return shiftExp() throws RecognitionException {
        SimpleCParser.shiftExp_return retval = new SimpleCParser.shiftExp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LSHIFT107=null;
        Token RSHIFT109=null;
        SimpleCParser.additionExp_return additionExp106 =null;

        SimpleCParser.additionExp_return additionExp108 =null;

        SimpleCParser.additionExp_return additionExp110 =null;


        Object LSHIFT107_tree=null;
        Object RSHIFT109_tree=null;

        try {
            // SimpleC.g:142:9: ( additionExp ( LSHIFT ^ additionExp | RSHIFT ^ additionExp )* )
            // SimpleC.g:143:3: additionExp ( LSHIFT ^ additionExp | RSHIFT ^ additionExp )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_additionExp_in_shiftExp732);
            additionExp106=additionExp();

            state._fsp--;

            adaptor.addChild(root_0, additionExp106.getTree());

            // SimpleC.g:144:3: ( LSHIFT ^ additionExp | RSHIFT ^ additionExp )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==LSHIFT) ) {
                    alt19=1;
                }
                else if ( (LA19_0==RSHIFT) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // SimpleC.g:145:5: LSHIFT ^ additionExp
            	    {
            	    LSHIFT107=(Token)match(input,LSHIFT,FOLLOW_LSHIFT_in_shiftExp742); 
            	    LSHIFT107_tree = 
            	    (Object)adaptor.create(LSHIFT107)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(LSHIFT107_tree, root_0);


            	    pushFollow(FOLLOW_additionExp_in_shiftExp745);
            	    additionExp108=additionExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, additionExp108.getTree());

            	    }
            	    break;
            	case 2 :
            	    // SimpleC.g:146:5: RSHIFT ^ additionExp
            	    {
            	    RSHIFT109=(Token)match(input,RSHIFT,FOLLOW_RSHIFT_in_shiftExp751); 
            	    RSHIFT109_tree = 
            	    (Object)adaptor.create(RSHIFT109)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(RSHIFT109_tree, root_0);


            	    pushFollow(FOLLOW_additionExp_in_shiftExp754);
            	    additionExp110=additionExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, additionExp110.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "shiftExp"


    public static class additionExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "additionExp"
    // SimpleC.g:150:1: additionExp : multiplyExp ( ADD ^ multiplyExp | SUBTRACT ^ multiplyExp )* ;
    public final SimpleCParser.additionExp_return additionExp() throws RecognitionException {
        SimpleCParser.additionExp_return retval = new SimpleCParser.additionExp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ADD112=null;
        Token SUBTRACT114=null;
        SimpleCParser.multiplyExp_return multiplyExp111 =null;

        SimpleCParser.multiplyExp_return multiplyExp113 =null;

        SimpleCParser.multiplyExp_return multiplyExp115 =null;


        Object ADD112_tree=null;
        Object SUBTRACT114_tree=null;

        try {
            // SimpleC.g:151:5: ( multiplyExp ( ADD ^ multiplyExp | SUBTRACT ^ multiplyExp )* )
            // SimpleC.g:151:10: multiplyExp ( ADD ^ multiplyExp | SUBTRACT ^ multiplyExp )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multiplyExp_in_additionExp775);
            multiplyExp111=multiplyExp();

            state._fsp--;

            adaptor.addChild(root_0, multiplyExp111.getTree());

            // SimpleC.g:152:10: ( ADD ^ multiplyExp | SUBTRACT ^ multiplyExp )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==ADD) ) {
                    alt20=1;
                }
                else if ( (LA20_0==SUBTRACT) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // SimpleC.g:152:12: ADD ^ multiplyExp
            	    {
            	    ADD112=(Token)match(input,ADD,FOLLOW_ADD_in_additionExp788); 
            	    ADD112_tree = 
            	    (Object)adaptor.create(ADD112)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(ADD112_tree, root_0);


            	    pushFollow(FOLLOW_multiplyExp_in_additionExp796);
            	    multiplyExp113=multiplyExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiplyExp113.getTree());

            	    }
            	    break;
            	case 2 :
            	    // SimpleC.g:153:12: SUBTRACT ^ multiplyExp
            	    {
            	    SUBTRACT114=(Token)match(input,SUBTRACT,FOLLOW_SUBTRACT_in_additionExp809); 
            	    SUBTRACT114_tree = 
            	    (Object)adaptor.create(SUBTRACT114)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(SUBTRACT114_tree, root_0);


            	    pushFollow(FOLLOW_multiplyExp_in_additionExp812);
            	    multiplyExp115=multiplyExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiplyExp115.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "additionExp"


    public static class multiplyExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplyExp"
    // SimpleC.g:157:1: multiplyExp : unaryExp ( MULTIPLY ^ unaryExp | DIVIDE ^ unaryExp | MOD ^ unaryExp )* ;
    public final SimpleCParser.multiplyExp_return multiplyExp() throws RecognitionException {
        SimpleCParser.multiplyExp_return retval = new SimpleCParser.multiplyExp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MULTIPLY117=null;
        Token DIVIDE119=null;
        Token MOD121=null;
        SimpleCParser.unaryExp_return unaryExp116 =null;

        SimpleCParser.unaryExp_return unaryExp118 =null;

        SimpleCParser.unaryExp_return unaryExp120 =null;

        SimpleCParser.unaryExp_return unaryExp122 =null;


        Object MULTIPLY117_tree=null;
        Object DIVIDE119_tree=null;
        Object MOD121_tree=null;

        try {
            // SimpleC.g:158:5: ( unaryExp ( MULTIPLY ^ unaryExp | DIVIDE ^ unaryExp | MOD ^ unaryExp )* )
            // SimpleC.g:158:10: unaryExp ( MULTIPLY ^ unaryExp | DIVIDE ^ unaryExp | MOD ^ unaryExp )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_unaryExp_in_multiplyExp844);
            unaryExp116=unaryExp();

            state._fsp--;

            adaptor.addChild(root_0, unaryExp116.getTree());

            // SimpleC.g:159:10: ( MULTIPLY ^ unaryExp | DIVIDE ^ unaryExp | MOD ^ unaryExp )*
            loop21:
            do {
                int alt21=4;
                switch ( input.LA(1) ) {
                case MULTIPLY:
                    {
                    alt21=1;
                    }
                    break;
                case DIVIDE:
                    {
                    alt21=2;
                    }
                    break;
                case MOD:
                    {
                    alt21=3;
                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // SimpleC.g:159:12: MULTIPLY ^ unaryExp
            	    {
            	    MULTIPLY117=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_multiplyExp857); 
            	    MULTIPLY117_tree = 
            	    (Object)adaptor.create(MULTIPLY117)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(MULTIPLY117_tree, root_0);


            	    pushFollow(FOLLOW_unaryExp_in_multiplyExp860);
            	    unaryExp118=unaryExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unaryExp118.getTree());

            	    }
            	    break;
            	case 2 :
            	    // SimpleC.g:160:12: DIVIDE ^ unaryExp
            	    {
            	    DIVIDE119=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multiplyExp873); 
            	    DIVIDE119_tree = 
            	    (Object)adaptor.create(DIVIDE119)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(DIVIDE119_tree, root_0);


            	    pushFollow(FOLLOW_unaryExp_in_multiplyExp878);
            	    unaryExp120=unaryExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unaryExp120.getTree());

            	    }
            	    break;
            	case 3 :
            	    // SimpleC.g:161:12: MOD ^ unaryExp
            	    {
            	    MOD121=(Token)match(input,MOD,FOLLOW_MOD_in_multiplyExp892); 
            	    MOD121_tree = 
            	    (Object)adaptor.create(MOD121)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(MOD121_tree, root_0);


            	    pushFollow(FOLLOW_unaryExp_in_multiplyExp900);
            	    unaryExp122=unaryExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unaryExp122.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multiplyExp"


    public static class unaryExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unaryExp"
    // SimpleC.g:165:1: unaryExp : ( atomExp | ( uplus ^ atomExp | uminus ^ atomExp | LNOT ^ atomExp | BNOT ^ atomExp ) );
    public final SimpleCParser.unaryExp_return unaryExp() throws RecognitionException {
        SimpleCParser.unaryExp_return retval = new SimpleCParser.unaryExp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LNOT128=null;
        Token BNOT130=null;
        SimpleCParser.atomExp_return atomExp123 =null;

        SimpleCParser.uplus_return uplus124 =null;

        SimpleCParser.atomExp_return atomExp125 =null;

        SimpleCParser.uminus_return uminus126 =null;

        SimpleCParser.atomExp_return atomExp127 =null;

        SimpleCParser.atomExp_return atomExp129 =null;

        SimpleCParser.atomExp_return atomExp131 =null;


        Object LNOT128_tree=null;
        Object BNOT130_tree=null;

        try {
            // SimpleC.g:165:9: ( atomExp | ( uplus ^ atomExp | uminus ^ atomExp | LNOT ^ atomExp | BNOT ^ atomExp ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ID||LA23_0==NUMBER||LA23_0==48) ) {
                alt23=1;
            }
            else if ( (LA23_0==ADD||LA23_0==BNOT||LA23_0==LNOT||LA23_0==SUBTRACT) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // SimpleC.g:166:2: atomExp
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_atomExp_in_unaryExp926);
                    atomExp123=atomExp();

                    state._fsp--;

                    adaptor.addChild(root_0, atomExp123.getTree());

                    }
                    break;
                case 2 :
                    // SimpleC.g:168:3: ( uplus ^ atomExp | uminus ^ atomExp | LNOT ^ atomExp | BNOT ^ atomExp )
                    {
                    root_0 = (Object)adaptor.nil();


                    // SimpleC.g:168:3: ( uplus ^ atomExp | uminus ^ atomExp | LNOT ^ atomExp | BNOT ^ atomExp )
                    int alt22=4;
                    switch ( input.LA(1) ) {
                    case ADD:
                        {
                        alt22=1;
                        }
                        break;
                    case SUBTRACT:
                        {
                        alt22=2;
                        }
                        break;
                    case LNOT:
                        {
                        alt22=3;
                        }
                        break;
                    case BNOT:
                        {
                        alt22=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;

                    }

                    switch (alt22) {
                        case 1 :
                            // SimpleC.g:168:5: uplus ^ atomExp
                            {
                            pushFollow(FOLLOW_uplus_in_unaryExp935);
                            uplus124=uplus();

                            state._fsp--;

                            root_0 = (Object)adaptor.becomeRoot(uplus124.getTree(), root_0);

                            pushFollow(FOLLOW_atomExp_in_unaryExp938);
                            atomExp125=atomExp();

                            state._fsp--;

                            adaptor.addChild(root_0, atomExp125.getTree());

                            }
                            break;
                        case 2 :
                            // SimpleC.g:169:5: uminus ^ atomExp
                            {
                            pushFollow(FOLLOW_uminus_in_unaryExp944);
                            uminus126=uminus();

                            state._fsp--;

                            root_0 = (Object)adaptor.becomeRoot(uminus126.getTree(), root_0);

                            pushFollow(FOLLOW_atomExp_in_unaryExp947);
                            atomExp127=atomExp();

                            state._fsp--;

                            adaptor.addChild(root_0, atomExp127.getTree());

                            }
                            break;
                        case 3 :
                            // SimpleC.g:170:5: LNOT ^ atomExp
                            {
                            LNOT128=(Token)match(input,LNOT,FOLLOW_LNOT_in_unaryExp953); 
                            LNOT128_tree = 
                            (Object)adaptor.create(LNOT128)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(LNOT128_tree, root_0);


                            pushFollow(FOLLOW_atomExp_in_unaryExp956);
                            atomExp129=atomExp();

                            state._fsp--;

                            adaptor.addChild(root_0, atomExp129.getTree());

                            }
                            break;
                        case 4 :
                            // SimpleC.g:171:5: BNOT ^ atomExp
                            {
                            BNOT130=(Token)match(input,BNOT,FOLLOW_BNOT_in_unaryExp962); 
                            BNOT130_tree = 
                            (Object)adaptor.create(BNOT130)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(BNOT130_tree, root_0);


                            pushFollow(FOLLOW_atomExp_in_unaryExp965);
                            atomExp131=atomExp();

                            state._fsp--;

                            adaptor.addChild(root_0, atomExp131.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unaryExp"


    public static class atomExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atomExp"
    // SimpleC.g:175:1: atomExp : ( NUMBER | ID | '(' ! expr ')' !);
    public final SimpleCParser.atomExp_return atomExp() throws RecognitionException {
        SimpleCParser.atomExp_return retval = new SimpleCParser.atomExp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NUMBER132=null;
        Token ID133=null;
        Token char_literal134=null;
        Token char_literal136=null;
        SimpleCParser.expr_return expr135 =null;


        Object NUMBER132_tree=null;
        Object ID133_tree=null;
        Object char_literal134_tree=null;
        Object char_literal136_tree=null;

        try {
            // SimpleC.g:175:8: ( NUMBER | ID | '(' ! expr ')' !)
            int alt24=3;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt24=1;
                }
                break;
            case ID:
                {
                alt24=2;
                }
                break;
            case 48:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // SimpleC.g:176:2: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();


                    NUMBER132=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atomExp978); 
                    NUMBER132_tree = 
                    (Object)adaptor.create(NUMBER132)
                    ;
                    adaptor.addChild(root_0, NUMBER132_tree);


                    }
                    break;
                case 2 :
                    // SimpleC.g:177:4: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    ID133=(Token)match(input,ID,FOLLOW_ID_in_atomExp983); 
                    ID133_tree = 
                    (Object)adaptor.create(ID133)
                    ;
                    adaptor.addChild(root_0, ID133_tree);


                    }
                    break;
                case 3 :
                    // SimpleC.g:178:4: '(' ! expr ')' !
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal134=(Token)match(input,48,FOLLOW_48_in_atomExp988); 

                    pushFollow(FOLLOW_expr_in_atomExp991);
                    expr135=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr135.getTree());

                    char_literal136=(Token)match(input,49,FOLLOW_49_in_atomExp993); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atomExp"


    public static class uplus_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "uplus"
    // SimpleC.g:183:1: uplus : o= ADD -> UPLUS[$o] ;
    public final SimpleCParser.uplus_return uplus() throws RecognitionException {
        SimpleCParser.uplus_return retval = new SimpleCParser.uplus_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token o=null;

        Object o_tree=null;
        RewriteRuleTokenStream stream_ADD=new RewriteRuleTokenStream(adaptor,"token ADD");

        try {
            // SimpleC.g:183:6: (o= ADD -> UPLUS[$o] )
            // SimpleC.g:183:9: o= ADD
            {
            o=(Token)match(input,ADD,FOLLOW_ADD_in_uplus1007);  
            stream_ADD.add(o);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 183:20: -> UPLUS[$o]
            {
                adaptor.addChild(root_0, 
                (Object)adaptor.create(UPLUS, o)
                );

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "uplus"


    public static class uminus_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "uminus"
    // SimpleC.g:184:1: uminus : o= SUBTRACT -> UMINUS[$o] ;
    public final SimpleCParser.uminus_return uminus() throws RecognitionException {
        SimpleCParser.uminus_return retval = new SimpleCParser.uminus_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token o=null;

        Object o_tree=null;
        RewriteRuleTokenStream stream_SUBTRACT=new RewriteRuleTokenStream(adaptor,"token SUBTRACT");

        try {
            // SimpleC.g:184:7: (o= SUBTRACT -> UMINUS[$o] )
            // SimpleC.g:184:9: o= SUBTRACT
            {
            o=(Token)match(input,SUBTRACT,FOLLOW_SUBTRACT_in_uminus1025);  
            stream_SUBTRACT.add(o);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 184:20: -> UMINUS[$o]
            {
                adaptor.addChild(root_0, 
                (Object)adaptor.create(UMINUS, o)
                );

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "uminus"

    // Delegated rules


 

    public static final BitSet FOLLOW_58_in_start100 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_start102 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_start104 = new BitSet(new long[]{0x0102000000000000L});
    public static final BitSet FOLLOW_declList_in_start106 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_start108 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_block_in_start110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_declList134 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_declList138 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_decl_in_declList140 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_statement_in_compoundStmt162 = new BitSet(new long[]{0x091040000E0000A2L});
    public static final BitSet FOLLOW_terminatedStatement_in_statement184 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_statement186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonterminatedStatement_in_statement192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_nonterminatedStatement204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_nonterminatedStatement209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_nonterminatedStatement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_block223 = new BitSet(new long[]{0x191040000E0000A0L});
    public static final BitSet FOLLOW_compoundStmt_in_block225 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_block227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement245 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ifStatement248 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_expr_in_ifStatement251 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ifStatement253 = new BitSet(new long[]{0x091040000E0000A0L});
    public static final BitSet FOLLOW_statement_in_ifStatement256 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ifStatement268 = new BitSet(new long[]{0x091040000E0000A0L});
    public static final BitSet FOLLOW_statement_in_ifStatement271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement282 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_whileStatement285 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_expr_in_whileStatement288 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_whileStatement290 = new BitSet(new long[]{0x0B7040000E0000A0L});
    public static final BitSet FOLLOW_bound_in_whileStatement293 = new BitSet(new long[]{0x0B5040000E0000A0L});
    public static final BitSet FOLLOW_invariantList_in_whileStatement295 = new BitSet(new long[]{0x091040000E0000A0L});
    public static final BitSet FOLLOW_statement_in_whileStatement297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invariant_in_invariantList305 = new BitSet(new long[]{0x0240000000000002L});
    public static final BitSet FOLLOW_57_in_invariant327 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_invariant330 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_expr_in_invariant332 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_invariant334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_invariant348 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_invariant350 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_expr_in_invariant352 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_invariant354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_bound371 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_bound373 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NUMBER_in_bound375 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_bound377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assigmentStmt_in_terminatedStatement399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assertStmt_in_terminatedStatement405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_havocStmt_in_terminatedStatement411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_terminatedStatement417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assumeStmt_in_terminatedStatement423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSUME_in_assumeStmt444 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_assumeStmt447 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_expr_in_assumeStmt450 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_assumeStmt452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HAVOC_in_havocStmt462 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_havocStmt465 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_havocStmt468 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_havocStmt470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typename_in_decl480 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_decl482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_typename501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assigmentStmt509 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assigmentStmt511 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_expr_in_assigmentStmt514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_assertStmt523 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_assertStmt526 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_expr_in_assertStmt529 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_assertStmt531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternExp_in_expr540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lorExp_in_ternExp547 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_TERNARY_in_ternExp550 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_lorExp_in_ternExp553 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ternExp555 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_lorExp_in_ternExp558 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_landExp_in_lorExp567 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_LOR_in_lorExp570 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_landExp_in_lorExp573 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_borExp_in_landExp582 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_LAND_in_landExp585 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_borExp_in_landExp588 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_bxorExp_in_borExp597 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_BOR_in_borExp600 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_bxorExp_in_borExp603 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_bandExp_in_bxorExp612 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_BXOR_in_bxorExp615 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_bandExp_in_bxorExp618 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_equalityExp_in_bandExp627 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_BAND_in_bandExp630 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_equalityExp_in_bandExp633 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_relExp_in_equalityExp643 = new BitSet(new long[]{0x0000002000400002L});
    public static final BitSet FOLLOW_EQUAL_in_equalityExp651 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_relExp_in_equalityExp655 = new BitSet(new long[]{0x0000002000400002L});
    public static final BitSet FOLLOW_NEQUAL_in_equalityExp660 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_relExp_in_equalityExp663 = new BitSet(new long[]{0x0000002000400002L});
    public static final BitSet FOLLOW_shiftExp_in_relExp677 = new BitSet(new long[]{0x0000000441800002L});
    public static final BitSet FOLLOW_LT_in_relExp685 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_shiftExp_in_relExp689 = new BitSet(new long[]{0x0000000441800002L});
    public static final BitSet FOLLOW_LEQ_in_relExp695 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_shiftExp_in_relExp698 = new BitSet(new long[]{0x0000000441800002L});
    public static final BitSet FOLLOW_GT_in_relExp704 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_shiftExp_in_relExp708 = new BitSet(new long[]{0x0000000441800002L});
    public static final BitSet FOLLOW_GEQ_in_relExp714 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_shiftExp_in_relExp717 = new BitSet(new long[]{0x0000000441800002L});
    public static final BitSet FOLLOW_additionExp_in_shiftExp732 = new BitSet(new long[]{0x0000020200000002L});
    public static final BitSet FOLLOW_LSHIFT_in_shiftExp742 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_additionExp_in_shiftExp745 = new BitSet(new long[]{0x0000020200000002L});
    public static final BitSet FOLLOW_RSHIFT_in_shiftExp751 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_additionExp_in_shiftExp754 = new BitSet(new long[]{0x0000020200000002L});
    public static final BitSet FOLLOW_multiplyExp_in_additionExp775 = new BitSet(new long[]{0x0000040000000012L});
    public static final BitSet FOLLOW_ADD_in_additionExp788 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_multiplyExp_in_additionExp796 = new BitSet(new long[]{0x0000040000000012L});
    public static final BitSet FOLLOW_SUBTRACT_in_additionExp809 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_multiplyExp_in_additionExp812 = new BitSet(new long[]{0x0000040000000012L});
    public static final BitSet FOLLOW_unaryExp_in_multiplyExp844 = new BitSet(new long[]{0x0000001800100002L});
    public static final BitSet FOLLOW_MULTIPLY_in_multiplyExp857 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_unaryExp_in_multiplyExp860 = new BitSet(new long[]{0x0000001800100002L});
    public static final BitSet FOLLOW_DIVIDE_in_multiplyExp873 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_unaryExp_in_multiplyExp878 = new BitSet(new long[]{0x0000001800100002L});
    public static final BitSet FOLLOW_MOD_in_multiplyExp892 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_unaryExp_in_multiplyExp900 = new BitSet(new long[]{0x0000001800100002L});
    public static final BitSet FOLLOW_atomExp_in_unaryExp926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_uplus_in_unaryExp935 = new BitSet(new long[]{0x0001004004000000L});
    public static final BitSet FOLLOW_atomExp_in_unaryExp938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_uminus_in_unaryExp944 = new BitSet(new long[]{0x0001004004000000L});
    public static final BitSet FOLLOW_atomExp_in_unaryExp947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LNOT_in_unaryExp953 = new BitSet(new long[]{0x0001004004000000L});
    public static final BitSet FOLLOW_atomExp_in_unaryExp956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BNOT_in_unaryExp962 = new BitSet(new long[]{0x0001004004000000L});
    public static final BitSet FOLLOW_atomExp_in_unaryExp965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_atomExp978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atomExp983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_atomExp988 = new BitSet(new long[]{0x0001044084000410L});
    public static final BitSet FOLLOW_expr_in_atomExp991 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_atomExp993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_uplus1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBTRACT_in_uminus1025 = new BitSet(new long[]{0x0000000000000002L});

}