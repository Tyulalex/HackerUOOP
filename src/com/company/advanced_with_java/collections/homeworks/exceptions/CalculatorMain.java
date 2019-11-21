package com.company.advanced_with_java.collections.homeworks.exceptions;

public class CalculatorMain {

    public static void main(String[] args) {

        Calculator calculator = new CalculatorImpl();
        try {
            int result = calculator.sum(3, 1);
            System.out.println("SUM = " + result);
        } catch (CalculatorException ex) {
            System.out.println("Exception occured: " + ex.getMessage());
        }
        try {
            int result = calculator.diff(-10000, 2);
            System.out.println("diff = " + result);
        } catch (CalculatorException ex) {
            System.out.println("Exception occured: " + ex.getMessage());
        }
        try {
            int result = calculator.mult(3, 6);
            System.out.println("mult = " + result);
        } catch (CalculatorException ex) {
            System.out.println("Exception occured: " + ex.getMessage());
        }

        try {
            int result = calculator.div(7, 3);
            System.out.println("div = " + result);
        } catch (CalculatorException ex) {
            System.out.println("Exception occured: " + ex.getMessage());
        }


    }
}
