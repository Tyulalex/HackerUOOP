package com.company.factory;

public class Manager extends Staff {

    private String name;

    public Manager(String name) {
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
}
