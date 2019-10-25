package com.company.introduction_to_oop.factory;

public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory(new Machine("Machine"));
        System.out.println(factory.toString());
        Worker[] workers = new Worker[]{new Worker("Worker1"), new Worker("Worker2")};
        Manager manager = new Manager("Manager1");
        factory.hireStaff(workers, manager);
        System.out.println(factory.toString());
        factory.fireStaff(workers, manager);
        System.out.println(factory.toString());
    }
}
