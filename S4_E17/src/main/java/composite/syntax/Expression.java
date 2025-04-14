package composite.syntax;

/**
 * @author Quentin Nater <Andreas Ruppen>
 */
public interface Expression {

	/**
	 * @return The result of the mathematical expression.
	 */
	int eval();

	/**
	 * @return The height of the equivalent tree of the mathematical expression.
	 */
	int depth();

	/**
	 * The method recursively traverse the expression tree and prints its structure as the
	 * standard infix notation with surrounding parentheses (i.e ( A + B ) ).
	 */
	void prettyPrint();

	/**
	 * The method recursively traverse the expression tree and prints its structure as the
	 * standard prefix (Polish) notation with surrounding brackets (i.e  < + A B >).
	 */
	void prefixPrint();

}
