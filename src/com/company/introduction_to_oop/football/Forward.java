package com.company.introduction_to_oop.football;

public interface Forward {

    default void scoreOften() {
        System.out.println("Забиваю часто");
    }
}
