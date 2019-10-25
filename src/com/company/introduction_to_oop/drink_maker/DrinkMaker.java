package com.company.introduction_to_oop.drink_maker;

public interface DrinkMaker {

    void getRightCup();

    void putIngredient();

    default void giveACupToConsumer() {
        System.out.println("Вот ваш напиток");
    }
}
