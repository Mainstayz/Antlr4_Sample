import OC.ObjCLexer;
import OC.ObjCParser;
import OC.ObjCParserBaseListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;


class OCListener extends ObjCParserBaseListener {
    @Override
    public void enterTopLevelDeclaration(ObjCParser.TopLevelDeclarationContext ctx) {
        super.enterTopLevelDeclaration(ctx);
        int index =  ctx.getRuleIndex();
        System.out.println(index);
    }

    @Override
    public void enterCategoryInterface(ObjCParser.CategoryInterfaceContext ctx) {
        super.enterCategoryInterface(ctx);
        System.out.println(ctx.categoryName.toString());
    }

    @Override
    public void enterPostfixExpression(ObjCParser.PostfixExpressionContext ctx) {
        super.enterPostfixExpression(ctx);
        if (ctx.DOT() != null) {
            System.out.println(ctx.identifier().IDENTIFIER().toString());
        }
    }
}


public class OCLoad {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/hezongzhu/Desktop/github_three/ZipArchive/Example/ObjectiveCExample/ViewController.m";

        ObjCLexer lexer = new ObjCLexer(CharStreams.fromFileName(filePath));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ObjCParser parser = new ObjCParser(tokens);
        ParseTree tree = parser.translationUnit();
        OCListener listener = new OCListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener,tree);

    }
}
