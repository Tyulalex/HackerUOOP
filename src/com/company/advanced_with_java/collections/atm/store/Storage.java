package com.company.advanced_with_java.collections.atm.store;

import com.company.advanced_with_java.collections.atm.domain.Nominal;
import com.company.advanced_with_java.collections.atm.domain.Treasure;

public class Storage {

    private static Treasure[] treasures;

    static {
        treasures = new Treasure[Nominal.values().length];

        for (int i = 0; i < treasures.length; i++) {
            treasures[i] = new Treasure();
            treasures[i].setNominal(Nominal.values()[i]);
            treasures[i].setAmount(100);
        }

        System.out.println("");
    }


}
