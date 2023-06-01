package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private final static Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("This is an info log entry.");
        logger.error("This is an error log entry.");

        Calculator calculator = new Calculator();

        System.out.println(calculator.add(1,1));
        System.out.println(calculator.minus(1,0));
        System.out.println(calculator.divide(1,2));
        System.out.println(calculator.multiply(1,1));
    }
}