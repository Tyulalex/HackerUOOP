package com.company;

import java.util.Arrays;

public class DequeDemo {

    public static void main(String[] args) {
        /*Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("q");
        System.out.println(deque.getLast());
        System.out.println(deque);
*/

        String[] arr = {"1", "2", "3"};

        String[] newArr = Arrays.copyOf(arr, arr.length + 1);
        System.out.println(Arrays.toString(newArr));
        System.arraycopy(newArr, 0, newArr, 1, arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));


        String[] rere = new String[0];
        System.out.println(rere.length);
    }
}
