package com.company.petrol_station;

public class PetrolStation {

    public void makeService() {
        Car car = new Car(200, TypeOfGas.GAS_98, 0.0f);
        Order order = Cashbox.createOrder(car);
        car.addGas(Dispenser.fillUp(order.getLitters()));
        System.out.println();

        Car car2 = new Car(2500, TypeOfGas.GAS_95, 55);
        try {
            Order order1 = Cashbox.createOrderFullTank(car2);
            car2.addGas(Dispenser.fillUp(order1.getLitters()));
            System.out.println("Change: " + car2.getMoney());
        } catch (Exception e) {
            System.out.println("Unable to do service, not enough money");
        }
    }

    public static void main(String[] args) {
        PetrolStation petrolStation = new PetrolStation();
        petrolStation.makeService();
    }
}
