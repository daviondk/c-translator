package com.daviondk.translator;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class App
{
    public static void main( String[] args )
    {
        CharStream charStream = CharStreams.fromString("def a(b : integer, c : double) : integer { integer a = 3; return 3;} define main() { }");
        ImperativeLanguageLexer imperativeLanguageLexer = new ImperativeLanguageLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(imperativeLanguageLexer);
        ImperativeLanguageParser parser = new ImperativeLanguageParser(commonTokenStream);

        ImperativeLanguageVisitor visitor = new ImperativeLanguageVisitor();
        System.out.println(visitor.visit(parser.program()));
    }
}
