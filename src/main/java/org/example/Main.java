package org.example;

import at.fhj.msd.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(1,1));
        System.out.println(calculator.minus(1,0));
        System.out.println(calculator.divide(1,2));
        System.out.println(calculator.multiply(1,1));
    }
}