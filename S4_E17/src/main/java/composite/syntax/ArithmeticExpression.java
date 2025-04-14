package composite.syntax;

public abstract class ArithmeticExpression implements Expression {

    private Expression expression1;
    private Expression expression2;

    public ArithmeticExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    public Expression getLeft() {
        return expression1;
    }

    public Expression getRight () {
        return expression2;
    }
}
