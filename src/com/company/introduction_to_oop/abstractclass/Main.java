package com.company.introduction_to_oop.abstractclass;

public class Main {

    public static void main(String[] args) {
        RedCube redCube = new RedCube();
        Square square = new Square();

        redCube.draw();
        redCube.paint();

        square.flatten();
        square.draw();
    }
}
