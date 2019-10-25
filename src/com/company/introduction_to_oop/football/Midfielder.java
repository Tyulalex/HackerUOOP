package com.company.introduction_to_oop.football;

public interface Midfielder {

    default void scoreOften() {
        System.out.println("Забиваю часто");
    }
}
