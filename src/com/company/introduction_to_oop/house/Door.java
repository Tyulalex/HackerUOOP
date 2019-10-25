package com.company.introduction_to_oop.house;

public class Door implements HouseElement {
    @Override
    public void repair() {
        System.out.println("Дверь ремонтируется");
    }
}
