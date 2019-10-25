package com.company.introduction_to_oop;

public class House {

    final static String DEFAULT_CURRENCY = "$";

    String color;
    int height;
    int price;
    static int g;

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void calculatePrice() {
        switch (this.color) {
            case "red":
                if (this.height < 100) {
                    setPrice(10000);
                } else {
                    setPrice(100000);
                }
                break;
            case "blue":
                if (this.height < 100) {
                    setPrice(5000);
                } else {
                    setPrice(7000);
                }
                break;
            default:
                if (this.height < 100) {
                    setPrice(1000);
                } else {
                    setPrice(2000);
                }
        }
    }

    public void displayHousePrice() {
        calculatePrice();
        System.out.println("Цена данного дома " + this.getPrice() + DEFAULT_CURRENCY);
    }

    public String getColor() {
        return this.color;
    }

    public int getHeight() {
        return this.height;
    }

    public void setColor(String color) {
        this.color = "light" + color;
    }

    public void setHeight(int height) {
        this.height = height * 100;
    }

    public static void main(String[] args) {
        House house1 = new House();
        House house2 = new House();
        house1.setColor("red");
        house1.setHeight(1);
        house2.setColor("blue");
        house2.setHeight(2);
        System.out.println("House 1: color: " + house1.getColor() + " height: " + house1.getHeight());
        System.out.println("House 2: color: " + house2.getColor() + " height " + house2.getHeight());

        house1.displayHousePrice();
        house2.displayHousePrice();;
    }
}
