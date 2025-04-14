package composite.syntax;

public class AdditionExpression extends ArithmeticExpression {

    public AdditionExpression(Expression expression1, Expression expression2) {
        super(expression1, expression2);
    }

    @Override
    public void prettyPrint() {
        System.out.println(expression1.eval() + " + " + expression2.eval());
    }

    @Override
    public void prefixPrint() {}

    @Override
    public int depth(){
        return expression1.depth() + expression2.depth();
    }

    @Override
    public int eval(){
        return expression1.eval() + expression2.eval();
    }

    @Override
    protected String operatorSymbol() {
        return "+";
    }
}
