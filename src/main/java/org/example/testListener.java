// Generated from C:/Users/sinca.SINCAL/IdeaProjects/ParserTest/src/main/java/org/example/test.g4 by ANTLR 4.13.1
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link testParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(testParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link testParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(testParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Delcaration}
	 * labeled alternative in {@link testParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDelcaration(testParser.DelcarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Delcaration}
	 * labeled alternative in {@link testParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDelcaration(testParser.DelcarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Modification}
	 * labeled alternative in {@link testParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterModification(testParser.ModificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Modification}
	 * labeled alternative in {@link testParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitModification(testParser.ModificationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link testParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddition(testParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link testParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddition(testParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link testParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(testParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link testParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(testParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link testParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(testParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link testParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(testParser.NumberContext ctx);
}