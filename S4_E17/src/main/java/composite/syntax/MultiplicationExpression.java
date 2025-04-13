package composite.syntax;

public class MultiplicationExpression extends ArithmeticExpression {

    public MultiplicationExpression(Expression expression1, Expression expression2) {
        super(expression1, expression2);
    }

    @Override
    public int depth(){
        return expression1.depth() + expression2.depth();
    }

    @Override
    public int eval(){
        return expression1.eval() * expression2.eval();
    }

    @Override
    protected String operatorSymbol() {
        return "*";
    }
}
