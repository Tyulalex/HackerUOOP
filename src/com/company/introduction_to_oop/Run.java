package com.company.introduction_to_oop;

public class Run {

    private final static double DEFAULT_WEATHER = 0;

    private int numberOfRunners;
    private String stadiumName;
    private double weather;

    private Run(int numberOfRunners, String stadiumName, double weather) {
        this.numberOfRunners = numberOfRunners;
        this.stadiumName = stadiumName;
        this.weather = weather;
    }

    private Run(int numberOfRunners, String stadiumName) {
        this(numberOfRunners, stadiumName, DEFAULT_WEATHER);
    }

    private Run(Run run) {
        this.numberOfRunners = run.getNumberOfRunners();
        this.stadiumName = run.getStadiumName();
        this.weather = run.getWeather();
    }

    private int getNumberOfRunners() {
        return this.numberOfRunners;
    }

    private String getStadiumName() {
        return this.stadiumName;
    }

    private double getWeather() {
        return this.weather;
    }

    public static void main(String[] args) {

        Run run1 = new Run(5, "Dinamo", 15);
        Run run2 = new Run(4, "Luzhniki");

        System.out.println("Количество бегунов - " + run1.getNumberOfRunners());
        System.out.println("Погода - " + run1.getWeather());

        System.out.println("Количество бегунов - " + run2.getNumberOfRunners());
        System.out.println("Погода - " + run2.getWeather());

        Run run3 = new Run(run1);
        System.out.println("Количество бегунов - " + run3.getNumberOfRunners());
        System.out.println("Погода - " + run3.getWeather());

    }
}
