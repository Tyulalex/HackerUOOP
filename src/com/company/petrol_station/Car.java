package com.company.petrol_station;

public class Car {
    private Integer money;
    private TypeOfGas typeOfGas;
    private Float currentQuantityOfGas;

    public Car(Integer money, TypeOfGas typeOfGas,
               Float currentQuantityOfGas) {
        this.money = money;
        this.typeOfGas = typeOfGas;
        this.currentQuantityOfGas = currentQuantityOfGas;
    }

    public Integer getMoney() {
        return money;
    }

    public TypeOfGas getTypeOfGas() {
        return typeOfGas;
    }

    public void addGas(Float quantityOfGas) {
        currentQuantityOfGas += quantityOfGas;
    }
}
