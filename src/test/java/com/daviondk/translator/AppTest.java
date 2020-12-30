package com.daviondk.translator;

import org.antlr.v4.runtime.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testSimpleProgram() {
        String program = "define main() { }";
        String expected = "#include<stdio.h>\n" +
                "#include<stdlib.h>\n" +
                "#include<stdbool.h>\n" +
                "int main() {}\n";

        Assert.assertEquals(expected, translate(program));
    }

    @Test
    public void testFunction() {
        String program = "def a(b : integer, c : double) : integer { integer a = 3; return 3;}";
        String expected = "#include<stdio.h>\n" +
                "#include<stdlib.h>\n" +
                "#include<stdbool.h>\n" +
                "int a(int b, double c){\n" +
                "    int a; a = 3;\n" +
                "    return 3;\n" +
                "}\n";

        Assert.assertEquals(expected, translate(program));
    }

    @Test
    public void testFor() {
        String program = " def main() { for i in 0..5 { println(1); } }";
        String expected = "#include<stdio.h>\n" +
                "#include<stdlib.h>\n" +
                "#include<stdbool.h>\n" +
                "int main() {\n" +
                "    for (int i = 0; i < 5; i++){\n" +
                "        printf(\"%s\\n\", 1);\n" +
                "        }\n" +
                "}\n";

        Assert.assertEquals(expected, translate(program));
    }

    @Test
    public void testWhile() {
        String program = " def main() { integer x = 5; while (x < 10) { x = x + 1; } }";
        String expected = "#include<stdio.h>\n" +
                "#include<stdlib.h>\n" +
                "#include<stdbool.h>\n" +
                "int main() {\n" +
                "    int x; x = 5;\n" +
                "    while (x < 10){\n" +
                "        x = x + 1;\n" +
                "}\n" +
                "}\n";

        Assert.assertEquals(expected, translate(program));
    }

    @Test
    public void testIf() {
        String program = "def main() { integer x = readInt(); if (x < 10) { print(x); } }";
        String expected = "#include<stdio.h>\n" +
                "#include<stdlib.h>\n" +
                "#include<stdbool.h>\n" +
                "int main() {\n" +
                "    int x; scanf(\"%d\", &x);\n" +
                "    if (x < 10){\n" +
                "        printf(\"%s\", x);\n" +
                "        }\n" +
                "}\n";

        Assert.assertEquals(expected, translate(program));
    }

    @Test
    public void testIfElse() {
        String program = "def main() { integer x = readInt(); if (x < 10) { print(x); } else { print(1); } }";
        String expected = "#include<stdio.h>\n" +
                "#include<stdlib.h>\n" +
                "#include<stdbool.h>\n" +
                "int main() {\n" +
                "    int x; scanf(\"%d\", &x);\n" +
                "    if (x < 10){\n" +
                "        printf(\"%s\", x);\n" +
                "        } else {\n" +
                "        printf(\"%s\", 1);\n" +
                "        }\n" +
                "}\n";

        Assert.assertEquals(expected, translate(program));
    }

    @Test
    public void testElseIf() {
        String program = "def main() { double x = readDouble();" +
                " if (x < 10) { print(1); }" +
                " else if (x < 5) { print(2); }" +
                " else { print(3); } }";
        String expected = "#include<stdio.h>\n" +
                "#include<stdlib.h>\n" +
                "#include<stdbool.h>\n" +
                "int main() {\n" +
                "    double x; scanf(\"%f\", &x);\n" +
                "    if (x < 10){\n" +
                "        printf(\"%s\", 1);\n" +
                "        } else if (x < 5){\n" +
                "        printf(\"%s\", 2);\n" +
                "        } else {\n" +
                "        printf(\"%s\", 3);\n" +
                "        }\n" +
                "}\n";

        Assert.assertEquals(expected, translate(program));
    }

    private String translate(String program) {
        System.out.println(program);
        System.out.println();
        CharStream charStream = CharStreams.fromString(program);
        ImperativeLanguageLexer imperativeLanguageLexer = new ImperativeLanguageLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(imperativeLanguageLexer);
        ImperativeLanguageParser parser = new ImperativeLanguageParser(commonTokenStream);

        ImperativeLanguageVisitor visitor = new ImperativeLanguageVisitor();
        String result = visitor.visit(parser.program());
        System.out.println(result);
        return result;
    }
}