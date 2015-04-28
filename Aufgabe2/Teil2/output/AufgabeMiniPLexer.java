// $ANTLR 3.4 C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g 2015-04-28 19:12:27

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AufgabeMiniPLexer extends Lexer {
    public static final int EOF=-1;
    public static final int ADD_SUB=4;
    public static final int ASSIGNOR=5;
    public static final int BEGIN=6;
    public static final int BOOLEANCONST=7;
    public static final int CLOSEROUND=8;
    public static final int COMMA=9;
    public static final int COMMENTS=10;
    public static final int COMPARATOR=11;
    public static final int DATATYPE=12;
    public static final int DIGIT=13;
    public static final int DO=14;
    public static final int ELSE=15;
    public static final int END=16;
    public static final int FI=17;
    public static final int ID=18;
    public static final int IF=19;
    public static final int INTEGERCONST=20;
    public static final int LETTER=21;
    public static final int MULT_DIV=22;
    public static final int OD=23;
    public static final int OPENROUND=24;
    public static final int PRINTLN=25;
    public static final int PROGRAM=26;
    public static final int READ=27;
    public static final int REALCONST=28;
    public static final int SEM=29;
    public static final int STRINGCONST=30;
    public static final int THEN=31;
    public static final int WHILE=32;
    public static final int WS=33;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AufgabeMiniPLexer() {} 
    public AufgabeMiniPLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AufgabeMiniPLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g"; }

    // $ANTLR start "OD"
    public final void mOD() throws RecognitionException {
        try {
            int _type = OD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:25:5: ( 'od' )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:25:13: 'od'
            {
            match("od"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OD"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:26:5: ( 'do' )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:26:13: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:27:9: ( 'while' )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:27:17: 'while'
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

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:28:8: ( 'read' )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:28:10: 'read'
            {
            match("read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "COMPARATOR"
    public final void mCOMPARATOR() throws RecognitionException {
        try {
            int _type = COMPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:29:13: ( '=' | '<>' | '<' | '<=' | '>' | '>=' )
            int alt1=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt1=1;
                }
                break;
            case '<':
                {
                switch ( input.LA(2) ) {
                case '>':
                    {
                    alt1=2;
                    }
                    break;
                case '=':
                    {
                    alt1=4;
                    }
                    break;
                default:
                    alt1=3;
                }

                }
                break;
            case '>':
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3=='=') ) {
                    alt1=6;
                }
                else {
                    alt1=5;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:29:15: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:29:21: '<>'
                    {
                    match("<>"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:29:28: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:29:34: '<='
                    {
                    match("<="); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:29:41: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:29:47: '>='
                    {
                    match(">="); 



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
    // $ANTLR end "COMPARATOR"

    // $ANTLR start "ASSIGNOR"
    public final void mASSIGNOR() throws RecognitionException {
        try {
            int _type = ASSIGNOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:30:10: ( ':=' )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:30:12: ':='
            {
            match(":="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGNOR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:31:6: ( 'if' )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:31:8: 'if'
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

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:32:8: ( 'then' )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:32:10: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:33:8: ( 'else' )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:33:10: 'else'
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
    // $ANTLR end "ELSE"

    // $ANTLR start "FI"
    public final void mFI() throws RecognitionException {
        try {
            int _type = FI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:34:5: ( 'fi' )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:34:7: 'fi'
            {
            match("fi"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FI"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:35:7: ( 'end' )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:35:9: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "PROGRAM"
    public final void mPROGRAM() throws RecognitionException {
        try {
            int _type = PROGRAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:36:10: ( 'program' )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:36:12: 'program'
            {
            match("program"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROGRAM"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:37:8: ( 'begin' )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:37:10: 'begin'
            {
            match("begin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "PRINTLN"
    public final void mPRINTLN() throws RecognitionException {
        try {
            int _type = PRINTLN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:38:10: ( 'println' )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:38:12: 'println'
            {
            match("println"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRINTLN"

    // $ANTLR start "DATATYPE"
    public final void mDATATYPE() throws RecognitionException {
        try {
            int _type = DATATYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:39:17: ( 'integer' | 'real' | 'string' | 'boolean' )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt2=1;
                }
                break;
            case 'r':
                {
                alt2=2;
                }
                break;
            case 's':
                {
                alt2=3;
                }
                break;
            case 'b':
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:39:19: 'integer'
                    {
                    match("integer"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:39:31: 'real'
                    {
                    match("real"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:39:40: 'string'
                    {
                    match("string"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:39:51: 'boolean'
                    {
                    match("boolean"); 



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
    // $ANTLR end "DATATYPE"

    // $ANTLR start "OPENROUND"
    public final void mOPENROUND() throws RecognitionException {
        try {
            int _type = OPENROUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:41:11: ( '(' )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:41:14: '('
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
    // $ANTLR end "OPENROUND"

    // $ANTLR start "CLOSEROUND"
    public final void mCLOSEROUND() throws RecognitionException {
        try {
            int _type = CLOSEROUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:42:12: ( ')' )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:42:14: ')'
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
    // $ANTLR end "CLOSEROUND"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:43:8: ( ',' )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:43:10: ','
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
    // $ANTLR end "COMMA"

    // $ANTLR start "SEM"
    public final void mSEM() throws RecognitionException {
        try {
            int _type = SEM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:44:8: ( ';' )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:44:11: ';'
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
    // $ANTLR end "SEM"

    // $ANTLR start "ADD_SUB"
    public final void mADD_SUB() throws RecognitionException {
        try {
            int _type = ADD_SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:45:10: ( '+' | '-' )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ADD_SUB"

    // $ANTLR start "MULT_DIV"
    public final void mMULT_DIV() throws RecognitionException {
        try {
            int _type = MULT_DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:46:10: ( '*' | '/' )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:
            {
            if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULT_DIV"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:48:11: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:48:13: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:48:13: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||(LA3_0 >= '\f' && LA3_0 <= '\r')||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENTS"
    public final void mCOMMENTS() throws RecognitionException {
        try {
            int _type = COMMENTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:49:10: ( ( '/*' ( . )* '*/' ) )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:49:13: ( '/*' ( . )* '*/' )
            {
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:49:13: ( '/*' ( . )* '*/' )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:49:14: '/*' ( . )* '*/'
            {
            match("/*"); 



            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:49:19: ( . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='/') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1 >= '\u0000' && LA4_1 <= '.')||(LA4_1 >= '0' && LA4_1 <= '\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0 >= '\u0000' && LA4_0 <= ')')||(LA4_0 >= '+' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:49:19: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match("*/"); 



            }


             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENTS"

    // $ANTLR start "BOOLEANCONST"
    public final void mBOOLEANCONST() throws RecognitionException {
        try {
            int _type = BOOLEANCONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:50:14: ( 'true' | 'false' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='t') ) {
                alt5=1;
            }
            else if ( (LA5_0=='f') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:50:16: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:50:25: 'false'
                    {
                    match("false"); 



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
    // $ANTLR end "BOOLEANCONST"

    // $ANTLR start "STRINGCONST"
    public final void mSTRINGCONST() throws RecognitionException {
        try {
            int _type = STRINGCONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:51:13: ( '\\'' ( . )* '\\'' )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:51:21: '\\'' ( . )* '\\''
            {
            match('\''); 

            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:51:26: ( . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\'') ) {
                    alt6=2;
                }
                else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '&')||(LA6_0 >= '(' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:51:26: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRINGCONST"

    // $ANTLR start "REALCONST"
    public final void mREALCONST() throws RecognitionException {
        try {
            int _type = REALCONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:52:11: ( ( DIGIT )+ '.' ( DIGIT )+ )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:52:13: ( DIGIT )+ '.' ( DIGIT )+
            {
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:52:13: ( DIGIT )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            match('.'); 

            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:52:24: ( DIGIT )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REALCONST"

    // $ANTLR start "INTEGERCONST"
    public final void mINTEGERCONST() throws RecognitionException {
        try {
            int _type = INTEGERCONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:53:14: ( ( DIGIT )+ )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:53:16: ( DIGIT )+
            {
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:53:16: ( DIGIT )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGERCONST"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:54:5: ( LETTER ( LETTER | DIGIT | '_' )* )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:54:7: LETTER ( LETTER | DIGIT | '_' )*
            {
            mLETTER(); 


            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:54:14: ( LETTER | DIGIT | '_' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '0' && LA10_0 <= '9')||(LA10_0 >= 'A' && LA10_0 <= 'Z')||LA10_0=='_'||(LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:
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
            	    break loop10;
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

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:60:17: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:61:16: ( ( '0' .. '9' ) )
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:
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

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:8: ( OD | DO | WHILE | READ | COMPARATOR | ASSIGNOR | IF | THEN | ELSE | FI | END | PROGRAM | BEGIN | PRINTLN | DATATYPE | OPENROUND | CLOSEROUND | COMMA | SEM | ADD_SUB | MULT_DIV | WS | COMMENTS | BOOLEANCONST | STRINGCONST | REALCONST | INTEGERCONST | ID )
        int alt11=28;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:10: OD
                {
                mOD(); 


                }
                break;
            case 2 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:13: DO
                {
                mDO(); 


                }
                break;
            case 3 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:16: WHILE
                {
                mWHILE(); 


                }
                break;
            case 4 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:22: READ
                {
                mREAD(); 


                }
                break;
            case 5 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:27: COMPARATOR
                {
                mCOMPARATOR(); 


                }
                break;
            case 6 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:38: ASSIGNOR
                {
                mASSIGNOR(); 


                }
                break;
            case 7 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:47: IF
                {
                mIF(); 


                }
                break;
            case 8 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:50: THEN
                {
                mTHEN(); 


                }
                break;
            case 9 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:55: ELSE
                {
                mELSE(); 


                }
                break;
            case 10 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:60: FI
                {
                mFI(); 


                }
                break;
            case 11 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:63: END
                {
                mEND(); 


                }
                break;
            case 12 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:67: PROGRAM
                {
                mPROGRAM(); 


                }
                break;
            case 13 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:75: BEGIN
                {
                mBEGIN(); 


                }
                break;
            case 14 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:81: PRINTLN
                {
                mPRINTLN(); 


                }
                break;
            case 15 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:89: DATATYPE
                {
                mDATATYPE(); 


                }
                break;
            case 16 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:98: OPENROUND
                {
                mOPENROUND(); 


                }
                break;
            case 17 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:108: CLOSEROUND
                {
                mCLOSEROUND(); 


                }
                break;
            case 18 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:119: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 19 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:125: SEM
                {
                mSEM(); 


                }
                break;
            case 20 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:129: ADD_SUB
                {
                mADD_SUB(); 


                }
                break;
            case 21 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:137: MULT_DIV
                {
                mMULT_DIV(); 


                }
                break;
            case 22 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:146: WS
                {
                mWS(); 


                }
                break;
            case 23 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:149: COMMENTS
                {
                mCOMMENTS(); 


                }
                break;
            case 24 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:158: BOOLEANCONST
                {
                mBOOLEANCONST(); 


                }
                break;
            case 25 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:171: STRINGCONST
                {
                mSTRINGCONST(); 


                }
                break;
            case 26 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:183: REALCONST
                {
                mREALCONST(); 


                }
                break;
            case 27 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:193: INTEGERCONST
                {
                mINTEGERCONST(); 


                }
                break;
            case 28 :
                // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:1:206: ID
                {
                mID(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\4\30\2\uffff\7\30\5\uffff\1\25\3\uffff\1\53\1\uffff\1\54"+
        "\1\55\2\30\1\60\5\30\1\66\5\30\5\uffff\2\30\1\uffff\4\30\1\104\1"+
        "\uffff\7\30\1\114\1\115\1\30\1\117\1\120\1\121\1\uffff\6\30\1\130"+
        "\2\uffff\1\30\3\uffff\1\120\2\30\1\134\2\30\1\uffff\3\30\1\uffff"+
        "\1\30\2\115\1\143\1\144\1\115\2\uffff";
    static final String DFA11_eofS =
        "\145\uffff";
    static final String DFA11_minS =
        "\1\11\1\144\1\157\1\150\1\145\2\uffff\1\146\1\150\1\154\1\141\1"+
        "\162\1\145\1\164\5\uffff\1\52\3\uffff\1\56\1\uffff\2\60\1\151\1"+
        "\141\1\60\1\164\1\145\1\165\1\163\1\144\1\60\1\154\1\151\1\147\1"+
        "\157\1\162\5\uffff\1\154\1\144\1\uffff\1\145\1\156\2\145\1\60\1"+
        "\uffff\1\163\1\147\1\156\1\151\1\154\1\151\1\145\2\60\1\147\3\60"+
        "\1\uffff\1\145\1\162\1\164\1\156\1\145\1\156\1\60\2\uffff\1\145"+
        "\3\uffff\1\60\1\141\1\154\1\60\1\141\1\147\1\uffff\1\162\1\155\1"+
        "\156\1\uffff\1\156\5\60\2\uffff";
    static final String DFA11_maxS =
        "\1\172\1\144\1\157\1\150\1\145\2\uffff\1\156\1\162\1\156\1\151\1"+
        "\162\1\157\1\164\5\uffff\1\52\3\uffff\1\71\1\uffff\2\172\1\151\1"+
        "\141\1\172\1\164\1\145\1\165\1\163\1\144\1\172\1\154\1\157\1\147"+
        "\1\157\1\162\5\uffff\2\154\1\uffff\1\145\1\156\2\145\1\172\1\uffff"+
        "\1\163\1\147\1\156\1\151\1\154\1\151\1\145\2\172\1\147\3\172\1\uffff"+
        "\1\145\1\162\1\164\1\156\1\145\1\156\1\172\2\uffff\1\145\3\uffff"+
        "\1\172\1\141\1\154\1\172\1\141\1\147\1\uffff\1\162\1\155\1\156\1"+
        "\uffff\1\156\5\172\2\uffff";
    static final String DFA11_acceptS =
        "\5\uffff\1\5\1\6\7\uffff\1\20\1\21\1\22\1\23\1\24\1\uffff\1\26\1"+
        "\25\1\31\1\uffff\1\34\20\uffff\1\27\1\32\1\33\1\1\1\2\2\uffff\1"+
        "\7\5\uffff\1\12\15\uffff\1\13\7\uffff\1\4\1\17\1\uffff\1\10\1\30"+
        "\1\11\6\uffff\1\3\3\uffff\1\15\6\uffff\1\14\1\16";
    static final String DFA11_specialS =
        "\145\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\24\1\uffff\2\24\22\uffff\1\24\6\uffff\1\26\1\16\1\17\1\25"+
            "\1\22\1\20\1\22\1\uffff\1\23\12\27\1\6\1\21\3\5\2\uffff\32\30"+
            "\6\uffff\1\30\1\14\1\30\1\2\1\11\1\12\2\30\1\7\5\30\1\1\1\13"+
            "\1\30\1\4\1\15\1\10\2\30\1\3\3\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "",
            "",
            "\1\35\7\uffff\1\36",
            "\1\37\11\uffff\1\40",
            "\1\41\1\uffff\1\42",
            "\1\44\7\uffff\1\43",
            "\1\45",
            "\1\46\11\uffff\1\47",
            "\1\50",
            "",
            "",
            "",
            "",
            "",
            "\1\51",
            "",
            "",
            "",
            "\1\52\1\uffff\12\27",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\56",
            "\1\57",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\67",
            "\1\71\5\uffff\1\70",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "",
            "",
            "",
            "",
            "\1\75",
            "\1\76\7\uffff\1\77",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\116",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "\1\131",
            "",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\132",
            "\1\133",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "\1\142",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( OD | DO | WHILE | READ | COMPARATOR | ASSIGNOR | IF | THEN | ELSE | FI | END | PROGRAM | BEGIN | PRINTLN | DATATYPE | OPENROUND | CLOSEROUND | COMMA | SEM | ADD_SUB | MULT_DIV | WS | COMMENTS | BOOLEANCONST | STRINGCONST | REALCONST | INTEGERCONST | ID );";
        }
    }
 

}