package com.company.introduction_to_oop.hm1;

public class Iteration {

    public static void main(String[] args) {
        int count = 5;
        displayCountBack(count);
    }

    public static void displayCountBack(int count) {
        while (count > 0) {
            count--;
            if (count % 2 == 0) {
                System.out.println("Четное число - " + count);
            } else {
                System.out.println("Нечетное число - " + count);
            }
        }
    }
}
