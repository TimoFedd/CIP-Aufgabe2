import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        AufgabeMiniPLexer lex = new AufgabeMiniPLexer(new ANTLRFileStream("C:\\Users\\Timo\\Desktop\\cipasda\\Aufgabe1\\Teil2\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        AufgabeMiniPParser g = new AufgabeMiniPParser(tokens, 49100, null);
        try {
            g.start();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}