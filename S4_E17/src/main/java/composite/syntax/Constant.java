package composite.syntax;

public class Constant implements Expression {

    int value;

    public Constant(int value) {
        this.value = value;
    }

    @Override
    public int eval() {
        return value;
    }

    @Override
    public int depth() {
        return 1;
    }

    @Override
    public void prettyPrint() {
        System.out.print(value);
    }

    @Override
    public void prefixPrint() {
        System.out.print(value);
    }

}
