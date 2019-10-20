package com.company.petrol_station;

public class Dispenser {

    private static boolean isOccupied;


    public static Float fillUp(Float litters) {
        // Если колонка занята, просим подождать
        if (isOccupied) {
            System.out.println("Подождите, пока колонка освободится");
            // Если колонка свободна, просим подождать
        } else {
            // занимаем колонку
            isOccupied = true;
            // наливаем бензин согласно заказу
            System.out.println("Заправлено " + litters);
            // освобождаем колонку
            isOccupied = false;
        }
        return litters;
    }
}