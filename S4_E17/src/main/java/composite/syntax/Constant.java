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
    } // Every Constant adds 1 to the depth as it is a leaf of the tree

    // prettyPrint() and prefixPrint() are equal for both of the notation
    @Override
    public void prettyPrint() {
        System.out.print(value);
    }

    @Override
    public void prefixPrint() {
        System.out.print(value);
    }

}
