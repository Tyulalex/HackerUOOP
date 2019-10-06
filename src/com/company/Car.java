package com.company;

public class Car {

    int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static void main(String[] args) {
        Car car1 = new Car(100);
        Car car2 = car1;
        System.out.println("Car1 max speed: " + car1.getMaxSpeed());
        System.out.println("Car2 max speed: " + car2.getMaxSpeed());
        car2.setMaxSpeed(200);
        System.out.println("");
        System.out.println("Car1 max speed: " + car1.getMaxSpeed());
        System.out.println("Car2 max speed: " + car2.getMaxSpeed());
        System.out.println("");

        car1.setMaxSpeed(100);
        car2 = new Car(100);
        System.out.println("Car1 max speed: " + car1.getMaxSpeed());
        System.out.println("Car2 max speed: " + car2.getMaxSpeed());
        System.out.println("");
        car2.setMaxSpeed(200);
        System.out.println("Car1 max speed: " + car1.getMaxSpeed());
        System.out.println("Car2 max speed: " + car2.getMaxSpeed());
    }
}
