package com.company;


public class ArrTest {

    public static Comparable[] list = new Comparable[2];

    public static void main(String[] args) {
        System.out.println(list.length);
    }

    public static <T> void swap(T[] arr, int first, int second) {
        T tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;
    }

    interface Comparable<T> {

        int compare(T obj);

    }

    class People implements Comparable<People> {
        private int age;
        private String name;


        @Override
        public int compare(People item) {
            return Double.compare(this.age, item.age);
        }
    }

    class Animal implements Comparable<Animal> {
        private String name;
        private double weight;

        @Override
        public int compare(Animal item) {
            return Double.compare(this.weight, item.weight);
        }
    }

    /**
     * если первый больше второго то 1
     * если равны - то 0
     * если первый меньше второго -1
     */

    public static <T extends Comparable<T>, V extends T> int compare(T[] arr, int firstIndex, int secondIndex) {
        return 0;
    }
}
