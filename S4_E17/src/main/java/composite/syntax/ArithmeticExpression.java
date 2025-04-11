package composite.syntax;

import java.util.function.BinaryOperator;

public class ArithmeticExpression implements Expression {

    Expression expression1;
    Expression expression2;

    public ArithmeticExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public int eval() {
        return 0;
    }

    @Override
    public int depth() {
        return 1;
    }

    @Override
    public void prettyPrint() {
        System.out.println(getLeft(expression1) + getRight(expression2));
    }

    @Override
    public void prefixPrint() {
    }

    public String getLeft(Expression e) {
        return e.toString();
    }

    public String getRight(Expression e) {
        return e.toString();
    }
}
