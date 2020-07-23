// Generated from /Users/hezongzhu/Antlr4_Sample/src/main/java/ObjCParser.g4 by ANTLR 4.8
package OC;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ObjCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ObjCParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ObjCParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(ObjCParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#topLevelDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelDeclaration(ObjCParser.TopLevelDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(ObjCParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#classInterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInterface(ObjCParser.ClassInterfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#categoryInterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCategoryInterface(ObjCParser.CategoryInterfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#classImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassImplementation(ObjCParser.ClassImplementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#categoryImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCategoryImplementation(ObjCParser.CategoryImplementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#genericTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericTypeSpecifier(ObjCParser.GenericTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#protocolDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolDeclaration(ObjCParser.ProtocolDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#protocolDeclarationSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolDeclarationSection(ObjCParser.ProtocolDeclarationSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#protocolDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolDeclarationList(ObjCParser.ProtocolDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#classDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclarationList(ObjCParser.ClassDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#protocolList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolList(ObjCParser.ProtocolListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(ObjCParser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#propertyAttributesList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAttributesList(ObjCParser.PropertyAttributesListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#propertyAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAttribute(ObjCParser.PropertyAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#protocolName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolName(ObjCParser.ProtocolNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#instanceVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceVariables(ObjCParser.InstanceVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#visibilitySection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibilitySection(ObjCParser.VisibilitySectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(ObjCParser.AccessModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#interfaceDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclarationList(ObjCParser.InterfaceDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#classMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMethodDeclaration(ObjCParser.ClassMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#instanceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceMethodDeclaration(ObjCParser.InstanceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(ObjCParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#implementationDefinitionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementationDefinitionList(ObjCParser.ImplementationDefinitionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#classMethodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMethodDefinition(ObjCParser.ClassMethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#instanceMethodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceMethodDefinition(ObjCParser.InstanceMethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#methodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDefinition(ObjCParser.MethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#methodSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodSelector(ObjCParser.MethodSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#keywordDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordDeclarator(ObjCParser.KeywordDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(ObjCParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#methodType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodType(ObjCParser.MethodTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#propertyImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyImplementation(ObjCParser.PropertyImplementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#propertySynthesizeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertySynthesizeList(ObjCParser.PropertySynthesizeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#propertySynthesizeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertySynthesizeItem(ObjCParser.PropertySynthesizeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#blockType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockType(ObjCParser.BlockTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#genericsSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericsSpecifier(ObjCParser.GenericsSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#typeSpecifierWithPrefixes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifierWithPrefixes(ObjCParser.TypeSpecifierWithPrefixesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#dictionaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryExpression(ObjCParser.DictionaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#dictionaryPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryPair(ObjCParser.DictionaryPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#arrayExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpression(ObjCParser.ArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#boxExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoxExpression(ObjCParser.BoxExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#blockParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockParameters(ObjCParser.BlockParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#typeVariableDeclaratorOrName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariableDeclaratorOrName(ObjCParser.TypeVariableDeclaratorOrNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#blockExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockExpression(ObjCParser.BlockExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#messageExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageExpression(ObjCParser.MessageExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#receiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiver(ObjCParser.ReceiverContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#messageSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageSelector(ObjCParser.MessageSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#keywordArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordArgument(ObjCParser.KeywordArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#keywordArgumentType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordArgumentType(ObjCParser.KeywordArgumentTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#selectorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorExpression(ObjCParser.SelectorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#selectorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorName(ObjCParser.SelectorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#protocolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolExpression(ObjCParser.ProtocolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#encodeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncodeExpression(ObjCParser.EncodeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#typeVariableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariableDeclarator(ObjCParser.TypeVariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(ObjCParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#tryBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryBlock(ObjCParser.TryBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#catchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchStatement(ObjCParser.CatchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(ObjCParser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#autoreleaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoreleaseStatement(ObjCParser.AutoreleaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(ObjCParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(ObjCParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#functionSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSignature(ObjCParser.FunctionSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(ObjCParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#attributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeName(ObjCParser.AttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#attributeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeParameters(ObjCParser.AttributeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#attributeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeParameterList(ObjCParser.AttributeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#attributeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeParameter(ObjCParser.AttributeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#attributeParameterAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeParameterAssignment(ObjCParser.AttributeParameterAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ObjCParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#functionCallExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(ObjCParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(ObjCParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(ObjCParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#typedefDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefDeclaration(ObjCParser.TypedefDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#typeDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaratorList(ObjCParser.TypeDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#typeDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclarator(ObjCParser.TypeDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers(ObjCParser.DeclarationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#attributeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSpecifier(ObjCParser.AttributeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(ObjCParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(ObjCParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnionSpecifier(ObjCParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(ObjCParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifierQualifierList(ObjCParser.SpecifierQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#ibOutletQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIbOutletQualifier(ObjCParser.IbOutletQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#arcBehaviourSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArcBehaviourSpecifier(ObjCParser.ArcBehaviourSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#nullabilitySpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullabilitySpecifier(ObjCParser.NullabilitySpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(ObjCParser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#typePrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypePrefix(ObjCParser.TypePrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(ObjCParser.TypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#protocolQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolQualifier(ObjCParser.ProtocolQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(ObjCParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#typeofExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeofExpression(ObjCParser.TypeofExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#fieldDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaratorList(ObjCParser.FieldDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#fieldDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclarator(ObjCParser.FieldDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(ObjCParser.EnumSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(ObjCParser.EnumeratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(ObjCParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#enumeratorIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorIdentifier(ObjCParser.EnumeratorIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator(ObjCParser.DirectDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#declaratorSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaratorSuffix(ObjCParser.DeclaratorSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(ObjCParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(ObjCParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro(ObjCParser.MacroContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(ObjCParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#structInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructInitializer(ObjCParser.StructInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(ObjCParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(ObjCParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclarator(ObjCParser.AbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#abstractDeclaratorSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclaratorSuffix(ObjCParser.AbstractDeclaratorSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarationList(ObjCParser.ParameterDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(ObjCParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(ObjCParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ObjCParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(ObjCParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#rangeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpression(ObjCParser.RangeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(ObjCParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(ObjCParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(ObjCParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(ObjCParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#switchSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchSection(ObjCParser.SwitchSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(ObjCParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(ObjCParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ObjCParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(ObjCParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(ObjCParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#forLoopInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopInitializer(ObjCParser.ForLoopInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#forInStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInStatement(ObjCParser.ForInStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(ObjCParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(ObjCParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ObjCParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(ObjCParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(ObjCParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(ObjCParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(ObjCParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(ObjCParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(ObjCParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(ObjCParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix(ObjCParser.PostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(ObjCParser.ArgumentExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#argumentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpression(ObjCParser.ArgumentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(ObjCParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(ObjCParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(ObjCParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ObjCParser.IdentifierContext ctx);
}