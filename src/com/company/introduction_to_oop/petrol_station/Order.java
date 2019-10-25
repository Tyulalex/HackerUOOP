package com.company.introduction_to_oop.petrol_station;

public class Order {
    private TypeOfGas typeOfGas;
    private Float litters;

    public Order(TypeOfGas typeOfGas, Float litters) {
        this.typeOfGas = typeOfGas;
        this.litters = litters;
    }

    public TypeOfGas getTypeOfGas() {
        return typeOfGas;
    }

    public void setTypeOfGas(TypeOfGas typeOfGas) {
        this.typeOfGas = typeOfGas;
    }

    public Float getLitters() {
        return litters;
    }

    public void setLitters(Float litters) {
        this.litters = litters;
    }
}