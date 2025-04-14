package composite.syntax;

public class AdditionExpression extends ArithmeticExpression {

    public AdditionExpression(Expression expression1, Expression expression2) {
        super(expression1, expression2);
    }

    @Override
    public int eval() {
        return expression1.eval() + expression2.eval();
    }

    @Override
    public int depth() {
        return 1;
    }

    @Override
    public void prettyPrint() {
        System.out.print("( ");
        expression1.prettyPrint();
        System.out.print(" + ");
        expression2.prettyPrint();
        System.out.print(" )");
    }

    @Override
    public void prefixPrint() {
        System.out.print("<+ ");
        expression1.prefixPrint();
        System.out.print(" ");
        expression2.prefixPrint();
        System.out.print(">");
    }
}
