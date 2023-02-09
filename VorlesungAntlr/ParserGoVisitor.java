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
	 * Visit a parse tree produced by {@link ParserGo#functionHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionHead(ParserGo.FunctionHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserGo#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(ParserGo.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserGo#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(ParserGo.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserGo#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(ParserGo.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserGo#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ParserGo.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserGo#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ParserGo.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserGo#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(ParserGo.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserGo#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(ParserGo.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserGo#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(ParserGo.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserGo#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(ParserGo.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserGo#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(ParserGo.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserGo#bloc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloc(ParserGo.BlocContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserGo#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(ParserGo.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserGo#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(ParserGo.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserGo#newLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewLine(ParserGo.NewLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserGo#optNewLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptNewLine(ParserGo.OptNewLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserGo#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(ParserGo.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserGo#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(ParserGo.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserGo#methodCallend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallend(ParserGo.MethodCallendContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserGo#methodParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodParams(ParserGo.MethodParamsContext ctx);
}