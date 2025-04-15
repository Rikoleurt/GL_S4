# GL_S4
## Exercise 17 – Composite Design Pattern

This exercise implements the Composite design pattern to model arithmetic expressions using an abstract syntax tree structure.

We strictly followed the UML diagram provided in the assignment:

- The interface `Expression` defines the methods for all expression elements.
- The abstract class `ArithmeticExpression` implements `Expression` and serves as the base for all binary operations.
- The classes `AdditionExpression`, `SubtractionExpression`, `MultiplicationExpression`, and `DivisionExpression` extend `ArithmeticExpression` and provide their own implementations of the interface methods.

The class `Constant` also implements `Expression`, but doesn't extend `ArithmeticExpression` because it represents the values in the expression tree.

Each expression (including constants and binary operations) is evaluated recursively through method calls to `eval()`, `depth()`, `prettyPrint()`, and `prefixPrint()`.

All functionalities were tested and validated with the given examples.

**P.S : We modified the test class by adding additional prints to test and validate the examples.**
