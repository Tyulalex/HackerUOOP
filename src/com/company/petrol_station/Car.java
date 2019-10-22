package com.company.petrol_station;

public class Car {

    private Integer money;
    private TypeOfGas typeOfGas;
    private Float currentQuantityOfGas;

    private Integer gasTankVolume;

    public Car(Integer money, TypeOfGas typeOfGas,
               Float currentQuantityOfGas) {
        this.money = money;
        this.typeOfGas = typeOfGas;
        this.currentQuantityOfGas = currentQuantityOfGas;
    }

    public Car(Integer money, TypeOfGas typeOfGas, Integer gasTankVolume) {
        this.money = money;
        this.typeOfGas = typeOfGas;
        this.gasTankVolume = gasTankVolume;
        this.currentQuantityOfGas = 0.0f;
    }

    public Integer getMoney() {
        return money;
    }

    public TypeOfGas getTypeOfGas() {
        return typeOfGas;
    }

    public void withdrawMoney(Integer amount) {
        this.money = this.money - amount;
    }

    public void depositMoney(Integer amount) {
        this.money = this.money + amount;
    }

    public Integer getGasTankVolume() {
        return gasTankVolume;
    }

    public void addGas(Float quantityOfGas) {
        currentQuantityOfGas += quantityOfGas;
    }
}
