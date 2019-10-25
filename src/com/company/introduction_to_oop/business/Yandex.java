package com.company.introduction_to_oop.business;

public class Yandex {

    static Photostudio[] PHOTOSTUDIOS = new Photostudio[10];

    static void addNewPhotoStudio(Photostudio photostudio) {
        for (int i = 0; i <= PHOTOSTUDIOS.length - 1; i++) {
            if (PHOTOSTUDIOS[i] == null) {
                PHOTOSTUDIOS[i] = photostudio;
                break;
            }
        }
    }
}
