package com.company.advanced_with_java.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Start {

    public static void main(String[] args) {

        HashMap<String, List<String>> map1 = new HashMap<>();
        map1.put("first", List.of("1", "2"));
        System.out.println(map1.get("first"));

        HashmapCustom map = new HashmapCustom();
        map.put(new Car("BMW", 1), "Всеволод");
        map.put(new Car("BMW", 2), "Иван");
        map.put(new Car("BMW", 3), "Артем Сергеевич");

        System.out.println(map.get(2));


       /* // List<Car> linkedList = new LinkedList<>();
        Car carTemp = null;
        for (int i = 0; i < map.M; i++) {
            Car car = new Car(String.valueOf(Math.random()), i);
            //linkedList.add(car);
            carTemp = car;
            map.put(car, "f");
        }
        int count = 0;
        for (int i = 0; i < map.M; i++) {
            if (map.massiv[i] == null) {
                count++;
            }
        }
        System.out.println("Коллизий = " + count);
        System.out.println(String.format("Оригинал - %s", carTemp));
        long time = System.currentTimeMillis();
        System.out.println(String.format("Найденное значение - %s", map.get(carTemp)));
        System.out.println(String.format("Поиск в мс на map - %s", System.currentTimeMillis() - time));*/
/*
    System.out.println(String.format("Оригинал - %s", carTemp));
    time = System.currentTimeMillis();
    System.out.println(String.format("Найденное значение - %s", linkedList.contains(carTemp)));
    System.out.println(String.format("Поиск в мс на linkedList - %s", System.currentTimeMillis() - time));*/

    }

}

class Car implements Comparable<Car>{

    private final String name;

    private final int id;

    public Car(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return id == car.id && name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Car car) {
        return this.id - car.id;
    }
}