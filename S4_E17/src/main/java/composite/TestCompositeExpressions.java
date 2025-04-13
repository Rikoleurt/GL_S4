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
				new Constant(6)); // 4
		
		Expression mye2 = new AdditionExpression( //17
				new DivisionExpression( // 25
						new Constant(50),
						new Constant(2)),
				new SubtractionExpression( // -9
						new MultiplicationExpression( // 8
								new Constant(2),
								mye1), // 4
						new Constant(17)));
		
		Expression mye3 = new SubtractionExpression( // - 64
				new MultiplicationExpression( // 21
						new Constant(3),
						new Constant(7)),
				new MultiplicationExpression( // 85
						new Constant(5),
						mye2)); // 17
		
		Expression mye4 = new DivisionExpression( // 2
				new DivisionExpression( // 8
						new Constant(16),
						new Constant(2)),
				new Constant(4));
		
		Expression myExample1 = new AdditionExpression( // - 62
				mye3, // - 64
				mye4); // 2
		
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
		myExample1.prettyPrint();
		System.out.println("Result : " + myExample1.eval());
		System.out.println("Depth : " + myExample1.depth());
		System.out.println("--------------------------");
		myExample2.prettyPrint();
		System.out.println("Result : " + myExample2.eval());
		System.out.println("Depth : " + myExample2.depth());

	loggingService.info("");
		myExample1.prefixPrint();
	loggingService.info("");
	loggingService.info(Integer.toString(myExample1.eval()));
	loggingService.info(Integer.toString(myExample1.depth()));

		// myExample2
		myExample2.prettyPrint();
		loggingService.info("");
		myExample2.prefixPrint();
		loggingService.info("");
		loggingService.info(Integer.toString(myExample2.eval()));
		loggingService.info(Integer.toString(myExample2.depth()));
		
	}

}
