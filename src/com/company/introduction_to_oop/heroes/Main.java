package com.company.introduction_to_oop.heroes;

import com.company.introduction_to_oop.heroes.mutants.Deadpool;
import com.company.introduction_to_oop.heroes.mutants.Spiderman;
import com.company.introduction_to_oop.heroes.people.Ironman;
import com.company.introduction_to_oop.heroes.people.Superman;

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
