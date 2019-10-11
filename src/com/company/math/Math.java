package com.company.math;

public class Math {

    public static Integer convertToInteger(String value) {
        return Integer.parseInt(value);
    }

    public static String compareInteger(Integer value1, Integer value2) {
        int result = Integer.compare(value1, value2);
        String compareResultString = "";
        switch (result) {
            case 1:
                compareResultString = "Больше";
                break;
            case -1:
                compareResultString = "Меньше";
                break;
            case 0:
                compareResultString = "Равно";
                break;
        }
        return compareResultString;
    }

    public static Integer pow(Integer value, int power) {
        if (power == 0) {
            value = 1;
        } else if (power > 0) {
            value = value * pow(value, power - 1);
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println(Math.convertToInteger("54"));
        System.out.println(compareInteger(4, 3));
        System.out.println(compareInteger(3, 3));
        System.out.println(compareInteger(3, 4));

        System.out.println(Math.pow(3, 3));
    }
}


