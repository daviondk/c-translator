// Generated from com/daviondk/translator/ImperativeLanguageParser.g4 by ANTLR 4.9
package com.daviondk.translator;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ImperativeLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ImperativeLanguageParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ImperativeLanguageParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(ImperativeLanguageParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ImperativeLanguageParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(ImperativeLanguageParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ImperativeLanguageParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(ImperativeLanguageParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ImperativeLanguageParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#callUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallUser(ImperativeLanguageParser.CallUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#callArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArgs(ImperativeLanguageParser.CallArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ImperativeLanguageParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ImperativeLanguageParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#callRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallRead(ImperativeLanguageParser.CallReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#callReadInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallReadInt(ImperativeLanguageParser.CallReadIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#callReadDouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallReadDouble(ImperativeLanguageParser.CallReadDoubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#callReadString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallReadString(ImperativeLanguageParser.CallReadStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#callPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallPrint(ImperativeLanguageParser.CallPrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ImperativeLanguageParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#maxExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxExpr(ImperativeLanguageParser.MaxExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(ImperativeLanguageParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#recExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecExpr(ImperativeLanguageParser.RecExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical(ImperativeLanguageParser.LogicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#conditionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionStatement(ImperativeLanguageParser.ConditionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ImperativeLanguageParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#cycleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycleStatement(ImperativeLanguageParser.CycleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ImperativeLanguageParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(ImperativeLanguageParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#defVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefVariable(ImperativeLanguageParser.DefVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(ImperativeLanguageParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperativeLanguageParser#mainStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainStatement(ImperativeLanguageParser.MainStatementContext ctx);
}