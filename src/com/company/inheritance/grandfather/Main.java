package com.company.inheritance.grandfather;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Grandfather grandfather = new Grandfather();
        System.out.println(grandfather.getLivingPlace());
        grandfather.knowsWhoIsLenin();

        Father father = new Father();
        System.out.println(father.getLivingPlace());
        father.knowsWhoIsLenin();
        father.listenTheBeatles();

        Mother mother = new Mother();
        mother.isAGreatCook();

        Daughter daughter = new Daughter(father, mother);
        System.out.println(daughter.getLivingPlace());
        daughter.learnJavaAndSql();
        daughter.knowsWhoIsLenin();
        daughter.getFather().listenTheBeatles();
        daughter.getMother().isAGreatCook();

        Son son = new Son(father, mother);
        System.out.println(son.getLivingPlace());
        son.learnJava();
        son.knowsWhoIsLenin();
        son.getFather().listenTheBeatles();
        son.getMother().isAGreatCook();


    }
}
