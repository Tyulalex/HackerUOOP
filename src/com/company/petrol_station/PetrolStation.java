package com.company.petrol_station;

public class PetrolStation {

    public void makeService() {
        Car car = new Car(200, TypeOfGas.GAS_98, 0.0f);
        Order order = Cashbox.createOrder(car.getTypeOfGas(), car.getMoney());
        car.addGas(Dispenser.fillUp(order.getLitters()));
        System.out.println();
    }

    public static void main(String[] args) {
        PetrolStation petrolStation = new PetrolStation();
        petrolStation.makeService();
    }
}
