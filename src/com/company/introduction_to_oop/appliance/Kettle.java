package com.company.introduction_to_oop.appliance;

public class Kettle extends Appliance {
    @Override
    void doWork() {
        System.out.println("Кипячу воду");
    }

    void fillWithWater() {
        System.out.println("наливаю воду");
    }
}
