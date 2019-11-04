package com.company.advanced_with_java.collections.atm.store;

import com.company.advanced_with_java.collections.AtmCollection;
import com.company.advanced_with_java.collections.atm.domain.Account;
import com.company.advanced_with_java.collections.atm.domain.Nominal;
import com.company.advanced_with_java.collections.atm.domain.Treasure;
import com.company.advanced_with_java.collections.impl.ArrayAtmCollection;

import java.util.Date;

public class Storage {

    private static AtmCollection<Treasure> treasures;


    private static AtmCollection<Account> accounts;

    static {
        loadTreasures();

        loadAccounts();
    }

    private static void loadTreasures() {
        treasures = new ArrayAtmCollection<>();

        treasures.add(new Treasure(Nominal.N10, 2000));
        treasures.add(new Treasure(Nominal.N50, 2000));
        treasures.add(new Treasure(Nominal.N100, 2000));
        treasures.add(new Treasure(Nominal.N200, 2000));
        treasures.add(new Treasure(Nominal.N500, 2000));
        treasures.add(new Treasure(Nominal.N1000, 2000));
        treasures.add(new Treasure(Nominal.N2000, 2000));
        treasures.add(new Treasure(Nominal.N5000, 2000));


    }

    private static void loadAccounts() {

        accounts = new ArrayAtmCollection<>();
        accounts.add(new Account("vasya", new Date(), "1234"));
        accounts.add(new Account("petya", new Date(), "1234"));
        accounts.add(new Account("irina", new Date(), "1234"));
        accounts.add(new Account("kolya", new Date(), "1234"));
        accounts.add(new Account("anna", new Date(), "1234"));
        accounts.add(new Account("alina", new Date(), "1234"));
        accounts.add(new Account("vera", new Date(), "1234"));
    }

    public static AtmCollection<Account> getAccounts() {
        return accounts;
    }

    public static AtmCollection<Treasure> getTreasures() {
        return treasures;
    }


}
