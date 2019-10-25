package com.company.introduction_to_oop.house;


public class House {

    private HouseElement[] windows;
    private HouseElement[] doors;
    private HouseElement roof;

    public House() {
        this.windows = new Window[]{new Window(), new Window(), new Window()};
        this.doors = new Door[]{new Door(), new Door()};
        this.roof = new Roof();

    }

    void makeRepairs() {
        HouseElement[][] houseElements = {windows, doors, {roof}};
        for (HouseElement[] hs : houseElements) {
            for (HouseElement houseElement : hs) {
                houseElement.repair();
            }
        }
    }
}
