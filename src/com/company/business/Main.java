package com.company.business;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Business business1 = new Business("first photostudio");
        Business business2 = new Business("second photostudio");

        Photostudio[] photostudios = {business1, business2};
        for (Photostudio p : photostudios) {
            p.addToYandexMap(p);
            p.getLicense();
            p.makeSignboard();
        }

        KeyCutting[] keyCuttings = {business1, business2};
        for (KeyCutting k : keyCuttings) {
            k.findKeyMaster();
        }

        System.out.println(Arrays.toString(Yandex.PHOTOSTUDIOS));

    }
}
