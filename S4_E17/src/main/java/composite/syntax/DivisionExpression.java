package composite.syntax;

public class DivisionExpression extends ArithmeticExpression {

    public DivisionExpression(Expression expression1, Expression expression2) {
        super(expression1, expression2);
    }

    @Override
    public int depth(){
        return expression1.depth() + expression2.depth();
    }

    @Override
    public int eval(){
        return expression1.eval() / expression2.eval();
    }

    @Override
    protected String operatorSymbol() {
        return ":";
    }
}
