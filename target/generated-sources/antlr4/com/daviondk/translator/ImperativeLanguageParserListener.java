// Generated from com/daviondk/translator/ImperativeLanguageParser.g4 by ANTLR 4.9
package com.daviondk.translator;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ImperativeLanguageParser}.
 */
public interface ImperativeLanguageParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ImperativeLanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ImperativeLanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(ImperativeLanguageParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(ImperativeLanguageParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ImperativeLanguageParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ImperativeLanguageParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(ImperativeLanguageParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(ImperativeLanguageParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ImperativeLanguageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ImperativeLanguageParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(ImperativeLanguageParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(ImperativeLanguageParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ImperativeLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ImperativeLanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#callUser}.
	 * @param ctx the parse tree
	 */
	void enterCallUser(ImperativeLanguageParser.CallUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#callUser}.
	 * @param ctx the parse tree
	 */
	void exitCallUser(ImperativeLanguageParser.CallUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#callArgs}.
	 * @param ctx the parse tree
	 */
	void enterCallArgs(ImperativeLanguageParser.CallArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#callArgs}.
	 * @param ctx the parse tree
	 */
	void exitCallArgs(ImperativeLanguageParser.CallArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ImperativeLanguageParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ImperativeLanguageParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ImperativeLanguageParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ImperativeLanguageParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#callRead}.
	 * @param ctx the parse tree
	 */
	void enterCallRead(ImperativeLanguageParser.CallReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#callRead}.
	 * @param ctx the parse tree
	 */
	void exitCallRead(ImperativeLanguageParser.CallReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#callReadInt}.
	 * @param ctx the parse tree
	 */
	void enterCallReadInt(ImperativeLanguageParser.CallReadIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#callReadInt}.
	 * @param ctx the parse tree
	 */
	void exitCallReadInt(ImperativeLanguageParser.CallReadIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#callReadDouble}.
	 * @param ctx the parse tree
	 */
	void enterCallReadDouble(ImperativeLanguageParser.CallReadDoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#callReadDouble}.
	 * @param ctx the parse tree
	 */
	void exitCallReadDouble(ImperativeLanguageParser.CallReadDoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#callReadString}.
	 * @param ctx the parse tree
	 */
	void enterCallReadString(ImperativeLanguageParser.CallReadStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#callReadString}.
	 * @param ctx the parse tree
	 */
	void exitCallReadString(ImperativeLanguageParser.CallReadStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#callPrint}.
	 * @param ctx the parse tree
	 */
	void enterCallPrint(ImperativeLanguageParser.CallPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#callPrint}.
	 * @param ctx the parse tree
	 */
	void exitCallPrint(ImperativeLanguageParser.CallPrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ImperativeLanguageParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ImperativeLanguageParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#maxExpr}.
	 * @param ctx the parse tree
	 */
	void enterMaxExpr(ImperativeLanguageParser.MaxExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#maxExpr}.
	 * @param ctx the parse tree
	 */
	void exitMaxExpr(ImperativeLanguageParser.MaxExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(ImperativeLanguageParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(ImperativeLanguageParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#recExpr}.
	 * @param ctx the parse tree
	 */
	void enterRecExpr(ImperativeLanguageParser.RecExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#recExpr}.
	 * @param ctx the parse tree
	 */
	void exitRecExpr(ImperativeLanguageParser.RecExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#logical}.
	 * @param ctx the parse tree
	 */
	void enterLogical(ImperativeLanguageParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#logical}.
	 * @param ctx the parse tree
	 */
	void exitLogical(ImperativeLanguageParser.LogicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#conditionStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionStatement(ImperativeLanguageParser.ConditionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#conditionStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionStatement(ImperativeLanguageParser.ConditionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ImperativeLanguageParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ImperativeLanguageParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#cycleStatement}.
	 * @param ctx the parse tree
	 */
	void enterCycleStatement(ImperativeLanguageParser.CycleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#cycleStatement}.
	 * @param ctx the parse tree
	 */
	void exitCycleStatement(ImperativeLanguageParser.CycleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ImperativeLanguageParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ImperativeLanguageParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ImperativeLanguageParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ImperativeLanguageParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#defVariable}.
	 * @param ctx the parse tree
	 */
	void enterDefVariable(ImperativeLanguageParser.DefVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#defVariable}.
	 * @param ctx the parse tree
	 */
	void exitDefVariable(ImperativeLanguageParser.DefVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ImperativeLanguageParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ImperativeLanguageParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#mainStatement}.
	 * @param ctx the parse tree
	 */
	void enterMainStatement(ImperativeLanguageParser.MainStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#mainStatement}.
	 * @param ctx the parse tree
	 */
	void exitMainStatement(ImperativeLanguageParser.MainStatementContext ctx);
}