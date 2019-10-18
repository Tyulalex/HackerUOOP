package com.company.house;

public class Window implements HouseElement {

    @Override
    public void repair() {
        System.out.println("Окно ремонтируется");
    }
}
