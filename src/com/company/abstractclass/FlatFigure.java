package com.company.abstractclass;

interface FlatFigure extends Figure {

    void flatten();

    @Override
    default void draw() {
        System.out.println("flat figure draw");
    }
}
