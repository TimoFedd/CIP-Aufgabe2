// $ANTLR 3.4 C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g 2015-04-08 16:45:57

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class AufgabeMiniPParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD_SUB", "ASSIGNOR", "BEGIN", "BOOLEANCONST", "CLOSEROUND", "COMMA", "COMMENTS", "COMPARATOR", "DATATYPE", "DIGIT", "DO", "ELSE", "END", "FI", "ID", "IF", "INTEGERCONST", "LETTER", "MULT_DIV", "OD", "OPENROUND", "PRINTLN", "PROGRAM", "READ", "REALCONST", "SEM", "STRINGCONST", "THEN", "WHILE", "WS", "'-'"
    };

    public static final int EOF=-1;
    public static final int T__34=34;
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "arithmetik", "println", "statement", "compare", "multiplicationExpression", 
    "assignment", "constants", "declaration", "if_statement", "start", "atom", 
    "while_statement", "read_statement"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public AufgabeMiniPParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public AufgabeMiniPParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this, port, null);

        setDebugListener(proxy);
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
    }

public AufgabeMiniPParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return AufgabeMiniPParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g"; }



    // $ANTLR start "start"
    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:4:1: start : PROGRAM ( declaration )* BEGIN ( statement )+ END ;
    public final void start() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(4, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:4:8: ( PROGRAM ( declaration )* BEGIN ( statement )+ END )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:4:10: PROGRAM ( declaration )* BEGIN ( statement )+ END
            {
            dbg.location(4,10);
            match(input,PROGRAM,FOLLOW_PROGRAM_in_start12); 
            dbg.location(4,18);
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:4:18: ( declaration )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==DATATYPE) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:4:18: declaration
            	    {
            	    dbg.location(4,18);
            	    pushFollow(FOLLOW_declaration_in_start14);
            	    declaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(4,32);
            match(input,BEGIN,FOLLOW_BEGIN_in_start18); 
            dbg.location(4,38);
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:4:38: ( statement )+
            int cnt2=0;
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= ID && LA2_0 <= IF)||LA2_0==PRINTLN||LA2_0==READ||LA2_0==WHILE) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:4:38: statement
            	    {
            	    dbg.location(4,38);
            	    pushFollow(FOLLOW_statement_in_start20);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt2++;
            } while (true);
            } finally {dbg.exitSubRule(2);}

            dbg.location(4,49);
            match(input,END,FOLLOW_END_in_start23); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(4, 51);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "start"



    // $ANTLR start "declaration"
    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:5:1: declaration : DATATYPE ID ( COMMA ID )* SEM ;
    public final void declaration() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(5, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:5:13: ( DATATYPE ID ( COMMA ID )* SEM )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:5:15: DATATYPE ID ( COMMA ID )* SEM
            {
            dbg.location(5,15);
            match(input,DATATYPE,FOLLOW_DATATYPE_in_declaration31); 
            dbg.location(5,24);
            match(input,ID,FOLLOW_ID_in_declaration33); 
            dbg.location(5,27);
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:5:27: ( COMMA ID )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==COMMA) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:5:28: COMMA ID
            	    {
            	    dbg.location(5,28);
            	    match(input,COMMA,FOLLOW_COMMA_in_declaration36); 
            	    dbg.location(5,34);
            	    match(input,ID,FOLLOW_ID_in_declaration38); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}

            dbg.location(5,39);
            match(input,SEM,FOLLOW_SEM_in_declaration42); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(5, 41);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "declaration"



    // $ANTLR start "statement"
    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:6:1: statement : ( assignment | read_statement | while_statement | if_statement | println ) SEM ;
    public final void statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(6, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:6:17: ( ( assignment | read_statement | while_statement | if_statement | println ) SEM )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:6:19: ( assignment | read_statement | while_statement | if_statement | println ) SEM
            {
            dbg.location(6,19);
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:6:19: ( assignment | read_statement | while_statement | if_statement | println )
            int alt4=5;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            switch ( input.LA(1) ) {
            case ID:
                {
                alt4=1;
                }
                break;
            case READ:
                {
                alt4=2;
                }
                break;
            case WHILE:
                {
                alt4=3;
                }
                break;
            case IF:
                {
                alt4=4;
                }
                break;
            case PRINTLN:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:6:20: assignment
                    {
                    dbg.location(6,20);
                    pushFollow(FOLLOW_assignment_in_statement56);
                    assignment();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:6:33: read_statement
                    {
                    dbg.location(6,33);
                    pushFollow(FOLLOW_read_statement_in_statement60);
                    read_statement();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:6:50: while_statement
                    {
                    dbg.location(6,50);
                    pushFollow(FOLLOW_while_statement_in_statement64);
                    while_statement();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:6:67: if_statement
                    {
                    dbg.location(6,67);
                    pushFollow(FOLLOW_if_statement_in_statement67);
                    if_statement();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:6:80: println
                    {
                    dbg.location(6,80);
                    pushFollow(FOLLOW_println_in_statement69);
                    println();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(6,89);
            match(input,SEM,FOLLOW_SEM_in_statement72); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(6, 91);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "assignment"
    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:8:1: assignment : ID ASSIGNOR ( arithmetik | compare | STRINGCONST | BOOLEANCONST ) ;
    public final void assignment() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "assignment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(8, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:8:17: ( ID ASSIGNOR ( arithmetik | compare | STRINGCONST | BOOLEANCONST ) )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:8:19: ID ASSIGNOR ( arithmetik | compare | STRINGCONST | BOOLEANCONST )
            {
            dbg.location(8,19);
            match(input,ID,FOLLOW_ID_in_assignment85); 
            dbg.location(8,22);
            match(input,ASSIGNOR,FOLLOW_ASSIGNOR_in_assignment87); 
            dbg.location(8,31);
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:8:31: ( arithmetik | compare | STRINGCONST | BOOLEANCONST )
            int alt5=4;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            switch ( input.LA(1) ) {
            case ID:
            case INTEGERCONST:
            case REALCONST:
            case 34:
                {
                alt5=1;
                }
                break;
            case OPENROUND:
                {
                switch ( input.LA(2) ) {
                case OPENROUND:
                case 34:
                    {
                    alt5=1;
                    }
                    break;
                case INTEGERCONST:
                    {
                    int LA5_5 = input.LA(3);

                    if ( (LA5_5==ADD_SUB||LA5_5==CLOSEROUND||LA5_5==MULT_DIV) ) {
                        alt5=1;
                    }
                    else if ( (LA5_5==COMPARATOR) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 5, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    }
                    break;
                case REALCONST:
                    {
                    int LA5_6 = input.LA(3);

                    if ( (LA5_6==ADD_SUB||LA5_6==CLOSEROUND||LA5_6==MULT_DIV) ) {
                        alt5=1;
                    }
                    else if ( (LA5_6==COMPARATOR) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 6, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    }
                    break;
                case ID:
                    {
                    int LA5_7 = input.LA(3);

                    if ( (LA5_7==ADD_SUB||LA5_7==CLOSEROUND||LA5_7==MULT_DIV) ) {
                        alt5=1;
                    }
                    else if ( (LA5_7==COMPARATOR) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 7, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    }
                    break;
                case BOOLEANCONST:
                case STRINGCONST:
                    {
                    alt5=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            case STRINGCONST:
                {
                alt5=3;
                }
                break;
            case BOOLEANCONST:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:8:32: arithmetik
                    {
                    dbg.location(8,32);
                    pushFollow(FOLLOW_arithmetik_in_assignment90);
                    arithmetik();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:8:45: compare
                    {
                    dbg.location(8,45);
                    pushFollow(FOLLOW_compare_in_assignment94);
                    compare();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:8:55: STRINGCONST
                    {
                    dbg.location(8,55);
                    match(input,STRINGCONST,FOLLOW_STRINGCONST_in_assignment98); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:8:69: BOOLEANCONST
                    {
                    dbg.location(8,69);
                    match(input,BOOLEANCONST,FOLLOW_BOOLEANCONST_in_assignment102); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(8, 81);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "assignment"



    // $ANTLR start "read_statement"
    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:9:1: read_statement : READ OPENROUND ID CLOSEROUND ;
    public final void read_statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "read_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(9, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:9:17: ( READ OPENROUND ID CLOSEROUND )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:9:20: READ OPENROUND ID CLOSEROUND
            {
            dbg.location(9,20);
            match(input,READ,FOLLOW_READ_in_read_statement112); 
            dbg.location(9,25);
            match(input,OPENROUND,FOLLOW_OPENROUND_in_read_statement114); 
            dbg.location(9,35);
            match(input,ID,FOLLOW_ID_in_read_statement116); 
            dbg.location(9,38);
            match(input,CLOSEROUND,FOLLOW_CLOSEROUND_in_read_statement118); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(9, 47);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "read_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "read_statement"



    // $ANTLR start "while_statement"
    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:10:1: while_statement : WHILE compare DO ( statement )* OD ;
    public final void while_statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "while_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(10, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:10:17: ( WHILE compare DO ( statement )* OD )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:10:19: WHILE compare DO ( statement )* OD
            {
            dbg.location(10,19);
            match(input,WHILE,FOLLOW_WHILE_in_while_statement125); 
            dbg.location(10,25);
            pushFollow(FOLLOW_compare_in_while_statement127);
            compare();

            state._fsp--;

            dbg.location(10,33);
            match(input,DO,FOLLOW_DO_in_while_statement129); 
            dbg.location(10,36);
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:10:36: ( statement )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= ID && LA6_0 <= IF)||LA6_0==PRINTLN||LA6_0==READ||LA6_0==WHILE) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:10:36: statement
            	    {
            	    dbg.location(10,36);
            	    pushFollow(FOLLOW_statement_in_while_statement131);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}

            dbg.location(10,47);
            match(input,OD,FOLLOW_OD_in_while_statement134); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(10, 48);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "while_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "while_statement"



    // $ANTLR start "if_statement"
    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:11:1: if_statement : IF compare THEN ( statement )+ ( ELSE ( statement )+ )? FI ;
    public final void if_statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "if_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(11, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:11:17: ( IF compare THEN ( statement )+ ( ELSE ( statement )+ )? FI )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:11:25: IF compare THEN ( statement )+ ( ELSE ( statement )+ )? FI
            {
            dbg.location(11,25);
            match(input,IF,FOLLOW_IF_in_if_statement151); 
            dbg.location(11,28);
            pushFollow(FOLLOW_compare_in_if_statement153);
            compare();

            state._fsp--;

            dbg.location(11,36);
            match(input,THEN,FOLLOW_THEN_in_if_statement155); 
            dbg.location(11,41);
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:11:41: ( statement )+
            int cnt7=0;
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= ID && LA7_0 <= IF)||LA7_0==PRINTLN||LA7_0==READ||LA7_0==WHILE) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:11:41: statement
            	    {
            	    dbg.location(11,41);
            	    pushFollow(FOLLOW_statement_in_if_statement157);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt7++;
            } while (true);
            } finally {dbg.exitSubRule(7);}

            dbg.location(11,52);
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:11:52: ( ELSE ( statement )+ )?
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==ELSE) ) {
                alt9=1;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:11:54: ELSE ( statement )+
                    {
                    dbg.location(11,54);
                    match(input,ELSE,FOLLOW_ELSE_in_if_statement162); 
                    dbg.location(11,59);
                    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:11:59: ( statement )+
                    int cnt8=0;
                    try { dbg.enterSubRule(8);

                    loop8:
                    do {
                        int alt8=2;
                        try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= ID && LA8_0 <= IF)||LA8_0==PRINTLN||LA8_0==READ||LA8_0==WHILE) ) {
                            alt8=1;
                        }


                        } finally {dbg.exitDecision(8);}

                        switch (alt8) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:11:59: statement
                    	    {
                    	    dbg.location(11,59);
                    	    pushFollow(FOLLOW_statement_in_if_statement164);
                    	    statement();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt8++;
                    } while (true);
                    } finally {dbg.exitSubRule(8);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}

            dbg.location(11,73);
            match(input,FI,FOLLOW_FI_in_if_statement170); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(11, 74);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "if_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "if_statement"



    // $ANTLR start "compare"
    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:13:1: compare : OPENROUND ( ID | constants ) COMPARATOR ( ID | constants ) CLOSEROUND ;
    public final void compare() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "compare");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:13:10: ( OPENROUND ( ID | constants ) COMPARATOR ( ID | constants ) CLOSEROUND )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:13:12: OPENROUND ( ID | constants ) COMPARATOR ( ID | constants ) CLOSEROUND
            {
            dbg.location(13,12);
            match(input,OPENROUND,FOLLOW_OPENROUND_in_compare180); 
            dbg.location(13,22);
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:13:22: ( ID | constants )
            int alt10=2;
            try { dbg.enterSubRule(10);
            try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==BOOLEANCONST||LA10_0==INTEGERCONST||LA10_0==REALCONST||LA10_0==STRINGCONST) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:13:23: ID
                    {
                    dbg.location(13,23);
                    match(input,ID,FOLLOW_ID_in_compare183); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:13:27: constants
                    {
                    dbg.location(13,27);
                    pushFollow(FOLLOW_constants_in_compare186);
                    constants();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}

            dbg.location(13,39);
            match(input,COMPARATOR,FOLLOW_COMPARATOR_in_compare190); 
            dbg.location(13,50);
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:13:50: ( ID | constants )
            int alt11=2;
            try { dbg.enterSubRule(11);
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==BOOLEANCONST||LA11_0==INTEGERCONST||LA11_0==REALCONST||LA11_0==STRINGCONST) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:13:51: ID
                    {
                    dbg.location(13,51);
                    match(input,ID,FOLLOW_ID_in_compare193); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:13:54: constants
                    {
                    dbg.location(13,54);
                    pushFollow(FOLLOW_constants_in_compare195);
                    constants();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(11);}

            dbg.location(13,65);
            match(input,CLOSEROUND,FOLLOW_CLOSEROUND_in_compare198); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(13, 74);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "compare");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "compare"



    // $ANTLR start "println"
    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:14:1: println : PRINTLN OPENROUND ( ID | STRINGCONST ) CLOSEROUND ;
    public final void println() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "println");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(14, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:14:10: ( PRINTLN OPENROUND ( ID | STRINGCONST ) CLOSEROUND )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:14:12: PRINTLN OPENROUND ( ID | STRINGCONST ) CLOSEROUND
            {
            dbg.location(14,12);
            match(input,PRINTLN,FOLLOW_PRINTLN_in_println207); 
            dbg.location(14,20);
            match(input,OPENROUND,FOLLOW_OPENROUND_in_println209); 
            dbg.location(14,29);
            if ( input.LA(1)==ID||input.LA(1)==STRINGCONST ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(14,46);
            match(input,CLOSEROUND,FOLLOW_CLOSEROUND_in_println216); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(14, 55);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "println");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "println"



    // $ANTLR start "constants"
    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:16:1: constants : ( BOOLEANCONST | STRINGCONST | REALCONST | INTEGERCONST );
    public final void constants() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "constants");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(16, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:16:11: ( BOOLEANCONST | STRINGCONST | REALCONST | INTEGERCONST )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:
            {
            dbg.location(16,11);
            if ( input.LA(1)==BOOLEANCONST||input.LA(1)==INTEGERCONST||input.LA(1)==REALCONST||input.LA(1)==STRINGCONST ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(16, 65);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "constants");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "constants"



    // $ANTLR start "arithmetik"
    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:19:1: arithmetik : multiplicationExpression ( ADD_SUB multiplicationExpression )* ;
    public final void arithmetik() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "arithmetik");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(19, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:19:16: ( multiplicationExpression ( ADD_SUB multiplicationExpression )* )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:19:19: multiplicationExpression ( ADD_SUB multiplicationExpression )*
            {
            dbg.location(19,19);
            pushFollow(FOLLOW_multiplicationExpression_in_arithmetik250);
            multiplicationExpression();

            state._fsp--;

            dbg.location(19,43);
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:19:43: ( ADD_SUB multiplicationExpression )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==ADD_SUB) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:19:44: ADD_SUB multiplicationExpression
            	    {
            	    dbg.location(19,44);
            	    match(input,ADD_SUB,FOLLOW_ADD_SUB_in_arithmetik252); 
            	    dbg.location(19,52);
            	    pushFollow(FOLLOW_multiplicationExpression_in_arithmetik254);
            	    multiplicationExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(19, 77);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arithmetik");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "arithmetik"



    // $ANTLR start "multiplicationExpression"
    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:20:1: multiplicationExpression : atom ( MULT_DIV atom )* ;
    public final void multiplicationExpression() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "multiplicationExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(20, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:20:26: ( atom ( MULT_DIV atom )* )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:20:34: atom ( MULT_DIV atom )*
            {
            dbg.location(20,34);
            pushFollow(FOLLOW_atom_in_multiplicationExpression269);
            atom();

            state._fsp--;

            dbg.location(20,38);
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:20:38: ( MULT_DIV atom )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==MULT_DIV) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:20:39: MULT_DIV atom
            	    {
            	    dbg.location(20,39);
            	    match(input,MULT_DIV,FOLLOW_MULT_DIV_in_multiplicationExpression271); 
            	    dbg.location(20,48);
            	    pushFollow(FOLLOW_atom_in_multiplicationExpression273);
            	    atom();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(20, 54);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "multiplicationExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "multiplicationExpression"



    // $ANTLR start "atom"
    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:21:1: atom : ( '-' )? ( INTEGERCONST | REALCONST | ID | OPENROUND arithmetik CLOSEROUND ) ;
    public final void atom() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:21:9: ( ( '-' )? ( INTEGERCONST | REALCONST | ID | OPENROUND arithmetik CLOSEROUND ) )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:21:17: ( '-' )? ( INTEGERCONST | REALCONST | ID | OPENROUND arithmetik CLOSEROUND )
            {
            dbg.location(21,17);
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:21:17: ( '-' )?
            int alt14=2;
            try { dbg.enterSubRule(14);
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:21:17: '-'
                    {
                    dbg.location(21,17);
                    match(input,34,FOLLOW_34_in_atom292); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(14);}

            dbg.location(21,22);
            // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:21:22: ( INTEGERCONST | REALCONST | ID | OPENROUND arithmetik CLOSEROUND )
            int alt15=4;
            try { dbg.enterSubRule(15);
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

            switch ( input.LA(1) ) {
            case INTEGERCONST:
                {
                alt15=1;
                }
                break;
            case REALCONST:
                {
                alt15=2;
                }
                break;
            case ID:
                {
                alt15=3;
                }
                break;
            case OPENROUND:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:21:24: INTEGERCONST
                    {
                    dbg.location(21,24);
                    match(input,INTEGERCONST,FOLLOW_INTEGERCONST_in_atom297); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:21:39: REALCONST
                    {
                    dbg.location(21,39);
                    match(input,REALCONST,FOLLOW_REALCONST_in_atom301); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:21:51: ID
                    {
                    dbg.location(21,51);
                    match(input,ID,FOLLOW_ID_in_atom305); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\AufgabeMiniP.g:21:55: OPENROUND arithmetik CLOSEROUND
                    {
                    dbg.location(21,55);
                    match(input,OPENROUND,FOLLOW_OPENROUND_in_atom308); 
                    dbg.location(21,65);
                    pushFollow(FOLLOW_arithmetik_in_atom310);
                    arithmetik();

                    state._fsp--;

                    dbg.location(21,76);
                    match(input,CLOSEROUND,FOLLOW_CLOSEROUND_in_atom312); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(15);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(21, 87);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_PROGRAM_in_start12 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_declaration_in_start14 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_BEGIN_in_start18 = new BitSet(new long[]{0x000000010A0C0000L});
    public static final BitSet FOLLOW_statement_in_start20 = new BitSet(new long[]{0x000000010A0D0000L});
    public static final BitSet FOLLOW_END_in_start23 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATATYPE_in_declaration31 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_declaration33 = new BitSet(new long[]{0x0000000020000200L});
    public static final BitSet FOLLOW_COMMA_in_declaration36 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_declaration38 = new BitSet(new long[]{0x0000000020000200L});
    public static final BitSet FOLLOW_SEM_in_declaration42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement56 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_read_statement_in_statement60 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_while_statement_in_statement64 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_if_statement_in_statement67 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_println_in_statement69 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEM_in_statement72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment85 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGNOR_in_assignment87 = new BitSet(new long[]{0x0000000451140080L});
    public static final BitSet FOLLOW_arithmetik_in_assignment90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compare_in_assignment94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGCONST_in_assignment98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANCONST_in_assignment102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read_statement112 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_OPENROUND_in_read_statement114 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_read_statement116 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CLOSEROUND_in_read_statement118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_statement125 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_compare_in_while_statement127 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DO_in_while_statement129 = new BitSet(new long[]{0x000000010A8C0000L});
    public static final BitSet FOLLOW_statement_in_while_statement131 = new BitSet(new long[]{0x000000010A8C0000L});
    public static final BitSet FOLLOW_OD_in_while_statement134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement151 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_compare_in_if_statement153 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_THEN_in_if_statement155 = new BitSet(new long[]{0x000000010A0C0000L});
    public static final BitSet FOLLOW_statement_in_if_statement157 = new BitSet(new long[]{0x000000010A0E8000L});
    public static final BitSet FOLLOW_ELSE_in_if_statement162 = new BitSet(new long[]{0x000000010A0C0000L});
    public static final BitSet FOLLOW_statement_in_if_statement164 = new BitSet(new long[]{0x000000010A0E0000L});
    public static final BitSet FOLLOW_FI_in_if_statement170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENROUND_in_compare180 = new BitSet(new long[]{0x0000000050140080L});
    public static final BitSet FOLLOW_ID_in_compare183 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_constants_in_compare186 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COMPARATOR_in_compare190 = new BitSet(new long[]{0x0000000050140080L});
    public static final BitSet FOLLOW_ID_in_compare193 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_constants_in_compare195 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CLOSEROUND_in_compare198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINTLN_in_println207 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_OPENROUND_in_println209 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_set_in_println210 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CLOSEROUND_in_println216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicationExpression_in_arithmetik250 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ADD_SUB_in_arithmetik252 = new BitSet(new long[]{0x0000000411140000L});
    public static final BitSet FOLLOW_multiplicationExpression_in_arithmetik254 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_atom_in_multiplicationExpression269 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_MULT_DIV_in_multiplicationExpression271 = new BitSet(new long[]{0x0000000411140000L});
    public static final BitSet FOLLOW_atom_in_multiplicationExpression273 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_34_in_atom292 = new BitSet(new long[]{0x0000000011140000L});
    public static final BitSet FOLLOW_INTEGERCONST_in_atom297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REALCONST_in_atom301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENROUND_in_atom308 = new BitSet(new long[]{0x0000000411140000L});
    public static final BitSet FOLLOW_arithmetik_in_atom310 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CLOSEROUND_in_atom312 = new BitSet(new long[]{0x0000000000000002L});

}