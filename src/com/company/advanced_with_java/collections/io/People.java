package com.company.advanced_with_java.collections.io;

import java.io.Serializable;

public class People implements Serializable {

    //private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private String gender;
    private boolean alive;
    private transient Salary salary;

    public People(String name, int age, String gender, boolean alive,
                  Salary salary){
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.alive = alive;
        this.salary = salary;
    }

    public Salary getSalary(){
        return this.salary;
    }

    public void setSalary(Salary salary){
        this.salary = salary;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return this.gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", alive=" + alive +
                ", salary=" + salary +
                '}';
    }
}

class Salary{
    private int amount;
    private String currency;

    public Salary(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}