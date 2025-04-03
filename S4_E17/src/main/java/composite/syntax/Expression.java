package composite.syntax;

/**
 * @author Quentin Nater <Andreas Ruppen>
 */
public interface Expression {
	
	public int eval();
	
	public int depth();
	
	public void prettyPrint();
	
	public void prefixPrint();

}
