package com.company.introduction_to_oop.house;

public class Window implements HouseElement {

    @Override
    public void repair() {
        System.out.println("Окно ремонтируется");
    }
}
