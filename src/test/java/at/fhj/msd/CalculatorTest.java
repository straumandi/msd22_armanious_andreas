/* msd22_armanious_andreas
 * This class contains the unit tests for the Calculator class.
 * Author: andi_
 * Last Change: 25.05.2023
 */
package at.fhj.msd;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @DisplayName("First test of add() method")
    @Test
    void testAdd1() {
        double result = calculator.add(1, 1);
        Assertions.assertEquals(2, result);
    }

    @DisplayName("Second test of add() method")
    @Test
    void testAdd2() {
        double result = calculator.add(0, 1);
        Assertions.assertEquals(1, result);
    }

    @DisplayName("Third test of add() method")
    @Test
    void testAdd3() {
        double result = calculator.add(100, -50);
        Assertions.assertEquals(50, result);
    }

    @DisplayName("First test of minus() method")
    @Test
    void testMinus1() {
        double result = calculator.minus(100, -50);
        Assertions.assertEquals(150, result);
    }

    @DisplayName("Second test of minus() method")
    @Test
    void testMinus2() {
        double result = calculator.minus(0, 50);
        Assertions.assertEquals(-50, result);
    }

    @DisplayName("Third test of minus() method")
    @Test
    void testMinus3() {
        double result = calculator.minus(0, -100);
        Assertions.assertEquals(100, result);
    }

    @DisplayName("First test of divide() method")
    @Test
    void testDivide1() {
        double result = calculator.divide(0, 50);
        Assertions.assertEquals(0, result);
    }

    @DisplayName("Second test of divide() method (division by zero)")
    @Test
    void testDivide2() {
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
    }

    @DisplayName("Third test of divide() method")
    @Test
    void testDivide3() {
        double result = calculator.divide(20, 20);
        Assertions.assertEquals(1, result);
    }

    @DisplayName("First test of multiply() method")
    @Test
    void testMultiply1() {
        double result = calculator.multiply(0, 50);
        Assertions.assertEquals(0, result);
    }

    @DisplayName("Second test of multiply() method")
    @Test
    void testMultiply2() {
        double result = calculator.multiply(2, 50);
        Assertions.assertEquals(100, result);
    }

    @DisplayName("Third test of multiply() method")
    @Test
    void testMultiply3() {
        double result = calculator.multiply(500, -2);
        Assertions.assertEquals(-1000, result);
    }

    //Teardown not necessary since Java has Garbage Collection
}
