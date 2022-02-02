// Generated from Simple.g4 by ANTLR 4.4
package analizador.analizador.sintactico;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(@NotNull SimpleParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(@NotNull SimpleParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(@NotNull SimpleParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(@NotNull SimpleParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#sentence1}.
	 * @param ctx the parse tree
	 */
	void enterSentence1(@NotNull SimpleParser.Sentence1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#sentence1}.
	 * @param ctx the parse tree
	 */
	void exitSentence1(@NotNull SimpleParser.Sentence1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#sentence2}.
	 * @param ctx the parse tree
	 */
	void enterSentence2(@NotNull SimpleParser.Sentence2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#sentence2}.
	 * @param ctx the parse tree
	 */
	void exitSentence2(@NotNull SimpleParser.Sentence2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(@NotNull SimpleParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(@NotNull SimpleParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull SimpleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull SimpleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(@NotNull SimpleParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(@NotNull SimpleParser.Var_declContext ctx);
}