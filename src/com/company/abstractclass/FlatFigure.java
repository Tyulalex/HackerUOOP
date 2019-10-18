package com.company.abstractclass;

interface FlatFigure extends Figure {

    abstract void flatten();

    @Override
    default void draw(){
        System.out.println("flat figure draw");
    }
}
