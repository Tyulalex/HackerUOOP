package com.company.appliance;

public class Main {

    public static void main(String[] args) {
        Appliance[] appliances = {new Kettle(), new DishWasher()};
        for (Appliance appliance : appliances) {
            if (appliance instanceof Kettle) {
                ((Kettle) appliance).fillWithWater();
            }
            appliance.doWork();
            appliance.switchOff();
        }
    }
}
