package com.company.house;

public class Roof implements HouseElement {
    @Override
    public void repair() {
        System.out.println("Крыша ремонтируется");
    }

}
