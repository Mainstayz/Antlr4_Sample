// Generated from /Users/hezongzhu/Antlr4_Sample/src/main/java/ObjCParser.g4 by ANTLR 4.8
package OC;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ObjCParser}.
 */
public interface ObjCParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ObjCParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(ObjCParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(ObjCParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#topLevelDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelDeclaration(ObjCParser.TopLevelDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#topLevelDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelDeclaration(ObjCParser.TopLevelDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(ObjCParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(ObjCParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#classInterface}.
	 * @param ctx the parse tree
	 */
	void enterClassInterface(ObjCParser.ClassInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#classInterface}.
	 * @param ctx the parse tree
	 */
	void exitClassInterface(ObjCParser.ClassInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#categoryInterface}.
	 * @param ctx the parse tree
	 */
	void enterCategoryInterface(ObjCParser.CategoryInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#categoryInterface}.
	 * @param ctx the parse tree
	 */
	void exitCategoryInterface(ObjCParser.CategoryInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#classImplementation}.
	 * @param ctx the parse tree
	 */
	void enterClassImplementation(ObjCParser.ClassImplementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#classImplementation}.
	 * @param ctx the parse tree
	 */
	void exitClassImplementation(ObjCParser.ClassImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#categoryImplementation}.
	 * @param ctx the parse tree
	 */
	void enterCategoryImplementation(ObjCParser.CategoryImplementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#categoryImplementation}.
	 * @param ctx the parse tree
	 */
	void exitCategoryImplementation(ObjCParser.CategoryImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#genericTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeSpecifier(ObjCParser.GenericTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#genericTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeSpecifier(ObjCParser.GenericTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#protocolDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocolDeclaration(ObjCParser.ProtocolDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#protocolDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocolDeclaration(ObjCParser.ProtocolDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#protocolDeclarationSection}.
	 * @param ctx the parse tree
	 */
	void enterProtocolDeclarationSection(ObjCParser.ProtocolDeclarationSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#protocolDeclarationSection}.
	 * @param ctx the parse tree
	 */
	void exitProtocolDeclarationSection(ObjCParser.ProtocolDeclarationSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#protocolDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterProtocolDeclarationList(ObjCParser.ProtocolDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#protocolDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitProtocolDeclarationList(ObjCParser.ProtocolDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#classDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationList(ObjCParser.ClassDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#classDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationList(ObjCParser.ClassDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#protocolList}.
	 * @param ctx the parse tree
	 */
	void enterProtocolList(ObjCParser.ProtocolListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#protocolList}.
	 * @param ctx the parse tree
	 */
	void exitProtocolList(ObjCParser.ProtocolListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(ObjCParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(ObjCParser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#propertyAttributesList}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAttributesList(ObjCParser.PropertyAttributesListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#propertyAttributesList}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAttributesList(ObjCParser.PropertyAttributesListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#propertyAttribute}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAttribute(ObjCParser.PropertyAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#propertyAttribute}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAttribute(ObjCParser.PropertyAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#protocolName}.
	 * @param ctx the parse tree
	 */
	void enterProtocolName(ObjCParser.ProtocolNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#protocolName}.
	 * @param ctx the parse tree
	 */
	void exitProtocolName(ObjCParser.ProtocolNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#instanceVariables}.
	 * @param ctx the parse tree
	 */
	void enterInstanceVariables(ObjCParser.InstanceVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#instanceVariables}.
	 * @param ctx the parse tree
	 */
	void exitInstanceVariables(ObjCParser.InstanceVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#visibilitySection}.
	 * @param ctx the parse tree
	 */
	void enterVisibilitySection(ObjCParser.VisibilitySectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#visibilitySection}.
	 * @param ctx the parse tree
	 */
	void exitVisibilitySection(ObjCParser.VisibilitySectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(ObjCParser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(ObjCParser.AccessModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#interfaceDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclarationList(ObjCParser.InterfaceDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#interfaceDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclarationList(ObjCParser.InterfaceDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#classMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMethodDeclaration(ObjCParser.ClassMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#classMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMethodDeclaration(ObjCParser.ClassMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#instanceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInstanceMethodDeclaration(ObjCParser.InstanceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#instanceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInstanceMethodDeclaration(ObjCParser.InstanceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(ObjCParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(ObjCParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#implementationDefinitionList}.
	 * @param ctx the parse tree
	 */
	void enterImplementationDefinitionList(ObjCParser.ImplementationDefinitionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#implementationDefinitionList}.
	 * @param ctx the parse tree
	 */
	void exitImplementationDefinitionList(ObjCParser.ImplementationDefinitionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#classMethodDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassMethodDefinition(ObjCParser.ClassMethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#classMethodDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassMethodDefinition(ObjCParser.ClassMethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#instanceMethodDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInstanceMethodDefinition(ObjCParser.InstanceMethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#instanceMethodDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInstanceMethodDefinition(ObjCParser.InstanceMethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMethodDefinition(ObjCParser.MethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMethodDefinition(ObjCParser.MethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#methodSelector}.
	 * @param ctx the parse tree
	 */
	void enterMethodSelector(ObjCParser.MethodSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#methodSelector}.
	 * @param ctx the parse tree
	 */
	void exitMethodSelector(ObjCParser.MethodSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#keywordDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterKeywordDeclarator(ObjCParser.KeywordDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#keywordDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitKeywordDeclarator(ObjCParser.KeywordDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(ObjCParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(ObjCParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterMethodType(ObjCParser.MethodTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitMethodType(ObjCParser.MethodTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#propertyImplementation}.
	 * @param ctx the parse tree
	 */
	void enterPropertyImplementation(ObjCParser.PropertyImplementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#propertyImplementation}.
	 * @param ctx the parse tree
	 */
	void exitPropertyImplementation(ObjCParser.PropertyImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#propertySynthesizeList}.
	 * @param ctx the parse tree
	 */
	void enterPropertySynthesizeList(ObjCParser.PropertySynthesizeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#propertySynthesizeList}.
	 * @param ctx the parse tree
	 */
	void exitPropertySynthesizeList(ObjCParser.PropertySynthesizeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#propertySynthesizeItem}.
	 * @param ctx the parse tree
	 */
	void enterPropertySynthesizeItem(ObjCParser.PropertySynthesizeItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#propertySynthesizeItem}.
	 * @param ctx the parse tree
	 */
	void exitPropertySynthesizeItem(ObjCParser.PropertySynthesizeItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#blockType}.
	 * @param ctx the parse tree
	 */
	void enterBlockType(ObjCParser.BlockTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#blockType}.
	 * @param ctx the parse tree
	 */
	void exitBlockType(ObjCParser.BlockTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#genericsSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGenericsSpecifier(ObjCParser.GenericsSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#genericsSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGenericsSpecifier(ObjCParser.GenericsSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#typeSpecifierWithPrefixes}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifierWithPrefixes(ObjCParser.TypeSpecifierWithPrefixesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#typeSpecifierWithPrefixes}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifierWithPrefixes(ObjCParser.TypeSpecifierWithPrefixesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#dictionaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryExpression(ObjCParser.DictionaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#dictionaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryExpression(ObjCParser.DictionaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#dictionaryPair}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryPair(ObjCParser.DictionaryPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#dictionaryPair}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryPair(ObjCParser.DictionaryPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#arrayExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpression(ObjCParser.ArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#arrayExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpression(ObjCParser.ArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#boxExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoxExpression(ObjCParser.BoxExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#boxExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoxExpression(ObjCParser.BoxExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#blockParameters}.
	 * @param ctx the parse tree
	 */
	void enterBlockParameters(ObjCParser.BlockParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#blockParameters}.
	 * @param ctx the parse tree
	 */
	void exitBlockParameters(ObjCParser.BlockParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#typeVariableDeclaratorOrName}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariableDeclaratorOrName(ObjCParser.TypeVariableDeclaratorOrNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#typeVariableDeclaratorOrName}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariableDeclaratorOrName(ObjCParser.TypeVariableDeclaratorOrNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#blockExpression}.
	 * @param ctx the parse tree
	 */
	void enterBlockExpression(ObjCParser.BlockExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#blockExpression}.
	 * @param ctx the parse tree
	 */
	void exitBlockExpression(ObjCParser.BlockExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#messageExpression}.
	 * @param ctx the parse tree
	 */
	void enterMessageExpression(ObjCParser.MessageExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#messageExpression}.
	 * @param ctx the parse tree
	 */
	void exitMessageExpression(ObjCParser.MessageExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#receiver}.
	 * @param ctx the parse tree
	 */
	void enterReceiver(ObjCParser.ReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#receiver}.
	 * @param ctx the parse tree
	 */
	void exitReceiver(ObjCParser.ReceiverContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#messageSelector}.
	 * @param ctx the parse tree
	 */
	void enterMessageSelector(ObjCParser.MessageSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#messageSelector}.
	 * @param ctx the parse tree
	 */
	void exitMessageSelector(ObjCParser.MessageSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#keywordArgument}.
	 * @param ctx the parse tree
	 */
	void enterKeywordArgument(ObjCParser.KeywordArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#keywordArgument}.
	 * @param ctx the parse tree
	 */
	void exitKeywordArgument(ObjCParser.KeywordArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#keywordArgumentType}.
	 * @param ctx the parse tree
	 */
	void enterKeywordArgumentType(ObjCParser.KeywordArgumentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#keywordArgumentType}.
	 * @param ctx the parse tree
	 */
	void exitKeywordArgumentType(ObjCParser.KeywordArgumentTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#selectorExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectorExpression(ObjCParser.SelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#selectorExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectorExpression(ObjCParser.SelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#selectorName}.
	 * @param ctx the parse tree
	 */
	void enterSelectorName(ObjCParser.SelectorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#selectorName}.
	 * @param ctx the parse tree
	 */
	void exitSelectorName(ObjCParser.SelectorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#protocolExpression}.
	 * @param ctx the parse tree
	 */
	void enterProtocolExpression(ObjCParser.ProtocolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#protocolExpression}.
	 * @param ctx the parse tree
	 */
	void exitProtocolExpression(ObjCParser.ProtocolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#encodeExpression}.
	 * @param ctx the parse tree
	 */
	void enterEncodeExpression(ObjCParser.EncodeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#encodeExpression}.
	 * @param ctx the parse tree
	 */
	void exitEncodeExpression(ObjCParser.EncodeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#typeVariableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariableDeclarator(ObjCParser.TypeVariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#typeVariableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariableDeclarator(ObjCParser.TypeVariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(ObjCParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(ObjCParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#tryBlock}.
	 * @param ctx the parse tree
	 */
	void enterTryBlock(ObjCParser.TryBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#tryBlock}.
	 * @param ctx the parse tree
	 */
	void exitTryBlock(ObjCParser.TryBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#catchStatement}.
	 * @param ctx the parse tree
	 */
	void enterCatchStatement(ObjCParser.CatchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#catchStatement}.
	 * @param ctx the parse tree
	 */
	void exitCatchStatement(ObjCParser.CatchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(ObjCParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(ObjCParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#autoreleaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterAutoreleaseStatement(ObjCParser.AutoreleaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#autoreleaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitAutoreleaseStatement(ObjCParser.AutoreleaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(ObjCParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(ObjCParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(ObjCParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(ObjCParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSignature(ObjCParser.FunctionSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSignature(ObjCParser.FunctionSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(ObjCParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(ObjCParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(ObjCParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(ObjCParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#attributeParameters}.
	 * @param ctx the parse tree
	 */
	void enterAttributeParameters(ObjCParser.AttributeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#attributeParameters}.
	 * @param ctx the parse tree
	 */
	void exitAttributeParameters(ObjCParser.AttributeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#attributeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterAttributeParameterList(ObjCParser.AttributeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#attributeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitAttributeParameterList(ObjCParser.AttributeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#attributeParameter}.
	 * @param ctx the parse tree
	 */
	void enterAttributeParameter(ObjCParser.AttributeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#attributeParameter}.
	 * @param ctx the parse tree
	 */
	void exitAttributeParameter(ObjCParser.AttributeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#attributeParameterAssignment}.
	 * @param ctx the parse tree
	 */
	void enterAttributeParameterAssignment(ObjCParser.AttributeParameterAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#attributeParameterAssignment}.
	 * @param ctx the parse tree
	 */
	void exitAttributeParameterAssignment(ObjCParser.AttributeParameterAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ObjCParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ObjCParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(ObjCParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(ObjCParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(ObjCParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(ObjCParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(ObjCParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(ObjCParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#typedefDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypedefDeclaration(ObjCParser.TypedefDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#typedefDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypedefDeclaration(ObjCParser.TypedefDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#typeDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaratorList(ObjCParser.TypeDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#typeDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaratorList(ObjCParser.TypeDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#typeDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclarator(ObjCParser.TypeDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#typeDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclarator(ObjCParser.TypeDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(ObjCParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(ObjCParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#attributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSpecifier(ObjCParser.AttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#attributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSpecifier(ObjCParser.AttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(ObjCParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(ObjCParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(ObjCParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(ObjCParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnionSpecifier(ObjCParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnionSpecifier(ObjCParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(ObjCParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(ObjCParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(ObjCParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(ObjCParser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#ibOutletQualifier}.
	 * @param ctx the parse tree
	 */
	void enterIbOutletQualifier(ObjCParser.IbOutletQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#ibOutletQualifier}.
	 * @param ctx the parse tree
	 */
	void exitIbOutletQualifier(ObjCParser.IbOutletQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#arcBehaviourSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterArcBehaviourSpecifier(ObjCParser.ArcBehaviourSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#arcBehaviourSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitArcBehaviourSpecifier(ObjCParser.ArcBehaviourSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#nullabilitySpecifier}.
	 * @param ctx the parse tree
	 */
	void enterNullabilitySpecifier(ObjCParser.NullabilitySpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#nullabilitySpecifier}.
	 * @param ctx the parse tree
	 */
	void exitNullabilitySpecifier(ObjCParser.NullabilitySpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(ObjCParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(ObjCParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#typePrefix}.
	 * @param ctx the parse tree
	 */
	void enterTypePrefix(ObjCParser.TypePrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#typePrefix}.
	 * @param ctx the parse tree
	 */
	void exitTypePrefix(ObjCParser.TypePrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(ObjCParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(ObjCParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#protocolQualifier}.
	 * @param ctx the parse tree
	 */
	void enterProtocolQualifier(ObjCParser.ProtocolQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#protocolQualifier}.
	 * @param ctx the parse tree
	 */
	void exitProtocolQualifier(ObjCParser.ProtocolQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(ObjCParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(ObjCParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#typeofExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeofExpression(ObjCParser.TypeofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#typeofExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeofExpression(ObjCParser.TypeofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#fieldDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaratorList(ObjCParser.FieldDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#fieldDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaratorList(ObjCParser.FieldDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#fieldDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclarator(ObjCParser.FieldDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#fieldDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclarator(ObjCParser.FieldDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(ObjCParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(ObjCParser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(ObjCParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(ObjCParser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(ObjCParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(ObjCParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#enumeratorIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorIdentifier(ObjCParser.EnumeratorIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#enumeratorIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorIdentifier(ObjCParser.EnumeratorIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(ObjCParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(ObjCParser.DirectDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#declaratorSuffix}.
	 * @param ctx the parse tree
	 */
	void enterDeclaratorSuffix(ObjCParser.DeclaratorSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#declaratorSuffix}.
	 * @param ctx the parse tree
	 */
	void exitDeclaratorSuffix(ObjCParser.DeclaratorSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(ObjCParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(ObjCParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(ObjCParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(ObjCParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#macro}.
	 * @param ctx the parse tree
	 */
	void enterMacro(ObjCParser.MacroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#macro}.
	 * @param ctx the parse tree
	 */
	void exitMacro(ObjCParser.MacroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(ObjCParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(ObjCParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#structInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStructInitializer(ObjCParser.StructInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#structInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStructInitializer(ObjCParser.StructInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(ObjCParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(ObjCParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(ObjCParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(ObjCParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(ObjCParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(ObjCParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#abstractDeclaratorSuffix}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclaratorSuffix(ObjCParser.AbstractDeclaratorSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#abstractDeclaratorSuffix}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclaratorSuffix(ObjCParser.AbstractDeclaratorSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclarationList(ObjCParser.ParameterDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclarationList(ObjCParser.ParameterDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(ObjCParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(ObjCParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(ObjCParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(ObjCParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ObjCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ObjCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(ObjCParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(ObjCParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void enterRangeExpression(ObjCParser.RangeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void exitRangeExpression(ObjCParser.RangeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(ObjCParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(ObjCParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(ObjCParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(ObjCParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(ObjCParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(ObjCParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(ObjCParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(ObjCParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#switchSection}.
	 * @param ctx the parse tree
	 */
	void enterSwitchSection(ObjCParser.SwitchSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#switchSection}.
	 * @param ctx the parse tree
	 */
	void exitSwitchSection(ObjCParser.SwitchSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(ObjCParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(ObjCParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(ObjCParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(ObjCParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ObjCParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ObjCParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(ObjCParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(ObjCParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ObjCParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ObjCParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#forLoopInitializer}.
	 * @param ctx the parse tree
	 */
	void enterForLoopInitializer(ObjCParser.ForLoopInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#forLoopInitializer}.
	 * @param ctx the parse tree
	 */
	void exitForLoopInitializer(ObjCParser.ForLoopInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#forInStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInStatement(ObjCParser.ForInStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#forInStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInStatement(ObjCParser.ForInStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(ObjCParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(ObjCParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(ObjCParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(ObjCParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ObjCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ObjCParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(ObjCParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(ObjCParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(ObjCParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(ObjCParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(ObjCParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(ObjCParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(ObjCParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(ObjCParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(ObjCParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(ObjCParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(ObjCParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(ObjCParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(ObjCParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(ObjCParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterPostfix(ObjCParser.PostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitPostfix(ObjCParser.PostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(ObjCParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(ObjCParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#argumentExpression}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpression(ObjCParser.ArgumentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#argumentExpression}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpression(ObjCParser.ArgumentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(ObjCParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(ObjCParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(ObjCParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(ObjCParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(ObjCParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(ObjCParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ObjCParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ObjCParser.IdentifierContext ctx);
}