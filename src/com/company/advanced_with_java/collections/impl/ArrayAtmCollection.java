package com.company.advanced_with_java.collections.impl;

import com.company.advanced_with_java.collections.AtmCollection;


public class ArrayAtmCollection<E> implements AtmCollection<E> {

    E[] list;
    int count;

    public ArrayAtmCollection(int capacity){
        if (capacity < 1) {
            throw new RuntimeException("negative or empty capacity");
        }
        list = (E[]) new Object[capacity];
    }

    public ArrayAtmCollection() {
        this(10);
    }

    @Override
    public void add(E item) {
        if (count == list.length) {
            expand();
        }
        list[count] = item;
        count++;
    }


    private void expand() {
        E[] tmp = (E[]) new Object[count * 2 + 1];
        System.arraycopy(list, 0, tmp, 0, count);
        this.list = tmp;
    }

    @Override
    public void remove(E item) {
        int indx = 1;
        if (item != null) {
            for (E acc : list) {
                if (item.equals(acc)) {
                    System.arraycopy(list, indx, list, indx - 1, list.length - indx);
                    count--;
                }
                indx++;
            }
        }
    }

    @Override
    public int size() {
        return count;
    }

    private void checkIndex(int index) {
        if (index > this.count || index < 0) {
            throw new RuntimeException("index out of range");
        }
    }

    public E get(int index) {
        checkIndex(index);
        return list[index];
    }
}
