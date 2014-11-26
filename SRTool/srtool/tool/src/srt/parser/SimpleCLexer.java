// $ANTLR 3.4 SimpleC.g 2014-01-27 15:17:27

  package srt.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SimpleCLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SimpleCLexer() {} 
    public SimpleCLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SimpleCLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "SimpleC.g"; }

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:11:7: ( '(' )
            // SimpleC.g:11:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:12:7: ( ')' )
            // SimpleC.g:12:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:13:7: ( ',' )
            // SimpleC.g:13:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:14:7: ( ':' )
            // SimpleC.g:14:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:15:7: ( ';' )
            // SimpleC.g:15:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:16:7: ( 'bound' )
            // SimpleC.g:16:9: 'bound'
            {
            match("bound"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:17:7: ( 'cand' )
            // SimpleC.g:17:9: 'cand'
            {
            match("cand"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:18:7: ( 'else' )
            // SimpleC.g:18:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:19:7: ( 'int' )
            // SimpleC.g:19:9: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:20:7: ( 'inv' )
            // SimpleC.g:20:9: 'inv'
            {
            match("inv"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:21:7: ( 'void' )
            // SimpleC.g:21:9: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:22:7: ( '{' )
            // SimpleC.g:22:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:23:7: ( '}' )
            // SimpleC.g:23:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "LNOT"
    public final void mLNOT() throws RecognitionException {
        try {
            int _type = LNOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:186:5: ( '!' )
            // SimpleC.g:186:7: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LNOT"

    // $ANTLR start "BNOT"
    public final void mBNOT() throws RecognitionException {
        try {
            int _type = BNOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:187:5: ( '~' )
            // SimpleC.g:187:7: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BNOT"

    // $ANTLR start "MULTIPLY"
    public final void mMULTIPLY() throws RecognitionException {
        try {
            int _type = MULTIPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:189:9: ( '*' )
            // SimpleC.g:189:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULTIPLY"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:190:7: ( '/' )
            // SimpleC.g:190:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIVIDE"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:191:4: ( '%' )
            // SimpleC.g:191:6: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:193:4: ( '+' )
            // SimpleC.g:193:6: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "SUBTRACT"
    public final void mSUBTRACT() throws RecognitionException {
        try {
            int _type = SUBTRACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:194:9: ( '-' )
            // SimpleC.g:194:11: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUBTRACT"

    // $ANTLR start "LSHIFT"
    public final void mLSHIFT() throws RecognitionException {
        try {
            int _type = LSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:196:7: ( '<<' )
            // SimpleC.g:196:9: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LSHIFT"

    // $ANTLR start "RSHIFT"
    public final void mRSHIFT() throws RecognitionException {
        try {
            int _type = RSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:197:7: ( '>>' )
            // SimpleC.g:197:9: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RSHIFT"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:199:3: ( '<' )
            // SimpleC.g:199:5: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LEQ"
    public final void mLEQ() throws RecognitionException {
        try {
            int _type = LEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:200:4: ( '<=' )
            // SimpleC.g:200:6: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEQ"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:201:3: ( '>' )
            // SimpleC.g:201:5: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GEQ"
    public final void mGEQ() throws RecognitionException {
        try {
            int _type = GEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:202:4: ( '>=' )
            // SimpleC.g:202:6: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GEQ"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:204:6: ( '==' )
            // SimpleC.g:204:8: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NEQUAL"
    public final void mNEQUAL() throws RecognitionException {
        try {
            int _type = NEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:205:7: ( '!=' )
            // SimpleC.g:205:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEQUAL"

    // $ANTLR start "BXOR"
    public final void mBXOR() throws RecognitionException {
        try {
            int _type = BXOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:207:5: ( '^' )
            // SimpleC.g:207:7: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BXOR"

    // $ANTLR start "BAND"
    public final void mBAND() throws RecognitionException {
        try {
            int _type = BAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:209:5: ( '&' )
            // SimpleC.g:209:7: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BAND"

    // $ANTLR start "BOR"
    public final void mBOR() throws RecognitionException {
        try {
            int _type = BOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:211:4: ( '|' )
            // SimpleC.g:211:6: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOR"

    // $ANTLR start "LAND"
    public final void mLAND() throws RecognitionException {
        try {
            int _type = LAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:213:5: ( '&&' )
            // SimpleC.g:213:7: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LAND"

    // $ANTLR start "LOR"
    public final void mLOR() throws RecognitionException {
        try {
            int _type = LOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:215:4: ( '||' )
            // SimpleC.g:215:6: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOR"

    // $ANTLR start "TERNARY"
    public final void mTERNARY() throws RecognitionException {
        try {
            int _type = TERNARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:217:8: ( '?' )
            // SimpleC.g:217:10: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TERNARY"

    // $ANTLR start "ASSIGNMENT"
    public final void mASSIGNMENT() throws RecognitionException {
        try {
            int _type = ASSIGNMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:220:11: ( '=' )
            // SimpleC.g:220:13: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGNMENT"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:222:3: ( 'if' )
            // SimpleC.g:222:5: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:223:6: ( 'while' )
            // SimpleC.g:223:8: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "ASSERT"
    public final void mASSERT() throws RecognitionException {
        try {
            int _type = ASSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:224:7: ( 'assert' )
            // SimpleC.g:224:9: 'assert'
            {
            match("assert"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSERT"

    // $ANTLR start "HAVOC"
    public final void mHAVOC() throws RecognitionException {
        try {
            int _type = HAVOC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:225:6: ( 'havoc' )
            // SimpleC.g:225:8: 'havoc'
            {
            match("havoc"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HAVOC"

    // $ANTLR start "ASSUME"
    public final void mASSUME() throws RecognitionException {
        try {
            int _type = ASSUME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:226:7: ( 'assume' )
            // SimpleC.g:226:9: 'assume'
            {
            match("assume"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSUME"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:229:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( DIGIT | 'a' .. 'z' | 'A' .. 'Z' | '_' )* )
            // SimpleC.g:229:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( DIGIT | 'a' .. 'z' | 'A' .. 'Z' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // SimpleC.g:229:29: ( DIGIT | 'a' .. 'z' | 'A' .. 'Z' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // SimpleC.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:231:9: ( ( DIGIT )+ )
            // SimpleC.g:231:11: ( DIGIT )+
            {
            // SimpleC.g:231:11: ( DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // SimpleC.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // SimpleC.g:232:17: ( '0' .. '9' )
            // SimpleC.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:235:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='/') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='/') ) {
                    alt6=1;
                }
                else if ( (LA6_1=='*') ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // SimpleC.g:235:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // SimpleC.g:235:14: (~ ( '\\n' | '\\r' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // SimpleC.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    // SimpleC.g:235:28: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // SimpleC.g:235:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // SimpleC.g:236:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // SimpleC.g:236:14: ( options {greedy=false; } : . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='*') ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1=='/') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // SimpleC.g:236:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SimpleC.g:239:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // SimpleC.g:239:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // SimpleC.g:239:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||(LA7_0 >= '\f' && LA7_0 <= '\r')||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // SimpleC.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // SimpleC.g:1:8: ( T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | LNOT | BNOT | MULTIPLY | DIVIDE | MOD | ADD | SUBTRACT | LSHIFT | RSHIFT | LT | LEQ | GT | GEQ | EQUAL | NEQUAL | BXOR | BAND | BOR | LAND | LOR | TERNARY | ASSIGNMENT | IF | WHILE | ASSERT | HAVOC | ASSUME | ID | NUMBER | COMMENT | WHITESPACE )
        int alt8=44;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // SimpleC.g:1:10: T__48
                {
                mT__48(); 


                }
                break;
            case 2 :
                // SimpleC.g:1:16: T__49
                {
                mT__49(); 


                }
                break;
            case 3 :
                // SimpleC.g:1:22: T__50
                {
                mT__50(); 


                }
                break;
            case 4 :
                // SimpleC.g:1:28: T__51
                {
                mT__51(); 


                }
                break;
            case 5 :
                // SimpleC.g:1:34: T__52
                {
                mT__52(); 


                }
                break;
            case 6 :
                // SimpleC.g:1:40: T__53
                {
                mT__53(); 


                }
                break;
            case 7 :
                // SimpleC.g:1:46: T__54
                {
                mT__54(); 


                }
                break;
            case 8 :
                // SimpleC.g:1:52: T__55
                {
                mT__55(); 


                }
                break;
            case 9 :
                // SimpleC.g:1:58: T__56
                {
                mT__56(); 


                }
                break;
            case 10 :
                // SimpleC.g:1:64: T__57
                {
                mT__57(); 


                }
                break;
            case 11 :
                // SimpleC.g:1:70: T__58
                {
                mT__58(); 


                }
                break;
            case 12 :
                // SimpleC.g:1:76: T__59
                {
                mT__59(); 


                }
                break;
            case 13 :
                // SimpleC.g:1:82: T__60
                {
                mT__60(); 


                }
                break;
            case 14 :
                // SimpleC.g:1:88: LNOT
                {
                mLNOT(); 


                }
                break;
            case 15 :
                // SimpleC.g:1:93: BNOT
                {
                mBNOT(); 


                }
                break;
            case 16 :
                // SimpleC.g:1:98: MULTIPLY
                {
                mMULTIPLY(); 


                }
                break;
            case 17 :
                // SimpleC.g:1:107: DIVIDE
                {
                mDIVIDE(); 


                }
                break;
            case 18 :
                // SimpleC.g:1:114: MOD
                {
                mMOD(); 


                }
                break;
            case 19 :
                // SimpleC.g:1:118: ADD
                {
                mADD(); 


                }
                break;
            case 20 :
                // SimpleC.g:1:122: SUBTRACT
                {
                mSUBTRACT(); 


                }
                break;
            case 21 :
                // SimpleC.g:1:131: LSHIFT
                {
                mLSHIFT(); 


                }
                break;
            case 22 :
                // SimpleC.g:1:138: RSHIFT
                {
                mRSHIFT(); 


                }
                break;
            case 23 :
                // SimpleC.g:1:145: LT
                {
                mLT(); 


                }
                break;
            case 24 :
                // SimpleC.g:1:148: LEQ
                {
                mLEQ(); 


                }
                break;
            case 25 :
                // SimpleC.g:1:152: GT
                {
                mGT(); 


                }
                break;
            case 26 :
                // SimpleC.g:1:155: GEQ
                {
                mGEQ(); 


                }
                break;
            case 27 :
                // SimpleC.g:1:159: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 28 :
                // SimpleC.g:1:165: NEQUAL
                {
                mNEQUAL(); 


                }
                break;
            case 29 :
                // SimpleC.g:1:172: BXOR
                {
                mBXOR(); 


                }
                break;
            case 30 :
                // SimpleC.g:1:177: BAND
                {
                mBAND(); 


                }
                break;
            case 31 :
                // SimpleC.g:1:182: BOR
                {
                mBOR(); 


                }
                break;
            case 32 :
                // SimpleC.g:1:186: LAND
                {
                mLAND(); 


                }
                break;
            case 33 :
                // SimpleC.g:1:191: LOR
                {
                mLOR(); 


                }
                break;
            case 34 :
                // SimpleC.g:1:195: TERNARY
                {
                mTERNARY(); 


                }
                break;
            case 35 :
                // SimpleC.g:1:203: ASSIGNMENT
                {
                mASSIGNMENT(); 


                }
                break;
            case 36 :
                // SimpleC.g:1:214: IF
                {
                mIF(); 


                }
                break;
            case 37 :
                // SimpleC.g:1:217: WHILE
                {
                mWHILE(); 


                }
                break;
            case 38 :
                // SimpleC.g:1:223: ASSERT
                {
                mASSERT(); 


                }
                break;
            case 39 :
                // SimpleC.g:1:230: HAVOC
                {
                mHAVOC(); 


                }
                break;
            case 40 :
                // SimpleC.g:1:236: ASSUME
                {
                mASSUME(); 


                }
                break;
            case 41 :
                // SimpleC.g:1:243: ID
                {
                mID(); 


                }
                break;
            case 42 :
                // SimpleC.g:1:246: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 43 :
                // SimpleC.g:1:253: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 44 :
                // SimpleC.g:1:261: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\6\uffff\5\36\2\uffff\1\50\2\uffff\1\52\3\uffff\1\55\1\60\1\62\1"+
        "\uffff\1\64\1\66\1\uffff\3\36\3\uffff\4\36\1\77\1\36\20\uffff\6"+
        "\36\1\107\1\110\1\uffff\5\36\1\117\1\120\2\uffff\1\121\4\36\1\126"+
        "\3\uffff\1\127\2\36\1\132\2\uffff\1\133\1\134\3\uffff";
    static final String DFA8_eofS =
        "\135\uffff";
    static final String DFA8_minS =
        "\1\11\5\uffff\1\157\1\141\1\154\1\146\1\157\2\uffff\1\75\2\uffff"+
        "\1\52\3\uffff\1\74\2\75\1\uffff\1\46\1\174\1\uffff\1\150\1\163\1"+
        "\141\3\uffff\1\165\1\156\1\163\1\164\1\60\1\151\20\uffff\1\151\1"+
        "\163\1\166\1\156\1\144\1\145\2\60\1\uffff\1\144\1\154\1\145\1\157"+
        "\1\144\2\60\2\uffff\1\60\1\145\1\162\1\155\1\143\1\60\3\uffff\1"+
        "\60\1\164\1\145\1\60\2\uffff\2\60\3\uffff";
    static final String DFA8_maxS =
        "\1\176\5\uffff\1\157\1\141\1\154\1\156\1\157\2\uffff\1\75\2\uffff"+
        "\1\57\3\uffff\1\75\1\76\1\75\1\uffff\1\46\1\174\1\uffff\1\150\1"+
        "\163\1\141\3\uffff\1\165\1\156\1\163\1\166\1\172\1\151\20\uffff"+
        "\1\151\1\163\1\166\1\156\1\144\1\145\2\172\1\uffff\1\144\1\154\1"+
        "\165\1\157\1\144\2\172\2\uffff\1\172\1\145\1\162\1\155\1\143\1\172"+
        "\3\uffff\1\172\1\164\1\145\1\172\2\uffff\2\172\3\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\5\uffff\1\14\1\15\1\uffff\1\17\1\20"+
        "\1\uffff\1\22\1\23\1\24\3\uffff\1\35\2\uffff\1\42\3\uffff\1\51\1"+
        "\52\1\54\6\uffff\1\34\1\16\1\53\1\21\1\25\1\30\1\27\1\26\1\32\1"+
        "\31\1\33\1\43\1\40\1\36\1\41\1\37\10\uffff\1\44\7\uffff\1\11\1\12"+
        "\6\uffff\1\7\1\10\1\13\4\uffff\1\6\1\45\2\uffff\1\47\1\46\1\50";
    static final String DFA8_specialS =
        "\135\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\40\1\uffff\2\40\22\uffff\1\40\1\15\3\uffff\1\21\1\30\1\uffff"+
            "\1\1\1\2\1\17\1\22\1\3\1\23\1\uffff\1\20\12\37\1\4\1\5\1\24"+
            "\1\26\1\25\1\32\1\uffff\32\36\3\uffff\1\27\2\uffff\1\34\1\6"+
            "\1\7\1\36\1\10\2\36\1\35\1\11\14\36\1\12\1\33\3\36\1\13\1\31"+
            "\1\14\1\16",
            "",
            "",
            "",
            "",
            "",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\45\7\uffff\1\44",
            "\1\46",
            "",
            "",
            "\1\47",
            "",
            "",
            "\1\51\4\uffff\1\51",
            "",
            "",
            "",
            "\1\53\1\54",
            "\1\57\1\56",
            "\1\61",
            "",
            "\1\63",
            "\1\65",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75\1\uffff\1\76",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\100",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\111",
            "\1\112",
            "\1\113\17\uffff\1\114",
            "\1\115",
            "\1\116",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\130",
            "\1\131",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | LNOT | BNOT | MULTIPLY | DIVIDE | MOD | ADD | SUBTRACT | LSHIFT | RSHIFT | LT | LEQ | GT | GEQ | EQUAL | NEQUAL | BXOR | BAND | BOR | LAND | LOR | TERNARY | ASSIGNMENT | IF | WHILE | ASSERT | HAVOC | ASSUME | ID | NUMBER | COMMENT | WHITESPACE );";
        }
    }
 

}