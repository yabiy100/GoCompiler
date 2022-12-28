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
	 * Enter a parse tree produced by {@link ParserGo#functionHead}.
	 * @param ctx the parse tree
	 */
	void enterFunctionHead(ParserGo.FunctionHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGo#functionHead}.
	 * @param ctx the parse tree
	 */
	void exitFunctionHead(ParserGo.FunctionHeadContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link ParserGo#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(ParserGo.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGo#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(ParserGo.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserGo#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(ParserGo.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGo#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(ParserGo.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserGo#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ParserGo.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGo#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ParserGo.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserGo#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ParserGo.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGo#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ParserGo.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserGo#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(ParserGo.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGo#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(ParserGo.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserGo#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(ParserGo.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGo#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(ParserGo.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserGo#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(ParserGo.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGo#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(ParserGo.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserGo#methodParams}.
	 * @param ctx the parse tree
	 */
	void enterMethodParams(ParserGo.MethodParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGo#methodParams}.
	 * @param ctx the parse tree
	 */
	void exitMethodParams(ParserGo.MethodParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserGo#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(ParserGo.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGo#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(ParserGo.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserGo#newLine}.
	 * @param ctx the parse tree
	 */
	void enterNewLine(ParserGo.NewLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGo#newLine}.
	 * @param ctx the parse tree
	 */
	void exitNewLine(ParserGo.NewLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserGo#optNewLine}.
	 * @param ctx the parse tree
	 */
	void enterOptNewLine(ParserGo.OptNewLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGo#optNewLine}.
	 * @param ctx the parse tree
	 */
	void exitOptNewLine(ParserGo.OptNewLineContext ctx);
}