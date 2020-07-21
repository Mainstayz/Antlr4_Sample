import CSV.CSVBaseListener;
import CSV.CSVLexer;
import CSV.CSVParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Load extends CSVBaseListener {
    public  static final String EMPTY = "";
    List<Map<String,String>> rows = new ArrayList<Map<String, String>>();
    List<String> hdr;
    List<String> curRow;

    @Override
    public void exitText(CSVParser.TextContext ctx) {
        curRow.add(ctx.TEXT().getText());
    }

    @Override
    public void exitString(CSVParser.StringContext ctx) {
        curRow.add(ctx.STRING().getText());
    }

    @Override
    public void exitEmpty(CSVParser.EmptyContext ctx) {
        curRow.add(EMPTY);
    }

    @Override
    public void enterRow(CSVParser.RowContext ctx) {
        curRow = new ArrayList<String>();
    }

    @Override
    public void exitHdr(CSVParser.HdrContext ctx) {
        hdr = new ArrayList<String>();
        hdr.addAll(curRow);
    }

    @Override
    public void exitRow(CSVParser.RowContext ctx) {
        if (ctx.getParent().getRuleIndex() == CSVParser.RULE_hdr) {
            return;
        }
        Map<String,String> map = new HashMap<String, String>();
        for (int i = 0; i < curRow.size(); i++) {
            map.put(hdr.get(i),curRow.get(i));
        }
        rows.add(map);
    }
}
public class CSV2Object {
    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        CSVLexer lexer = new CSVLexer(input);
        CommonTokenStream token = new CommonTokenStream(lexer);
        CSVParser parser = new CSVParser(token);
        ParseTree tree = parser.file();
        ParseTreeWalker walker = new ParseTreeWalker();
        Load l = new Load();
        walker.walk(l,tree);
        System.out.println(l.rows);
    }
}
