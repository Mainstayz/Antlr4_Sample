import ArrayInit.ArrayInitLexer;
import ArrayInit.ArrayInitParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        ArrayInitLexer lexer = new ArrayInitLexer(input);
        CommonTokenStream tokens =  new CommonTokenStream(lexer);
        ArrayInitParser parser = new ArrayInitParser(tokens);
        ParseTree tree = parser.init();

        System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        // 设置触发回调
        walker.walk(new ShortToUnicodeString(),tree);

    }
}
