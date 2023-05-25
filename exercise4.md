# Test cases of exercise 4
In this file i will mention which test cases my CalculatorTest class does cover. The Calculator class has a test coverage of 100%, which is optimal.

## add() method
- addition: 1 + 1
- addition: 0 + 1
- addition: 100 + (-50)

## minus() method
- subtraction: 100 - (-50)
- subtraction: 0 - 50
- subtraction: 0 - (-100)

## divide() method
- division: 0 / 50
- division by zero: 1 / 0 (tests if the correct ArithmeticException is thrown)
- division: 20 / 20

## multiply() method
- multiplication: 0 * 50
- multiplication: 2 * 50
- multiplication: 500 * (-2)
