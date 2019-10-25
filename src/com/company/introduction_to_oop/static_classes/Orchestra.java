package com.company.introduction_to_oop.static_classes;

public class Orchestra {

    static Orchestra ORCHESTRA = new Orchestra();

    static class SymphonicOrchestra {

        void playSymphonicMusic() {
            System.out.println("play symphonic music");
        }

        void startAConcert() {
            inviteConductor();
            ORCHESTRA.chooseAConcertHall();
            new FolkOrchestra().playFolkMusic();
        }
    }

    static class FolkOrchestra {

        void playFolkMusic() {
            System.out.println("play folk music");
        }

        void startAConcert() {
            inviteConductor();
            ORCHESTRA.chooseAConcertHall();
            new SymphonicOrchestra().playSymphonicMusic();
        }
    }

    void chooseAConcertHall() {
        System.out.println("choose a concert hall");
    }


    static void inviteConductor() {
        System.out.println("invite conductor");
    }
}
