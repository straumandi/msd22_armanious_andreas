package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private final static Logger logger = LogManager.getLogger(Main.class);

    public double add(double number1, double number2){
        logger.debug("add() called with following values: " + number1 + " and " + number2);
        return number1 + number2;
    }
    public double minus(double number1, double number2) {
        logger.debug("minus() called with following values: " + number1 + " and " + number2);
        return number1 - number2;
    }
    public double divide(double number1, double number2){
        logger.debug("divide() called with following values: " + number1 + " and " + number2);
        if(number2 == 0) {
            logger.error("division by zero!");
            throw new ArithmeticException();
        }
        return number1 / number2;
    }
    public double multiply(double number1, double number2) {
        logger.debug("multiply() called with following values: " + number1 + " and " + number2);
        return number1 * number2;
    }

    public double faculty(double number) {
        logger.debug("faculty() called with following value: " + number);
        double fac = 1;
        for (int i = 1; i <= number; i++) {
            fac *= i;
        }
        return fac;
    }
}
