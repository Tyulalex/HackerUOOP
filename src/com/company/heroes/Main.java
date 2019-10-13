package com.company.heroes;

import com.company.heroes.mutants.Deadpool;
import com.company.heroes.mutants.Spiderman;
import com.company.heroes.people.Ironman;
import com.company.heroes.people.Superman;

public class Main {

    public static void main(String[] args) throws Exception {
        Spiderman spiderman = new Spiderman();
        spiderman.usePower();
        Deadpool deadpool = new Deadpool();
        deadpool.usePower();
        Ironman ironman = new Ironman();
        ironman.usePower();
        Superman superman = new Superman();
        superman.usePower();
    }
}
