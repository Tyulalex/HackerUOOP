package com.company.house;


public class House {

    private HouseElement[] windows;
    private HouseElement[] doors;
    private HouseElement roof;

    private HouseElement[][] houseElements;

    public House() {
        this.windows = new Window[]{new Window(), new Window(), new Window()};
        this.doors = new Door[]{new Door(), new Door()};
        this.roof = new Roof();

        this.houseElements = new HouseElement[][]{windows, doors, {roof}};
    }

    void makeRepairs() {
        for (HouseElement[] hs : this.houseElements) {
            for (HouseElement houseElement : hs) {
                houseElement.repair();
            }
        }
    }
}
