package composite.syntax;

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
        System.out.print("( ");
        expression1.prettyPrint();
        System.out.print(" " + operatorSymbol() + " ");
        expression2.prettyPrint();
        System.out.print(" )");
    }

    @Override
    public void prefixPrint() {
        System.out.print("<" + operatorSymbol() + " ");
        expression1.prefixPrint();
        System.out.print(" ");
        expression2.prefixPrint();
        System.out.print(">");
    }

    protected String operatorSymbol() {
        return "?";
    }
}
