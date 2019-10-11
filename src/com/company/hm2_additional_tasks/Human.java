package com.company.hm2_additional_tasks;

public class Human {

    private static final String TO_STRING_BASE_MESSAGE = "Имя: %s, пол: %s, возраст: %s";
    private static final String TO_STRING_IF_PARENT_NOT_NULL_MESSAGE = " отец: %s, мать: %s";

    private String name;
    private String gender;
    private int age;
    Human father;
    Human mother;

    public Human(String name, String gender, int age, Human father, Human mother) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    @Override
    public String toString() {
        String base_message = String.format(TO_STRING_BASE_MESSAGE, this.getName(), this.getGender(), this.getAge());
        return (this.getFather() == null && this.getMother() == null)
                ? base_message
                : base_message + String.format(
                TO_STRING_IF_PARENT_NOT_NULL_MESSAGE, this.getFather().getName(), this.getMother().getName());
    }


    public static void main(String[] args) {
        Human grandfather1 = new Human("Трифон", "мужской", 88);
        Human grandfather2 = new Human("Егнат", "мужской", 87);
        Human grandmother1 = new Human("Дуся", "женский", 86);
        Human grandmother2 = new Human("Муся", "женский", 85);

        Human father = new Human("Антон", "мужской", 40, grandfather1, grandmother1);
        Human mother = new Human("Лена", "женский", 38, grandfather2, grandmother2);

        Human kid1 = new Human("Вика", "женский", 15, father, mother);
        Human kid2 = new Human("Наташа", "женский", 14, father, mother);
        Human kid3 = new Human("Костя", "мужской", 10, father, mother);

        System.out.println(grandfather1);
        System.out.println(grandmother1);
        System.out.println(grandfather2);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);


    }
}
