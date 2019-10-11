package com.company.hm1;

public class Array {

    public static void main(String[] args) {
        String[] array = {"I", "like", "to", "program", "in", "Java"};
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || i == 1 || i == 5) {
                result += array[i] + " ";
            }
        }
        System.out.println(result);
    }
}
