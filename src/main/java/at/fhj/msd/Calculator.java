package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    /**
     * <p>This constant is used for the logging functionality of log4j2.</p>
     * @since 1.0
     * @author Andreas Armanious
     */
    private final static Logger logger = LogManager.getLogger(Main.class);

    /**
     * <p>This method adds to double values.</p>
     * @param number1 first number to add
     * @param number2 second number to add
     * @return the addition result as a double
     * @since 1.0
     * @author Andreas Armanious
     */
    public double add(double number1, double number2){
        logger.debug("add() called with following values: " + number1 + " and " + number2);
        return number1 + number2;
    }

    /**
     * <p>This method subtracts to double values.</p>
     * @param number1 the first number (minuend)
     * @param number2 the second number to subtract (subtrahend)
     * @return the subtraction result as a double
     * @since 1.0
     * @author Andreas Armanious
     */
    public double minus(double number1, double number2) {
        logger.debug("minus() called with following values: " + number1 + " and " + number2);
        return number1 - number2;
    }

    /**
     * <p>This method divides to double values.</p>
     * @param number1 the first number (dividend)
     * @param number2 the second number (divisor)
     * @return the division result as a double
     * @throws ArithmeticException when divisor is zero
     * @since 1.0
     * @author Andreas Armanious
     */
    public double divide(double number1, double number2){
        logger.debug("divide() called with following values: " + number1 + " and " + number2);
        if(number2 == 0) {
            logger.error("division by zero!");
            throw new ArithmeticException();
        }
        return number1 / number2;
    }

    /**
     * <p>This method multiplies to double values.</p>
     * @param number1 the first number
     * @param number2 the second number
     * @return the multiplication result as a double
     * @since 1.0
     * @author Andreas Armanious
     */
    public double multiply(double number1, double number2) {
        logger.debug("multiply() called with following values: " + number1 + " and " + number2);
        return number1 * number2;
    }

    /**
     * <p>This method calculates the faculty of the passed number.</p>
     * @param number the number to calculate the faculty of
     * @return the faculty result as a double
     * @since 1.0
     * @author Andreas Armanious
     */
    public double faculty(double number) {
        logger.debug("faculty() called with following value: " + number);
        double fac = 1;
        for (int i = 1; i <= number; i++) {
            fac *= i;
        }
        return fac;
    }
}
