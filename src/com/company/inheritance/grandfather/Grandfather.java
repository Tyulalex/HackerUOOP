package com.company.inheritance.grandfather;

public class Grandfather {

    String livingPlace = "Moscow";

    public String getLivingPlace() {
        return livingPlace;
    }

    public void setLivingPlace(String livingPlace) {
        this.livingPlace = livingPlace;
    }

    void knowsWhoIsLenin() {
        System.out.println("knows who is Lenin");
    }
}
