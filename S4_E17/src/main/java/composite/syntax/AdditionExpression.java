package composite.syntax;

public class AdditionExpression extends ArithmeticExpression {

    public AdditionExpression(Expression expression1, Expression expression2) {
        super(expression1, expression2);
    }

    @Override
<<<<<<< HEAD
    public int eval() {
=======
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
>>>>>>> origin/main
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
