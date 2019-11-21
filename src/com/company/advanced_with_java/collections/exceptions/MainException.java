package com.company.advanced_with_java.collections.exceptions;

import java.io.IOException;

public class MainException {

    public static void main(String[] args) {

        People people = null;

        try {
            people = new People(12, "Bob", "g");
        } catch (PeopleException|PeopleNullPointerException ex){
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("qwerty");
           // people = new People(5, "g", "d");
        }

       // people.printInfo();

    }
}

final class People {

    private final int age;
    private final String name;
    private final String gender;

    public People(int age, String name, String gender) throws PeopleException, PeopleNullPointerException {
        this.age = age;
        this.name = name;
        if (gender == null) {
            throw new PeopleNullPointerException("Gender is null");
        }
        if(!gender.equals("m") && !gender.equals("w")){
            throw new PeopleException("Gender not found");
        }
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void printInfo() throws IOException {
        //todo
    }
}

class PeopleException extends Exception {

    public PeopleException(){
        super();
    }

    public PeopleException(String message){
        super(message);
    }
}

class PeopleNullPointerException extends Exception {
    public PeopleNullPointerException(){
        super();
    }

    public PeopleNullPointerException(String message){
        super(message);
    }
}

