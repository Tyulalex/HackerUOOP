package com.company.advanced_with_java.homework1.lists;

import java.util.NoSuchElementException;

/**
 * Для стека реализовать методы:
 * boolean push(E e) - Вставляет указанный элемент в стек
 * E pop() – возвращает и удаляет элемент из стека
 * E peek() - возвращает элемент из стека
 * void clear() - удаляет все элементы из стека
 * boolean contains(Object element) - возвращает true, если этот стек содержит указанный элемент
 * boolean isEmpty()  - Возвращает true, если этот стек не содержит элементов
 */
public class ArrayStack<E> {

    private E[] array;
    private int topIndex;
    private int maxSize;


    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        this.array = (E[]) new Object[this.maxSize];
        this.topIndex = -1;
    }

    boolean push(E e) {
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException("Stack is full");
        }
        this.array[++topIndex] = e;
        return true;
    }

    E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return this.array[topIndex--];
    }

    E peek() {
        return this.array[topIndex];
    }

    void clear() {
        this.topIndex = -1;
    }

    boolean contains(Object element) {
        if (isEmpty()) {
            return false;
        }
        for (int i = 0; i <= topIndex; i++) {
            if (this.array[i].equals(element))
                return true;
        }
        return false;
    }

    boolean isEmpty() {
        return this.topIndex == -1;
    }

    private boolean isFull() {
        return this.topIndex == maxSize - 1;
    }


}
