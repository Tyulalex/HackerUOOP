package com.company.inheritance.grandfather;



public class Daughter extends Grandfather{

    Father father;
    Mother mother;

    public Daughter(Father father, Mother mother) {
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

    void learnJavaAndSql() {
        System.out.println("learn java and sql");
    }
}
