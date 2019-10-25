package com.company.introduction_to_oop.petrol_station;

import java.util.Map;

public class Cashbox {

    private static Float PRICE_OF_95_GAS = 45.0f;
    private static Float PRICE_OF_98_GAS = 50.0f;
    private static Map<TypeOfGas, Float> GAS_PRICES_BY_TYPE = Map.of(
            TypeOfGas.GAS_95, PRICE_OF_95_GAS, TypeOfGas.GAS_98, PRICE_OF_98_GAS);


    public static Order createOrder(Car car) {
        Float litters = 0.0f;
        litters = car.getMoney() / GAS_PRICES_BY_TYPE.get(car.getTypeOfGas());
        car.withdrawMoney(car.getMoney());
        return new Order(car.getTypeOfGas(), litters);
    }

    public static Order createOrderFullTank(Car car) throws Exception {
        Integer fullTankCost = 0;
        fullTankCost = Math.round(car.getGasTankVolume() * GAS_PRICES_BY_TYPE.get(car.getTypeOfGas()));
        if (car.getMoney() < fullTankCost) {
            throw new Exception();
        }
        car.withdrawMoney(fullTankCost);
        return new Order(car.getTypeOfGas(), Float.valueOf(car.getGasTankVolume()));
    }

}
