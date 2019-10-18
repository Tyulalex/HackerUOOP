package com.company.house;

public class Door implements HouseElement {
    @Override
    public void repair() {
        System.out.println("Дверь ремонтируется");
    }
}
