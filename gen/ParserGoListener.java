// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserGo}.
 */
public interface ParserGoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserGo#s}.
	 * @param ctx the parse tree
	 */
	void enterS(ParserGo.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGo#s}.
	 * @param ctx the parse tree
	 */
	void exitS(ParserGo.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserGo#package}.
	 * @param ctx the parse tree
	 */
	void enterPackage(ParserGo.PackageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGo#package}.
	 * @param ctx the parse tree
	 */
	void exitPackage(ParserGo.PackageContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserGo#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(ParserGo.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGo#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(ParserGo.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserGo#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ParserGo.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGo#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ParserGo.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserGo#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(ParserGo.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGo#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(ParserGo.ParamsContext ctx);
}