package com.company.introduction_to_oop.football;

public class Player implements Defender, Forward, Goalkeeper, Midfielder, CaptainCoach {
    @Override
    public void scoreRarely() {
        System.out.println("Забиваю редко");
    }

    @Override
    public void scoreOften() {
        System.out.println("Забиваю часто");
    }

    @Override
    public void scoreVeryRarely() {
        System.out.println("Забиваю очень редко");
    }
}
