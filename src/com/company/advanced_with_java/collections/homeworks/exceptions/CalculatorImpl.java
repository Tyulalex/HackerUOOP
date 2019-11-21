package com.company.advanced_with_java.collections.homeworks.exceptions;

public class CalculatorImpl implements Calculator {

    private static final Integer maxInt = Integer.MAX_VALUE;

    @Override
    public int sum(int x, int y) throws CalculatorException {
        long result = (long) x + (long) y;
        checkResult(result);
        return (int) result;
    }

    @Override
    public int diff(int x, int y) throws CalculatorException {
        long result = (long) x - (long) y;
        checkResult(result);
        return (int) result;
    }

    @Override
    public int mult(int x, int y) throws CalculatorException {
        long result = (long) x * (long) y;
        checkResult(result);
        return (int) result;
    }

    @Override
    public int div(int x, int y) throws DevideByZeroException {
        if (y == 0) {
            throw new DevideByZeroException("Division by zero is prohibited!");
        }
        return x / y;
    }

    private void checkResult(long result) throws CalculatorException {
        if (result > maxInt || result < Integer.MIN_VALUE) {
            throw new CalculatorException("Integer overflow");
        }

    }
}
