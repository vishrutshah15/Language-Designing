// Generated from E:/APL Assignments/SILAntlr/SILAntlr/src/main/java/apl\SIL.g4 by ANTLR 4.6
package apl.antlr;

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SILParser}.
 */
public interface SILListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SILParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SILParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SILParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SILParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SILParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(SILParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SILParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(SILParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SILParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(SILParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SILParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(SILParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SILParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(SILParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SILParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(SILParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SILParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(SILParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link SILParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(SILParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link SILParser#exLit}.
	 * @param ctx the parse tree
	 */
	void enterExLit(SILParser.ExLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SILParser#exLit}.
	 * @param ctx the parse tree
	 */
	void exitExLit(SILParser.ExLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SILParser#exprLit1}.
	 * @param ctx the parse tree
	 */
	void enterExprLit1(SILParser.ExprLit1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SILParser#exprLit1}.
	 * @param ctx the parse tree
	 */
	void exitExprLit1(SILParser.ExprLit1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SILParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SILParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SILParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SILParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SILParser#mulEx}.
	 * @param ctx the parse tree
	 */
	void enterMulEx(SILParser.MulExContext ctx);
	/**
	 * Exit a parse tree produced by {@link SILParser#mulEx}.
	 * @param ctx the parse tree
	 */
	void exitMulEx(SILParser.MulExContext ctx);
	/**
	 * Enter a parse tree produced by {@link SILParser#at}.
	 * @param ctx the parse tree
	 */
	void enterAt(SILParser.AtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SILParser#at}.
	 * @param ctx the parse tree
	 */
	void exitAt(SILParser.AtContext ctx);
}