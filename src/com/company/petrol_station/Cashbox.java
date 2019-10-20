package com.company.petrol_station;

public class Cashbox {

    private static Float PRICE_OF_95_GAS = 45.0f;
    private static Float PRICE_OF_98_GAS = 50.0f;


    public static Order createOrder(TypeOfGas gasType, Integer money) {
        Float litters = 0.0f;
        if (gasType == TypeOfGas.GAS_95) {
            litters = money / PRICE_OF_95_GAS;
        }
        if (gasType == TypeOfGas.GAS_98) {
            litters = money / PRICE_OF_98_GAS;
        }
        return new Order(gasType, litters);
    }
}
