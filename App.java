package apl;

import apl.antlr.SILLexer;
import apl.antlr.SILParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

//import java.io.IOException;

public class App
{
    public static void main( String[] args ) {
        SILLexer lexer = null;
        try {
            lexer = new SILLexer(new ANTLRFileStream("test.s"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        CommonTokenStream tokens = new CommonTokenStream(lexer);
            SILParser parser = new SILParser(tokens);
            parser.program();
    }
}
