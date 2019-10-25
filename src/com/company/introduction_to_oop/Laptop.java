package com.company.introduction_to_oop;

public class Laptop {

    String color;
    String brand;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Laptop(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public boolean equals(Laptop o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        return this.getBrand().equals(o.getBrand()) && this.getColor().equals(o.getColor());
    }

    public static void main(String[] args) {
        Laptop samsungLaptop = new Laptop("silver", "Samsung");
        Laptop hpLaptop = new Laptop("silver", "HP");
        System.out.println(samsungLaptop.getColor() == hpLaptop.getColor());
        System.out.println(samsungLaptop.getBrand() == hpLaptop.getBrand());

        System.out.println(samsungLaptop.getColor().equals(hpLaptop.getColor()));
        System.out.println(samsungLaptop.getBrand().equals(hpLaptop.getBrand()));

        hpLaptop.setBrand("Samsung");

        System.out.println(samsungLaptop.equals(hpLaptop));
        System.out.println(samsungLaptop == hpLaptop);
    }
}
