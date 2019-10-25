package com.company.advanced_with_java.collections.atm.domain;

public enum Nominal {

    N10(10),
    N50(50),
    N100(100),
    N500(500);

    private final int value;

    Nominal(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
