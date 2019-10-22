package com.company.drink_maker;

public interface DrinkMaker {

    void getRightCup();

    void putIngredient();

    default void giveACupToConsumer() {
        System.out.println("Вот ваш напиток");
    }
}
