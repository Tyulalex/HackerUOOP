package com.company.inheritance.grandfather;

public class Son extends Grandfather{

    Father father;
    Mother mother;

    public Son(Father father, Mother mother) {
        this.mother = mother;
        this.father = father;
    }

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }

    public Mother getMother() {
        return mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }

    void learnJava(){
        System.out.println("learn java");
    }
}
