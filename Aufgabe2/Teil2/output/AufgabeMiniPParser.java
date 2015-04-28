// $ANTLR 3.4 C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g 2015-04-28 19:12:27

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class AufgabeMiniPParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD_SUB", "ASSIGNOR", "BEGIN", "BOOLEANCONST", "CLOSEROUND", "COMMA", "COMMENTS", "COMPARATOR", "DATATYPE", "DIGIT", "DO", "ELSE", "END", "FI", "ID", "IF", "INTEGERCONST", "LETTER", "MULT_DIV", "OD", "OPENROUND", "PRINTLN", "PROGRAM", "READ", "REALCONST", "SEM", "STRINGCONST", "THEN", "WHILE", "WS"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "statement", "mult_expression", "arithmetik", "while_statement", 
    "compare", "start", "assignment", "if_statement", "read_statement", 
    "println", "declaration", "constants", "atom"
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
            new DebugEventSocketProxy(this,port,adaptor);
        setDebugListener(proxy);
        setTokenStream(new DebugTokenStream(input,proxy));
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);
        proxy.setTreeAdaptor(adap);
    }

public AufgabeMiniPParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg);
     
    TreeAdaptor adap = new CommonTreeAdaptor();
    setTreeAdaptor(adap);


}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

protected DebugTreeAdaptor adaptor;
public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = new DebugTreeAdaptor(dbg,adaptor);


}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}

    public String[] getTokenNames() { return AufgabeMiniPParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g"; }


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:4:1: start : PROGRAM ( declaration )* BEGIN ( statement )+ END ;
    public final AufgabeMiniPParser.start_return start() throws RecognitionException {
        AufgabeMiniPParser.start_return retval = new AufgabeMiniPParser.start_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PROGRAM1=null;
        Token BEGIN3=null;
        Token END5=null;
        AufgabeMiniPParser.declaration_return declaration2 =null;

        AufgabeMiniPParser.statement_return statement4 =null;


        Object PROGRAM1_tree=null;
        Object BEGIN3_tree=null;
        Object END5_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(4, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:4:8: ( PROGRAM ( declaration )* BEGIN ( statement )+ END )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:4:10: PROGRAM ( declaration )* BEGIN ( statement )+ END
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(4,10);
            PROGRAM1=(Token)match(input,PROGRAM,FOLLOW_PROGRAM_in_start12); 
            PROGRAM1_tree = 
            (Object)adaptor.create(PROGRAM1)
            ;
            adaptor.addChild(root_0, PROGRAM1_tree);

            dbg.location(4,18);
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:4:18: ( declaration )*
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

            	    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:4:18: declaration
            	    {
            	    dbg.location(4,18);
            	    pushFollow(FOLLOW_declaration_in_start14);
            	    declaration2=declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declaration2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(4,32);
            BEGIN3=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_start18); 
            BEGIN3_tree = 
            (Object)adaptor.create(BEGIN3)
            ;
            adaptor.addChild(root_0, BEGIN3_tree);

            dbg.location(4,38);
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:4:38: ( statement )+
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

            	    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:4:38: statement
            	    {
            	    dbg.location(4,38);
            	    pushFollow(FOLLOW_statement_in_start20);
            	    statement4=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement4.getTree());

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
            END5=(Token)match(input,END,FOLLOW_END_in_start23); 
            END5_tree = 
            (Object)adaptor.create(END5)
            ;
            adaptor.addChild(root_0, END5_tree);


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
        dbg.location(4, 51);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "start"


    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:5:1: declaration : DATATYPE ID ( COMMA ID )* SEM ;
    public final AufgabeMiniPParser.declaration_return declaration() throws RecognitionException {
        AufgabeMiniPParser.declaration_return retval = new AufgabeMiniPParser.declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATATYPE6=null;
        Token ID7=null;
        Token COMMA8=null;
        Token ID9=null;
        Token SEM10=null;

        Object DATATYPE6_tree=null;
        Object ID7_tree=null;
        Object COMMA8_tree=null;
        Object ID9_tree=null;
        Object SEM10_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(5, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:5:13: ( DATATYPE ID ( COMMA ID )* SEM )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:5:15: DATATYPE ID ( COMMA ID )* SEM
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(5,15);
            DATATYPE6=(Token)match(input,DATATYPE,FOLLOW_DATATYPE_in_declaration31); 
            DATATYPE6_tree = 
            (Object)adaptor.create(DATATYPE6)
            ;
            adaptor.addChild(root_0, DATATYPE6_tree);

            dbg.location(5,24);
            ID7=(Token)match(input,ID,FOLLOW_ID_in_declaration33); 
            ID7_tree = 
            (Object)adaptor.create(ID7)
            ;
            adaptor.addChild(root_0, ID7_tree);

            dbg.location(5,27);
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:5:27: ( COMMA ID )*
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

            	    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:5:28: COMMA ID
            	    {
            	    dbg.location(5,28);
            	    COMMA8=(Token)match(input,COMMA,FOLLOW_COMMA_in_declaration36); 
            	    COMMA8_tree = 
            	    (Object)adaptor.create(COMMA8)
            	    ;
            	    adaptor.addChild(root_0, COMMA8_tree);

            	    dbg.location(5,34);
            	    ID9=(Token)match(input,ID,FOLLOW_ID_in_declaration38); 
            	    ID9_tree = 
            	    (Object)adaptor.create(ID9)
            	    ;
            	    adaptor.addChild(root_0, ID9_tree);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}

            dbg.location(5,39);
            SEM10=(Token)match(input,SEM,FOLLOW_SEM_in_declaration42); 
            SEM10_tree = 
            (Object)adaptor.create(SEM10)
            ;
            adaptor.addChild(root_0, SEM10_tree);


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
        dbg.location(5, 41);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "declaration"


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:6:1: statement : ( assignment | read_statement | while_statement | if_statement | println ) ^ SEM !;
    public final AufgabeMiniPParser.statement_return statement() throws RecognitionException {
        AufgabeMiniPParser.statement_return retval = new AufgabeMiniPParser.statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEM16=null;
        AufgabeMiniPParser.assignment_return assignment11 =null;

        AufgabeMiniPParser.read_statement_return read_statement12 =null;

        AufgabeMiniPParser.while_statement_return while_statement13 =null;

        AufgabeMiniPParser.if_statement_return if_statement14 =null;

        AufgabeMiniPParser.println_return println15 =null;


        Object SEM16_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(6, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:6:17: ( ( assignment | read_statement | while_statement | if_statement | println ) ^ SEM !)
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:6:19: ( assignment | read_statement | while_statement | if_statement | println ) ^ SEM !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(6,91);
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:6:19: ( assignment | read_statement | while_statement | if_statement | println )
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

                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:6:20: assignment
                    {
                    dbg.location(6,20);
                    pushFollow(FOLLOW_assignment_in_statement56);
                    assignment11=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment11.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:6:33: read_statement
                    {
                    dbg.location(6,33);
                    pushFollow(FOLLOW_read_statement_in_statement60);
                    read_statement12=read_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, read_statement12.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:6:50: while_statement
                    {
                    dbg.location(6,50);
                    pushFollow(FOLLOW_while_statement_in_statement64);
                    while_statement13=while_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, while_statement13.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:6:68: if_statement
                    {
                    dbg.location(6,68);
                    pushFollow(FOLLOW_if_statement_in_statement68);
                    if_statement14=if_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, if_statement14.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:6:83: println
                    {
                    dbg.location(6,83);
                    pushFollow(FOLLOW_println_in_statement72);
                    println15=println();

                    state._fsp--;

                    adaptor.addChild(root_0, println15.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(6,96);
            SEM16=(Token)match(input,SEM,FOLLOW_SEM_in_statement76); 

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
        dbg.location(6, 96);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "statement"


    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:9:1: assignment : ID ASSIGNOR ^ ( arithmetik | compare | STRINGCONST | BOOLEANCONST ) ;
    public final AufgabeMiniPParser.assignment_return assignment() throws RecognitionException {
        AufgabeMiniPParser.assignment_return retval = new AufgabeMiniPParser.assignment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID17=null;
        Token ASSIGNOR18=null;
        Token STRINGCONST21=null;
        Token BOOLEANCONST22=null;
        AufgabeMiniPParser.arithmetik_return arithmetik19 =null;

        AufgabeMiniPParser.compare_return compare20 =null;


        Object ID17_tree=null;
        Object ASSIGNOR18_tree=null;
        Object STRINGCONST21_tree=null;
        Object BOOLEANCONST22_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "assignment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(9, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:9:17: ( ID ASSIGNOR ^ ( arithmetik | compare | STRINGCONST | BOOLEANCONST ) )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:9:19: ID ASSIGNOR ^ ( arithmetik | compare | STRINGCONST | BOOLEANCONST )
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(9,19);
            ID17=(Token)match(input,ID,FOLLOW_ID_in_assignment91); 
            ID17_tree = 
            (Object)adaptor.create(ID17)
            ;
            adaptor.addChild(root_0, ID17_tree);

            dbg.location(9,30);
            ASSIGNOR18=(Token)match(input,ASSIGNOR,FOLLOW_ASSIGNOR_in_assignment93); 
            ASSIGNOR18_tree = 
            (Object)adaptor.create(ASSIGNOR18)
            ;
            root_0 = (Object)adaptor.becomeRoot(ASSIGNOR18_tree, root_0);

            dbg.location(9,32);
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:9:32: ( arithmetik | compare | STRINGCONST | BOOLEANCONST )
            int alt5=4;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            switch ( input.LA(1) ) {
            case ADD_SUB:
            case ID:
            case INTEGERCONST:
            case REALCONST:
                {
                alt5=1;
                }
                break;
            case OPENROUND:
                {
                switch ( input.LA(2) ) {
                case ADD_SUB:
                case OPENROUND:
                    {
                    alt5=1;
                    }
                    break;
                case INTEGERCONST:
                case REALCONST:
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
                case ID:
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

                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:9:33: arithmetik
                    {
                    dbg.location(9,33);
                    pushFollow(FOLLOW_arithmetik_in_assignment97);
                    arithmetik19=arithmetik();

                    state._fsp--;

                    adaptor.addChild(root_0, arithmetik19.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:9:47: compare
                    {
                    dbg.location(9,47);
                    pushFollow(FOLLOW_compare_in_assignment102);
                    compare20=compare();

                    state._fsp--;

                    adaptor.addChild(root_0, compare20.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:9:57: STRINGCONST
                    {
                    dbg.location(9,57);
                    STRINGCONST21=(Token)match(input,STRINGCONST,FOLLOW_STRINGCONST_in_assignment106); 
                    STRINGCONST21_tree = 
                    (Object)adaptor.create(STRINGCONST21)
                    ;
                    adaptor.addChild(root_0, STRINGCONST21_tree);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:9:71: BOOLEANCONST
                    {
                    dbg.location(9,71);
                    BOOLEANCONST22=(Token)match(input,BOOLEANCONST,FOLLOW_BOOLEANCONST_in_assignment110); 
                    BOOLEANCONST22_tree = 
                    (Object)adaptor.create(BOOLEANCONST22)
                    ;
                    adaptor.addChild(root_0, BOOLEANCONST22_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}


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
        dbg.location(9, 83);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "assignment"


    public static class read_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read_statement"
    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:10:1: read_statement : READ OPENROUND ID CLOSEROUND ;
    public final AufgabeMiniPParser.read_statement_return read_statement() throws RecognitionException {
        AufgabeMiniPParser.read_statement_return retval = new AufgabeMiniPParser.read_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token READ23=null;
        Token OPENROUND24=null;
        Token ID25=null;
        Token CLOSEROUND26=null;

        Object READ23_tree=null;
        Object OPENROUND24_tree=null;
        Object ID25_tree=null;
        Object CLOSEROUND26_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "read_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(10, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:10:17: ( READ OPENROUND ID CLOSEROUND )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:10:20: READ OPENROUND ID CLOSEROUND
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(10,20);
            READ23=(Token)match(input,READ,FOLLOW_READ_in_read_statement120); 
            READ23_tree = 
            (Object)adaptor.create(READ23)
            ;
            adaptor.addChild(root_0, READ23_tree);

            dbg.location(10,25);
            OPENROUND24=(Token)match(input,OPENROUND,FOLLOW_OPENROUND_in_read_statement122); 
            OPENROUND24_tree = 
            (Object)adaptor.create(OPENROUND24)
            ;
            adaptor.addChild(root_0, OPENROUND24_tree);

            dbg.location(10,35);
            ID25=(Token)match(input,ID,FOLLOW_ID_in_read_statement124); 
            ID25_tree = 
            (Object)adaptor.create(ID25)
            ;
            adaptor.addChild(root_0, ID25_tree);

            dbg.location(10,38);
            CLOSEROUND26=(Token)match(input,CLOSEROUND,FOLLOW_CLOSEROUND_in_read_statement126); 
            CLOSEROUND26_tree = 
            (Object)adaptor.create(CLOSEROUND26)
            ;
            adaptor.addChild(root_0, CLOSEROUND26_tree);


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
        dbg.location(10, 47);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "read_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "read_statement"


    public static class while_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_statement"
    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:11:1: while_statement : WHILE ^ compare DO ! ( statement )* OD !;
    public final AufgabeMiniPParser.while_statement_return while_statement() throws RecognitionException {
        AufgabeMiniPParser.while_statement_return retval = new AufgabeMiniPParser.while_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHILE27=null;
        Token DO29=null;
        Token OD31=null;
        AufgabeMiniPParser.compare_return compare28 =null;

        AufgabeMiniPParser.statement_return statement30 =null;


        Object WHILE27_tree=null;
        Object DO29_tree=null;
        Object OD31_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "while_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(11, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:11:17: ( WHILE ^ compare DO ! ( statement )* OD !)
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:11:19: WHILE ^ compare DO ! ( statement )* OD !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(11,24);
            WHILE27=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement133); 
            WHILE27_tree = 
            (Object)adaptor.create(WHILE27)
            ;
            root_0 = (Object)adaptor.becomeRoot(WHILE27_tree, root_0);

            dbg.location(11,26);
            pushFollow(FOLLOW_compare_in_while_statement136);
            compare28=compare();

            state._fsp--;

            adaptor.addChild(root_0, compare28.getTree());
            dbg.location(11,36);
            DO29=(Token)match(input,DO,FOLLOW_DO_in_while_statement138); 
            dbg.location(11,38);
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:11:38: ( statement )*
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

            	    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:11:38: statement
            	    {
            	    dbg.location(11,38);
            	    pushFollow(FOLLOW_statement_in_while_statement141);
            	    statement30=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement30.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}

            dbg.location(11,51);
            OD31=(Token)match(input,OD,FOLLOW_OD_in_while_statement144); 

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
        dbg.location(11, 51);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "while_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "while_statement"


    public static class if_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_statement"
    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:12:1: if_statement : IF compare THEN ( statement )+ ( ELSE ( statement )+ )? FI ;
    public final AufgabeMiniPParser.if_statement_return if_statement() throws RecognitionException {
        AufgabeMiniPParser.if_statement_return retval = new AufgabeMiniPParser.if_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF32=null;
        Token THEN34=null;
        Token ELSE36=null;
        Token FI38=null;
        AufgabeMiniPParser.compare_return compare33 =null;

        AufgabeMiniPParser.statement_return statement35 =null;

        AufgabeMiniPParser.statement_return statement37 =null;


        Object IF32_tree=null;
        Object THEN34_tree=null;
        Object ELSE36_tree=null;
        Object FI38_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "if_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(12, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:12:17: ( IF compare THEN ( statement )+ ( ELSE ( statement )+ )? FI )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:12:25: IF compare THEN ( statement )+ ( ELSE ( statement )+ )? FI
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(12,25);
            IF32=(Token)match(input,IF,FOLLOW_IF_in_if_statement162); 
            IF32_tree = 
            (Object)adaptor.create(IF32)
            ;
            adaptor.addChild(root_0, IF32_tree);

            dbg.location(12,28);
            pushFollow(FOLLOW_compare_in_if_statement164);
            compare33=compare();

            state._fsp--;

            adaptor.addChild(root_0, compare33.getTree());
            dbg.location(12,36);
            THEN34=(Token)match(input,THEN,FOLLOW_THEN_in_if_statement166); 
            THEN34_tree = 
            (Object)adaptor.create(THEN34)
            ;
            adaptor.addChild(root_0, THEN34_tree);

            dbg.location(12,41);
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:12:41: ( statement )+
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

            	    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:12:41: statement
            	    {
            	    dbg.location(12,41);
            	    pushFollow(FOLLOW_statement_in_if_statement168);
            	    statement35=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement35.getTree());

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

            dbg.location(12,52);
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:12:52: ( ELSE ( statement )+ )?
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

                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:12:53: ELSE ( statement )+
                    {
                    dbg.location(12,53);
                    ELSE36=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement172); 
                    ELSE36_tree = 
                    (Object)adaptor.create(ELSE36)
                    ;
                    adaptor.addChild(root_0, ELSE36_tree);

                    dbg.location(12,58);
                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:12:58: ( statement )+
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

                    	    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:12:58: statement
                    	    {
                    	    dbg.location(12,58);
                    	    pushFollow(FOLLOW_statement_in_if_statement174);
                    	    statement37=statement();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, statement37.getTree());

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

            dbg.location(12,72);
            FI38=(Token)match(input,FI,FOLLOW_FI_in_if_statement180); 
            FI38_tree = 
            (Object)adaptor.create(FI38)
            ;
            adaptor.addChild(root_0, FI38_tree);


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
        dbg.location(12, 73);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "if_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "if_statement"


    public static class compare_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compare"
    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:15:1: compare : OPENROUND ! ( ID | constants ) COMPARATOR ^ ( ID | constants ) CLOSEROUND !;
    public final AufgabeMiniPParser.compare_return compare() throws RecognitionException {
        AufgabeMiniPParser.compare_return retval = new AufgabeMiniPParser.compare_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OPENROUND39=null;
        Token ID40=null;
        Token COMPARATOR42=null;
        Token ID43=null;
        Token CLOSEROUND45=null;
        AufgabeMiniPParser.constants_return constants41 =null;

        AufgabeMiniPParser.constants_return constants44 =null;


        Object OPENROUND39_tree=null;
        Object ID40_tree=null;
        Object COMPARATOR42_tree=null;
        Object ID43_tree=null;
        Object CLOSEROUND45_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "compare");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:15:10: ( OPENROUND ! ( ID | constants ) COMPARATOR ^ ( ID | constants ) CLOSEROUND !)
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:15:12: OPENROUND ! ( ID | constants ) COMPARATOR ^ ( ID | constants ) CLOSEROUND !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(15,21);
            OPENROUND39=(Token)match(input,OPENROUND,FOLLOW_OPENROUND_in_compare191); 
            dbg.location(15,23);
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:15:23: ( ID | constants )
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

                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:15:24: ID
                    {
                    dbg.location(15,24);
                    ID40=(Token)match(input,ID,FOLLOW_ID_in_compare195); 
                    ID40_tree = 
                    (Object)adaptor.create(ID40)
                    ;
                    adaptor.addChild(root_0, ID40_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:15:29: constants
                    {
                    dbg.location(15,29);
                    pushFollow(FOLLOW_constants_in_compare199);
                    constants41=constants();

                    state._fsp--;

                    adaptor.addChild(root_0, constants41.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}

            dbg.location(15,50);
            COMPARATOR42=(Token)match(input,COMPARATOR,FOLLOW_COMPARATOR_in_compare202); 
            COMPARATOR42_tree = 
            (Object)adaptor.create(COMPARATOR42)
            ;
            root_0 = (Object)adaptor.becomeRoot(COMPARATOR42_tree, root_0);

            dbg.location(15,52);
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:15:52: ( ID | constants )
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

                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:15:53: ID
                    {
                    dbg.location(15,53);
                    ID43=(Token)match(input,ID,FOLLOW_ID_in_compare206); 
                    ID43_tree = 
                    (Object)adaptor.create(ID43)
                    ;
                    adaptor.addChild(root_0, ID43_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:15:58: constants
                    {
                    dbg.location(15,58);
                    pushFollow(FOLLOW_constants_in_compare210);
                    constants44=constants();

                    state._fsp--;

                    adaptor.addChild(root_0, constants44.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(11);}

            dbg.location(15,79);
            CLOSEROUND45=(Token)match(input,CLOSEROUND,FOLLOW_CLOSEROUND_in_compare213); 

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
        dbg.location(15, 79);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "compare");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "compare"


    public static class println_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "println"
    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:16:1: println : PRINTLN ^ OPENROUND ! ( ID | STRINGCONST ) CLOSEROUND !;
    public final AufgabeMiniPParser.println_return println() throws RecognitionException {
        AufgabeMiniPParser.println_return retval = new AufgabeMiniPParser.println_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PRINTLN46=null;
        Token OPENROUND47=null;
        Token set48=null;
        Token CLOSEROUND49=null;

        Object PRINTLN46_tree=null;
        Object OPENROUND47_tree=null;
        Object set48_tree=null;
        Object CLOSEROUND49_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "println");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(16, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:16:10: ( PRINTLN ^ OPENROUND ! ( ID | STRINGCONST ) CLOSEROUND !)
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:16:12: PRINTLN ^ OPENROUND ! ( ID | STRINGCONST ) CLOSEROUND !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(16,19);
            PRINTLN46=(Token)match(input,PRINTLN,FOLLOW_PRINTLN_in_println224); 
            PRINTLN46_tree = 
            (Object)adaptor.create(PRINTLN46)
            ;
            root_0 = (Object)adaptor.becomeRoot(PRINTLN46_tree, root_0);

            dbg.location(16,30);
            OPENROUND47=(Token)match(input,OPENROUND,FOLLOW_OPENROUND_in_println227); 
            dbg.location(16,31);
            set48=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==STRINGCONST ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set48)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(16,60);
            CLOSEROUND49=(Token)match(input,CLOSEROUND,FOLLOW_CLOSEROUND_in_println237); 

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
        dbg.location(16, 60);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "println");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "println"


    public static class constants_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constants"
    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:18:1: constants : ( BOOLEANCONST | STRINGCONST | REALCONST | INTEGERCONST );
    public final AufgabeMiniPParser.constants_return constants() throws RecognitionException {
        AufgabeMiniPParser.constants_return retval = new AufgabeMiniPParser.constants_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set50=null;

        Object set50_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "constants");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:18:11: ( BOOLEANCONST | STRINGCONST | REALCONST | INTEGERCONST )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(18,11);
            set50=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEANCONST||input.LA(1)==INTEGERCONST||input.LA(1)==REALCONST||input.LA(1)==STRINGCONST ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set50)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
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
        dbg.location(18, 65);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "constants");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "constants"


    public static class arithmetik_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arithmetik"
    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:20:1: arithmetik : mult_expression ( ADD_SUB ^ mult_expression )* ;
    public final AufgabeMiniPParser.arithmetik_return arithmetik() throws RecognitionException {
        AufgabeMiniPParser.arithmetik_return retval = new AufgabeMiniPParser.arithmetik_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ADD_SUB52=null;
        AufgabeMiniPParser.mult_expression_return mult_expression51 =null;

        AufgabeMiniPParser.mult_expression_return mult_expression53 =null;


        Object ADD_SUB52_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "arithmetik");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(20, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:20:12: ( mult_expression ( ADD_SUB ^ mult_expression )* )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:20:14: mult_expression ( ADD_SUB ^ mult_expression )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(20,14);
            pushFollow(FOLLOW_mult_expression_in_arithmetik266);
            mult_expression51=mult_expression();

            state._fsp--;

            adaptor.addChild(root_0, mult_expression51.getTree());
            dbg.location(20,29);
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:20:29: ( ADD_SUB ^ mult_expression )*
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

            	    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:20:30: ADD_SUB ^ mult_expression
            	    {
            	    dbg.location(20,37);
            	    ADD_SUB52=(Token)match(input,ADD_SUB,FOLLOW_ADD_SUB_in_arithmetik268); 
            	    ADD_SUB52_tree = 
            	    (Object)adaptor.create(ADD_SUB52)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(ADD_SUB52_tree, root_0);

            	    dbg.location(20,39);
            	    pushFollow(FOLLOW_mult_expression_in_arithmetik271);
            	    mult_expression53=mult_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mult_expression53.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}


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
        dbg.location(20, 55);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arithmetik");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "arithmetik"


    public static class mult_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mult_expression"
    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:21:1: mult_expression : atom ( MULT_DIV ^ atom )* ;
    public final AufgabeMiniPParser.mult_expression_return mult_expression() throws RecognitionException {
        AufgabeMiniPParser.mult_expression_return retval = new AufgabeMiniPParser.mult_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MULT_DIV55=null;
        AufgabeMiniPParser.atom_return atom54 =null;

        AufgabeMiniPParser.atom_return atom56 =null;


        Object MULT_DIV55_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "mult_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:21:17: ( atom ( MULT_DIV ^ atom )* )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:21:25: atom ( MULT_DIV ^ atom )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(21,25);
            pushFollow(FOLLOW_atom_in_mult_expression286);
            atom54=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom54.getTree());
            dbg.location(21,29);
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:21:29: ( MULT_DIV ^ atom )*
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

            	    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:21:30: MULT_DIV ^ atom
            	    {
            	    dbg.location(21,38);
            	    MULT_DIV55=(Token)match(input,MULT_DIV,FOLLOW_MULT_DIV_in_mult_expression288); 
            	    MULT_DIV55_tree = 
            	    (Object)adaptor.create(MULT_DIV55)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(MULT_DIV55_tree, root_0);

            	    dbg.location(21,40);
            	    pushFollow(FOLLOW_atom_in_mult_expression291);
            	    atom56=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom56.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}


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
        dbg.location(21, 46);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mult_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "mult_expression"


    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:22:1: atom : ( ( ADD_SUB ^)? ( INTEGERCONST | REALCONST ) | OPENROUND ! arithmetik CLOSEROUND !| ID );
    public final AufgabeMiniPParser.atom_return atom() throws RecognitionException {
        AufgabeMiniPParser.atom_return retval = new AufgabeMiniPParser.atom_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ADD_SUB57=null;
        Token set58=null;
        Token OPENROUND59=null;
        Token CLOSEROUND61=null;
        Token ID62=null;
        AufgabeMiniPParser.arithmetik_return arithmetik60 =null;


        Object ADD_SUB57_tree=null;
        Object set58_tree=null;
        Object OPENROUND59_tree=null;
        Object CLOSEROUND61_tree=null;
        Object ID62_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(22, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:22:7: ( ( ADD_SUB ^)? ( INTEGERCONST | REALCONST ) | OPENROUND ! arithmetik CLOSEROUND !| ID )
            int alt15=3;
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

            switch ( input.LA(1) ) {
            case ADD_SUB:
            case INTEGERCONST:
            case REALCONST:
                {
                alt15=1;
                }
                break;
            case OPENROUND:
                {
                alt15=2;
                }
                break;
            case ID:
                {
                alt15=3;
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

                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:22:15: ( ADD_SUB ^)? ( INTEGERCONST | REALCONST )
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(22,22);
                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:22:22: ( ADD_SUB ^)?
                    int alt14=2;
                    try { dbg.enterSubRule(14);
                    try { dbg.enterDecision(14, decisionCanBacktrack[14]);

                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ADD_SUB) ) {
                        alt14=1;
                    }
                    } finally {dbg.exitDecision(14);}

                    switch (alt14) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:22:22: ADD_SUB ^
                            {
                            dbg.location(22,22);
                            ADD_SUB57=(Token)match(input,ADD_SUB,FOLLOW_ADD_SUB_in_atom308); 
                            ADD_SUB57_tree = 
                            (Object)adaptor.create(ADD_SUB57)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(ADD_SUB57_tree, root_0);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(14);}

                    dbg.location(22,25);
                    set58=(Token)input.LT(1);

                    if ( input.LA(1)==INTEGERCONST||input.LA(1)==REALCONST ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set58)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:22:54: OPENROUND ! arithmetik CLOSEROUND !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(22,63);
                    OPENROUND59=(Token)match(input,OPENROUND,FOLLOW_OPENROUND_in_atom322); 
                    dbg.location(22,65);
                    pushFollow(FOLLOW_arithmetik_in_atom325);
                    arithmetik60=arithmetik();

                    state._fsp--;

                    adaptor.addChild(root_0, arithmetik60.getTree());
                    dbg.location(22,86);
                    CLOSEROUND61=(Token)match(input,CLOSEROUND,FOLLOW_CLOSEROUND_in_atom327); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Timo\\Desktop\\CIP-Aufgabe2\\Aufgabe2\\Teil2\\AufgabeMiniP.g:22:90: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(22,90);
                    ID62=(Token)match(input,ID,FOLLOW_ID_in_atom332); 
                    ID62_tree = 
                    (Object)adaptor.create(ID62)
                    ;
                    adaptor.addChild(root_0, ID62_tree);


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
        dbg.location(22, 91);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
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
    public static final BitSet FOLLOW_if_statement_in_statement68 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_println_in_statement72 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEM_in_statement76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment91 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGNOR_in_assignment93 = new BitSet(new long[]{0x0000000051140090L});
    public static final BitSet FOLLOW_arithmetik_in_assignment97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compare_in_assignment102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGCONST_in_assignment106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANCONST_in_assignment110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read_statement120 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_OPENROUND_in_read_statement122 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_read_statement124 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CLOSEROUND_in_read_statement126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_statement133 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_compare_in_while_statement136 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DO_in_while_statement138 = new BitSet(new long[]{0x000000010A8C0000L});
    public static final BitSet FOLLOW_statement_in_while_statement141 = new BitSet(new long[]{0x000000010A8C0000L});
    public static final BitSet FOLLOW_OD_in_while_statement144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement162 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_compare_in_if_statement164 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_THEN_in_if_statement166 = new BitSet(new long[]{0x000000010A0C0000L});
    public static final BitSet FOLLOW_statement_in_if_statement168 = new BitSet(new long[]{0x000000010A0E8000L});
    public static final BitSet FOLLOW_ELSE_in_if_statement172 = new BitSet(new long[]{0x000000010A0C0000L});
    public static final BitSet FOLLOW_statement_in_if_statement174 = new BitSet(new long[]{0x000000010A0E0000L});
    public static final BitSet FOLLOW_FI_in_if_statement180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENROUND_in_compare191 = new BitSet(new long[]{0x0000000050140080L});
    public static final BitSet FOLLOW_ID_in_compare195 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_constants_in_compare199 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COMPARATOR_in_compare202 = new BitSet(new long[]{0x0000000050140080L});
    public static final BitSet FOLLOW_ID_in_compare206 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_constants_in_compare210 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CLOSEROUND_in_compare213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINTLN_in_println224 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_OPENROUND_in_println227 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_set_in_println229 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CLOSEROUND_in_println237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mult_expression_in_arithmetik266 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ADD_SUB_in_arithmetik268 = new BitSet(new long[]{0x0000000011140010L});
    public static final BitSet FOLLOW_mult_expression_in_arithmetik271 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_atom_in_mult_expression286 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_MULT_DIV_in_mult_expression288 = new BitSet(new long[]{0x0000000011140010L});
    public static final BitSet FOLLOW_atom_in_mult_expression291 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ADD_SUB_in_atom308 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_set_in_atom312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENROUND_in_atom322 = new BitSet(new long[]{0x0000000011140010L});
    public static final BitSet FOLLOW_arithmetik_in_atom325 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CLOSEROUND_in_atom327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom332 = new BitSet(new long[]{0x0000000000000002L});

}