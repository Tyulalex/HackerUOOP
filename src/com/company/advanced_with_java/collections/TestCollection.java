package com.company.advanced_with_java.collections;

import com.company.introduction_to_oop.hm1.Array;

import java.util.*;

public class TestCollection {

    public static void main(String[] args) {

        HashmapCustom hashmapCustom = new HashmapCustom(8);
        hashmapCustom.put("BMS1", "blue");
        hashmapCustom.put("BMS2", "blue");
        hashmapCustom.put("BMS3", "blue");
        hashmapCustom.put("BMS4", "blue");
        hashmapCustom.put("BMS5", "blue");
        System.out.println(Arrays.toString(hashmapCustom.massiv));
        hashmapCustom.put("BMS6", "blue");
        System.out.println(Arrays.toString(hashmapCustom.massiv));
        hashmapCustom.put("BMS7", "blue");
        hashmapCustom.put("BMS8", "blue");
        hashmapCustom.put("BMS11", "blue");

        System.out.println(Arrays.toString(hashmapCustom.massiv));




        //Map<Car, String> treeMap = new TreeMap<>((s, t1) -> s.getName().compareTo(t1.getName()));
        //System.out.println(treeMap.entrySet());


        /*Set<String> strings = new HashSet<>();
        strings.add("BMW");
        strings.add("Mini");
        strings.add("Nissan");

        for(String s: strings) {
            System.out.println(s);
        }

        Map<String, String> map = new HashMap<>();
        map.put("BMW", "blue");
        map.put("Mini", "white");
        map.put("Nissan", "black");

        for(Map.Entry s: map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }*/

    }
}
