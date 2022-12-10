// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserGo}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserGoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserGo#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(ParserGo.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserGo#package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage(ParserGo.PackageContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserGo#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(ParserGo.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserGo#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ParserGo.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserGo#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(ParserGo.ParamsContext ctx);
}