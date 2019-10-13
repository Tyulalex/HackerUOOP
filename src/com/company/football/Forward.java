package com.company.football;

public interface Forward {

    default void scoreOften() {
        System.out.println("Забиваю часто");
    }
}
