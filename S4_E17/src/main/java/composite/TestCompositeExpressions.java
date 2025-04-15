package composite;

import composite.syntax.Expression;
import composite.syntax.AdditionExpression;
import composite.syntax.Constant;
import composite.syntax.DivisionExpression;
import composite.syntax.MultiplicationExpression;
import composite.syntax.SubtractionExpression;
import java.util.logging.*;

/**
 * @author Quentin Nater <Andreas Ruppen>
 */
public class TestCompositeExpressions {
	private static Logger loggingService = Logger.getLogger("TestCompositeExpressions");

	public static void main(String[] args) {
		
		Expression mye1 = new SubtractionExpression(
				new Constant(10),
				new Constant(6));
		
		Expression mye2 = new AdditionExpression(
				new DivisionExpression(
						new Constant(50),
						new Constant(2)),
				new SubtractionExpression(
						new MultiplicationExpression(
								new Constant(2),
								mye1),
						new Constant(17)));
		
		Expression mye3 = new SubtractionExpression(
				new MultiplicationExpression(
						new Constant(3),
						new Constant(7)),
				new MultiplicationExpression(
						new Constant(5),
						mye2));
		
		Expression mye4 = new DivisionExpression(
				new DivisionExpression(
						new Constant(16),
						new Constant(2)),
				new Constant(4));
		
		Expression myExample1 = new AdditionExpression(
				mye3,
				mye4);
		
		Expression myExample2 = new DivisionExpression(
				new Constant(12),
				new SubtractionExpression(
						new AdditionExpression(
								new Constant(5),
								new Constant(2)),
						new MultiplicationExpression(
								new Constant(2),
								new Constant(2))));
		// myExample1
		System.out.println("---------- Example 1 ----------");
		myExample1.prettyPrint();
		System.out.println();
		System.out.println("Result : " + myExample1.eval());
		System.out.println("Depth : " + myExample1.depth());
		System.out.println("---------- Example 2 ----------");
		myExample2.prettyPrint();
		System.out.println();
		System.out.println("Result : " + myExample2.eval());
		System.out.println("Depth : " + myExample2.depth());

		myExample1.prefixPrint();
		System.out.println();
		myExample1.prettyPrint();
		System.out.println();
		loggingService.info(Integer.toString(myExample1.eval()));
		loggingService.info(Integer.toString(myExample1.depth()));

		// myExample2
		myExample2.prettyPrint();
		System.out.println();
		myExample2.prefixPrint();
		System.out.println();
		loggingService.info(Integer.toString(myExample2.eval()));
		loggingService.info(Integer.toString(myExample2.depth()));
	}
}
