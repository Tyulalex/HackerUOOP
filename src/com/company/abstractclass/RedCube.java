package com.company.abstractclass;

public class RedCube implements ColorFigure {

    @Override
    public void paint() {
        System.out.println("red cube paint");
    }

    @Override
    public void draw() {
        System.out.println("red cube draw");
    }

}
