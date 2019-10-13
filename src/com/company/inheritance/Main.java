package com.company.inheritance;

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
