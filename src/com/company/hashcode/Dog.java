package com.company.hashcode;

public class Dog {

    String name;
    int age;
    int weight;

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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Dog(int age, int weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return this.age == dog.age &&
                this.weight == dog.weight;
    }

    @Override
    public int hashCode() {
        int result = 31;
        return result * result + this.age * result + this.weight * result * 2;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog(3, 5, "Belka");
        Dog dog2 = new Dog(3, 3, "Strelka");
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.hashCode());
        System.out.println(dog2.hashCode());

        Dog dog3 = new Dog(5, 7, "Tusya");
        System.out.println(dog3.hashCode());
    }
}
