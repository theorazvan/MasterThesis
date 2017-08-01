package graphics.client;
// Generated from /home/dabija/Java/GeoDraw/src/graphics/client/NewDrawGrammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NewDrawGrammarParser}.
 */
public interface NewDrawGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NewDrawGrammarParser#methods}.
	 * @param ctx the parse tree
	 */
	void enterMethods(@NotNull NewDrawGrammarParser.MethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewDrawGrammarParser#methods}.
	 * @param ctx the parse tree
	 */
	void exitMethods(@NotNull NewDrawGrammarParser.MethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewDrawGrammarParser#objects}.
	 * @param ctx the parse tree
	 */
	void enterObjects(@NotNull NewDrawGrammarParser.ObjectsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewDrawGrammarParser#objects}.
	 * @param ctx the parse tree
	 */
	void exitObjects(@NotNull NewDrawGrammarParser.ObjectsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewDrawGrammarParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(@NotNull NewDrawGrammarParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewDrawGrammarParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(@NotNull NewDrawGrammarParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewDrawGrammarParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(@NotNull NewDrawGrammarParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewDrawGrammarParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(@NotNull NewDrawGrammarParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewDrawGrammarParser#drawSentence}.
	 * @param ctx the parse tree
	 */
	void enterDrawSentence(@NotNull NewDrawGrammarParser.DrawSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewDrawGrammarParser#drawSentence}.
	 * @param ctx the parse tree
	 */
	void exitDrawSentence(@NotNull NewDrawGrammarParser.DrawSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewDrawGrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull NewDrawGrammarParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewDrawGrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull NewDrawGrammarParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewDrawGrammarParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(@NotNull NewDrawGrammarParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewDrawGrammarParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(@NotNull NewDrawGrammarParser.ObjectContext ctx);
}