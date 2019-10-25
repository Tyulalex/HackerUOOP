package com.company.introduction_to_oop.hm1;

public class ShowTime {

    public static void main(String[] args) {
        showTime(1);
        showTime(1, 2);
        showTime(1, 2, 3);
    }

    public static void showTime(int hours, int minutes, int seconds) {
        System.out.println(hours + " - часов, " + minutes + " - минут, " + seconds + " - секунд");
    }

    public static void showTime(int hours, int minutes) {
        showTime(hours, minutes, 0);
    }

    public static void showTime(int hours) {
        showTime(hours, 0, 0);
    }
}


