package com.company.introduction_to_oop.privat;

public class NameFactory {

    private static String MODIFICATION = "X1";
    private static String YEAR = "2019";

    public static String getCarName(){
        return MODIFICATION + " - " + YEAR;
    }
}
