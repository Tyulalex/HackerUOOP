package com.company.introduction_to_oop.privat;

import java.util.Random;

public class TireFitting {

    private void removeTheWheel() {
        System.out.println("remove the wheel");
    }

    private void fixWheel() {
        System.out.println("fix wheel");
    }

    private boolean checkQuality() {
        Random rand = new Random();
        System.out.println("check quality");
        boolean qualityResult = rand.nextBoolean();
        System.out.println("Quality result is " + qualityResult);
        return qualityResult;
    }

    private void installWheel() {
        System.out.println("install wheel");
    }

    public void makeService() {
        removeTheWheel();
        fixWheel();
        boolean qualityResult = checkQuality();
        while (!qualityResult) {
            removeTheWheel();
            fixWheel();
            qualityResult = checkQuality();
        }
        installWheel();
        System.out.println("Все четыре этапа замены колеса пройдены. Не пытайтесь сделать public доступ и" +
                " вызывать этапы замены по отдельности. Это может привести к случайному пропуску этапов или изменению " +
                "порядка следования");
    }
}
