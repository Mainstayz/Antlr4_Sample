
import expr.LibExprBaseListener;
import expr.LibExprBaseVisitor;
import expr.LibExprLexer;
import expr.LibExprParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


class EvalVisitor extends LibExprBaseVisitor<Integer> {
    Map<String, Integer> memory = new HashMap<String, Integer>();

    @Override
    public Integer visitPrintExpr(LibExprParser.PrintExprContext ctx) {
        int value = visit(ctx.expr()); // 遍历表达式
        System.out.println("换行："+ value);
        return 0;
    }

    @Override
    public Integer visitAssign(LibExprParser.AssignContext ctx) {
        String id = ctx.ID().getText(); // id
        int value = visit(ctx.expr());
        System.out.println("赋值："+ id + " = " + value);
        memory.put(id, value);
        return value;
    }

    @Override
    public Integer visitParens(LibExprParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Integer visitMulDiv(LibExprParser.MulDivContext ctx) {
        Integer left = visit(ctx.expr(0));
        Integer right = visit(ctx.expr(1));
        if (ctx.op.getType() == LibExprParser.MUL) {
            System.out.println("乘法：" + left + " * " + right);
            return  left * right;
        }
        System.out.println("除法：" + left + " / " + right);
        return  left / right;
    }

    @Override
    public Integer visitAddSub(LibExprParser.AddSubContext ctx) {

        Integer left = visit(ctx.expr(0));
        Integer right = visit(ctx.expr(1));

        if (ctx.op.getType() == LibExprParser.ADD) {
            System.out.println("加法：" + left + "+ " + right);
            return  left + right;
        }
        System.out.println("减法：" + left + "- " + right);
        return  left - right;
    }

    @Override
    public Integer visitId(LibExprParser.IdContext ctx) {
        String id = ctx.ID().getText();
        System.out.println("id:" + id);
        if (memory.containsKey(id)) {
            return memory.get(id);
        }
        return 0;
    }

    @Override
    public Integer visitInt(LibExprParser.IntContext ctx) {
        Integer val = Integer.parseInt(ctx.INT().toString());
        System.out.println("val:" + val);
        return val;
    }
}


public class Calc {
    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        LibExprLexer lexer = new LibExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LibExprParser parser = new LibExprParser(tokens);
        ParseTree tree = parser.prog();
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
    }
}
