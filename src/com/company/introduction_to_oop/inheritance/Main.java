package com.company.introduction_to_oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.run();

        cat.eatLikeCat();

        Mouse mouse = new Mouse();
        mouse.eat();
        mouse.run();
        mouse.eatLikeMouse();
    }
}
