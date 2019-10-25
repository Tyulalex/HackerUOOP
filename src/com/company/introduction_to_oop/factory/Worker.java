package com.company.introduction_to_oop.factory;

import java.util.Objects;

public class Worker extends Staff {


    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    Staff hire() {
        System.out.println("Сотрудник " + this.getName() + " нанят");
        return this;
    }

    @Override
    void fire() {
        System.out.println("Сотрудник " + this.getName() + " уволен");
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(name, worker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
