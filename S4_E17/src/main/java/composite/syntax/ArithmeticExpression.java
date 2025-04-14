package composite.syntax;

public abstract class ArithmeticExpression implements Expression {

    protected Expression expression1;
    protected Expression expression2;

    public ArithmeticExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

<<<<<<< HEAD
    public Expression getLeft() {
        return expression1;
=======

    @Override
    public int eval() {
        return 0;
>>>>>>> origin/main
    }

    public Expression getRight() {
        return expression2;
    }
}
