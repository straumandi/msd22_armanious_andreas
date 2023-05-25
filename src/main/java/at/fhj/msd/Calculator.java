package at.fhj.msd;

public class Calculator {
    public double add(double number1, double number2){
        return number1 + number2;
    }
    public double minus(double number1, double number2) {
        return number1 - number2;
    }
    public double divide(double number1, double number2){
        if(number2 == 0) {
            throw new ArithmeticException();
        }
        return number1 / number2;
    }
    public double multiply(double number1, double number2) {
        return number1 * number2;
    }
    public double faculty(double number) {
        double fac = 1;
        for (int i = 1; i <= number; i++) {
            fac *= i;
        }
        return fac;
    }
}
