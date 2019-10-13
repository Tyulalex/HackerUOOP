package com.company.football;

public interface Midfielder {

    default void scoreOften() {
        System.out.println("Забиваю часто");
    }
}
