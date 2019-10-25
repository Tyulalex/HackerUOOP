package com.company.introduction_to_oop;

public class Animal {

    private int age;
    private String color;

    public void run() {

    }

    public static void eat() {}


    static class StaticNestedClass {
        String color;
        String geometric;

        public static void getTexture() {
            eat();
            new Animal();

        }

        public void changeTexture() {
            eat();
        }
    }
}
