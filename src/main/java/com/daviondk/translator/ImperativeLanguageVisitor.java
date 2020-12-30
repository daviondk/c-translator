package com.daviondk.translator;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class ImperativeLanguageVisitor extends ImperativeLanguageParserBaseVisitor<String> {

    private static final String SPACE = " ";
    private static final String TAB = "    ";
    private static final String LINE_SEPARATOR = "\n";
    private static final String HEADER = "#include<stdio.h>\n#include<stdlib.h>\n#include<stdbool.h>\n";
    private static final String READ_TEMPLATE = "scanf(\"%%%s\", &%s);";
    private static final String PRINT_TEMPLATE = "printf(\"%%%s\", %s);";
    private int depth;

    public ImperativeLanguageVisitor() {
        this.depth = 0;
    }

    @Override
    public String visitProgram(ImperativeLanguageParser.ProgramContext ctx) {
        return HEADER + visitStatements(ctx.statements());
    }

    @Override
    public String visitStatements(ImperativeLanguageParser.StatementsContext ctx) {
        StringBuilder sb = new StringBuilder();
        ctx.children.forEach(e -> sb.append(visit(e)));
        return sb.toString();
    }

    @Override
    public String visitFunction(ImperativeLanguageParser.FunctionContext ctx) {
        return visitType(ctx.type()) + SPACE +
                ctx.NAME().getText() +
                ctx.LPAREN().getText() +
                visitArgs(ctx.args()) +
                ctx.RPAREN().getText() +
                visitFunctionBody(ctx.functionBody());
    }

    @Override
    public String visitArgs(ImperativeLanguageParser.ArgsContext ctx) {
        if (ctx.children.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List<ImperativeLanguageParser.TypeContext> types = ctx.type();
        List<TerminalNode> names = ctx.NAME();
        sb.append(visitType(types.get(0))).append(SPACE).append(names.get(0).getText());

        for (int i = 1; i < names.size(); i++) {
            sb.append(", ");
            sb.append(types.get(i).getText());
            sb.append(SPACE);
            sb.append(names.get(i).getText());
        }
        return sb.toString();
    }

    @Override
    public String visitType(ImperativeLanguageParser.TypeContext ctx) {
        String text = ctx.TYPENAME().getText();
        switch (text) {
            case "string":
                return "char*";
            case "boolean":
                return "bool";
            case "integer":
                return "int";
            default:
                return text;
        }
    }

    @Override
    public String visitFunctionBody(ImperativeLanguageParser.FunctionBodyContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(ctx.LBRACE().getText());
        depth++;
        sb.append(visitStatement(ctx.statement()))
                .append(visitReturnStatement(ctx.returnStatement()));
        depth--;
        sb.append(ctx.RBRACE().getText());
        sb.append(LINE_SEPARATOR);
        return sb.toString();
    }

    @Override
    public String visitStatement(ImperativeLanguageParser.StatementContext ctx) {
        if (ctx.children == null || ctx.children.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(LINE_SEPARATOR);
        int size = ctx.children.size();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < depth; j++) {
                sb.append(TAB);
            }
            if (!(ctx.getChild(i) instanceof TerminalNode)) {
                sb.append(visit(ctx.getChild(i))).append(LINE_SEPARATOR);
            }
        }
        return sb.toString();
    }

    @Override
    public String visitAssignment(ImperativeLanguageParser.AssignmentContext ctx) {
        if (ctx.getChild(2) instanceof ImperativeLanguageParser.CallReadContext) {
            String format = "s";
            ParseTree read = ctx.getChild(2).getChild(0);
            if (read instanceof ImperativeLanguageParser.CallReadIntContext) {
                format = "d";
            } else if (read instanceof ImperativeLanguageParser.CallReadDoubleContext) {
                format = "f";
            }

            return String.format(READ_TEMPLATE, format, ctx.NAME().getText());
        }
        return ctx.NAME().getText() + SPACE + ctx.ASSIGN() + SPACE + visitExpr(ctx.expr()) + ctx.SEMICOLON();
    }

    @Override
    public String visitValue(ImperativeLanguageParser.ValueContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCallPrint(ImperativeLanguageParser.CallPrintContext ctx) {
        String format = "s";
        String arg = visit(ctx.expr());
        String printToken = ctx.getChild(0).getText();
        switch (printToken) {
            case "println":
                format += "\\n";
                break;
            case "printInt":
                format = "d";
                break;
            case "printDouble":
                format = "f";
                break;
        }
        return String.format(PRINT_TEMPLATE, format, arg);
    }

    @Override
    public String visitCallUser(ImperativeLanguageParser.CallUserContext ctx) {
        return ctx.NAME().getText() +
                ctx.LPAREN().getText() +
                visit(ctx.callArgs()) +
                ctx.RPAREN().getText();
    }

    @Override
    public String visitCallArgs(ImperativeLanguageParser.CallArgsContext ctx) {
        if (ctx.children.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List<TerminalNode> names = ctx.NAME();
        sb.append(names.get(0).getText());
        for (int i = 1; i < names.size(); i++) {
            sb.append(", ");
            sb.append(names.get(i).getText());
        }
        return sb.toString();
    }

    @Override
    public String visitExpr(ImperativeLanguageParser.ExprContext ctx) {
        return visitBaseExpression(ctx);
    }

    @Override
    public String visitMaxExpr(ImperativeLanguageParser.MaxExprContext ctx) {
        return visitBaseExpression(ctx);
    }

    private String visitBaseExpression(ParserRuleContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(visit(ctx.getChild(0)));
        if (ctx.children.size() > 1) {
            String operation;
            String oldOperation = ctx.getChild(1).getText();
            switch (oldOperation) {
                case "or":
                    operation = "|";
                    break;
                case "and":
                    operation = "&";
                    break;
                case "xor":
                    operation = "xor";
                    break;
                default:
                    operation = oldOperation;
            }
            sb.append(SPACE).append(operation).append(SPACE).append(visit(ctx.getChild(2)));
        }
        return sb.toString();
    }

    @Override
    public String visitUnary(ImperativeLanguageParser.UnaryContext ctx) {
        if (ctx.children.size() == 2) {
            return "~" + visitUnary(ctx.unary());
        }
        return visitRecExpr(ctx.recExpr());
    }

    @Override
    public String visitRecExpr(ImperativeLanguageParser.RecExprContext ctx) {
        if (ctx.children.size() == 3) {
            return ctx.LPAREN().getText() + visitExpr(ctx.expr()) + ctx.RPAREN().getText();
        }
        return visit(ctx.getChild(0));
    }

    @Override
    public String visitLogical(ImperativeLanguageParser.LogicalContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitConditionStatement(ImperativeLanguageParser.ConditionStatementContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(ctx.IF().getText())
                .append(SPACE)
                .append(ctx.LPAREN().getText())
                .append(visitExpr(ctx.expr()))
                .append(ctx.RPAREN().getText())
                .append(ctx.LBRACE().get(0).getText());
        depth++;
        sb.append(visitStatement(ctx.statement(0)));
        depth--;
        sb.append(ctx.RBRACE(0).getText());
        if (ctx.children.size() > 7) {
            sb.append(SPACE);
            sb.append(ctx.ELSE().getText());
            sb.append(SPACE);
            if (ctx.children.size() == 9) {
                sb.append(visitConditionStatement(ctx.conditionStatement()));
            } else {
                sb.append(ctx.LBRACE().get(1).getText());
                depth++;
                sb.append(visitStatement(ctx.statement(1)));
                depth--;
                sb.append(ctx.RBRACE().get(1).getText());
            }
        }
        return sb.toString();
    }

    @Override
    public String visitCondition(ImperativeLanguageParser.ConditionContext ctx) {
        return visitExpr(ctx.expr());
    }

    @Override
    public String visitCycleStatement(ImperativeLanguageParser.CycleStatementContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public String visitWhileStatement(ImperativeLanguageParser.WhileStatementContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(ctx.WHILE().getText())
                .append(SPACE)
                .append(ctx.LPAREN().getText())
                .append(visitCondition(ctx.condition()))
                .append(ctx.RPAREN().getText())
                .append(ctx.LBRACE().getText());
        depth++;
        sb.append(visitStatement(ctx.statement()));
        depth--;
        sb.append(ctx.RBRACE().getText());
        return sb.toString();
    }

    @Override
    public String visitForStatement(ImperativeLanguageParser.ForStatementContext ctx) {
        char sign = '+';
        char cond = '<';
        if (Integer.parseInt(ctx.INT().get(0).getText()) > Integer.parseInt(ctx.INT().get(1).getText())) {
            sign = '-';
            cond = '>';
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ctx.FOR().getText())
                .append(SPACE)
                .append("(int ").append(ctx.NAME().getText())
                .append(" = ")
                .append(ctx.INT().get(0))
                .append("; ")
                .append(ctx.NAME().getText())
                .append(SPACE)
                .append(cond)
                .append(SPACE)
                .append(ctx.INT().get(1))
                .append("; ")
                .append(ctx.NAME().getText())
                .append(sign)
                .append(sign)
                .append(")")
                .append(ctx.LBRACE().getText());
        depth++;
        sb.append(visitStatement(ctx.statement()));
        depth--;
        sb.append(ctx.RBRACE());
        return sb.toString();
    }

    @Override
    public String visitDefVariable(ImperativeLanguageParser.DefVariableContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(visitType(ctx.type())).append(SPACE).append(ctx.assignment().NAME()).append(";").append(SPACE);
        sb.append(visitAssignment(ctx.assignment()));
        return sb.toString();
    }

    @Override
    public String visitReturnStatement(ImperativeLanguageParser.ReturnStatementContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append(TAB);
        }
        sb.append(ctx.RETURN())
                .append(SPACE)
                .append(visitExpr(ctx.expr()))
                .append(ctx.SEMICOLON().getText())
                .append(LINE_SEPARATOR);
        return sb.toString();
    }

    @Override
    public String visitMainStatement(ImperativeLanguageParser.MainStatementContext ctx) {
        depth++;
        String result = "int main() {" + visitStatement(ctx.statement()) + "}\n";
        depth--;
        return result;
    }
}
