package composite.syntax;

/**
 * @author Quentin Nater <Andreas Ruppen>
 */
public interface Expression {

	/**
	 *
	 * @return The result of the mathematical expression
	 */
	int eval();

	/**
	 *
	 * @return The number of sub-expressions that are in the general expression
	 */
	int depth();

	/**
	 * Infix notation (i.e " A + B ") print
	 */
	void prettyPrint();

	/**
	 * Prefix notation print
	 */
	void prefixPrint();

}
