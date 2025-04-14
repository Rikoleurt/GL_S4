package composite.syntax;

public class AdditionExpression extends ArithmeticExpression {

    public AdditionExpression(Expression expression1, Expression expression2) {
        super(expression1, expression2);
    }

    @Override
    public int depth(){
        return 1 + Math.max(getLeft().depth(), getRight().depth()); // Add 1 over the maximum registered depth value
    }

    @Override
    public int eval(){
        return getLeft().eval() + getRight().eval();
    }

    @Override
    public void prettyPrint() {
        System.out.print("( ");
        getLeft().prettyPrint();
        System.out.print(" + ");
        getRight().prettyPrint();
        System.out.print(" )");
    }

    @Override
    public void prefixPrint() {
        System.out.print("< + ");
        getLeft().prefixPrint();
        System.out.print(" ");
        getRight().prefixPrint();
        System.out.print(" >");
    }
}
