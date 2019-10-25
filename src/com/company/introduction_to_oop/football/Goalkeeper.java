package com.company.introduction_to_oop.football;

public interface Goalkeeper {

    default void scoreVeryRarely() {
        System.out.println("Забиваю очень редко");
    }
}
