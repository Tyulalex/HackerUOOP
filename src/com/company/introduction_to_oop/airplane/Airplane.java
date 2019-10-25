package com.company.introduction_to_oop.airplane;

import java.util.Objects;

public class Airplane {

    int seatingCapacity;
    int fightRange;
    String company;

    public Airplane(int seatingCapacity, int fightRange, String company) {
        this.seatingCapacity = seatingCapacity;
        this.fightRange = fightRange;
        this.company = company;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public int getFightRange() {
        return fightRange;
    }

    public void setFightRange(int fightRange) {
        this.fightRange = fightRange;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airplane airplane = (Airplane) o;

        return ((Math.abs(this.seatingCapacity - airplane.seatingCapacity) <= 10) && (Math.abs((this.fightRange - airplane.fightRange)) <= 20));
    }

    @Override
    public int hashCode() {
        return Objects.hash(seatingCapacity, fightRange);
    }

    public static void main(String[] args) {
        Airplane airplaneS7 = new Airplane(250, 30, "S7");
        Airplane airplaneUral = new Airplane(250, 30, "UralAirlines");
        System.out.println(airplaneS7.equals(airplaneUral));
        Airplane airplaneS71 = new Airplane(240, 30, "S7");
        Airplane airplaneUral2 = new Airplane(250, 20, "UralAirlines");
        System.out.println(airplaneS71.equals(airplaneUral2));
        Airplane airplaneS72 = new Airplane(239, 30, "S7");
        Airplane airplaneUral3 = new Airplane(250, 19, "UralAirlines");
        System.out.println(airplaneS72.equals(airplaneUral3));
    }
}
