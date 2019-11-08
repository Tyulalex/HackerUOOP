package com.company.advanced_with_java.homework1.lists;

import java.util.NoSuchElementException;

/**
 * boolean add(E e) - Вставляет указанный элемент в очередь
 * E poll() – возвращает и удаляет элемент из очереди
 * E peek() - возвращает элемент из очереди
 * void clear() - Удаляет все элементы из этой очереди
 * boolean contains(Object element) - возвращает true, если эта очередь содержит указанный элемент
 * boolean isEmpty()  - возвращает true, если эта очередь не содержит элементов
 */


public class ArrayQueue<E> {

    private E[] array;
    private int frontIndex;
    private int rearIndex;
    private int size;
    private int maxSize;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.array = (E[]) new Object[maxSize];
        this.size = 0;
        this.frontIndex = 0;
        this.rearIndex = -1;
    }

    //вставлять в конец очереди
    boolean add(E e) {
        if (this.rearIndex == this.maxSize) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.array[++rearIndex] = e;
        this.size++;
        return true;
    }

    E poll() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        E temp = this.array[frontIndex++];
        this.size--;
        return temp;
    }

    E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return this.array[frontIndex];
    }

    void clear() {
        this.frontIndex = 0;
        this.rearIndex = -1;
        this.size = 0;
    }

    boolean isEmpty() {
        return this.size == 0;
    }

    boolean contains(Object element) {
        if (isEmpty()) {
            return false;
        }
        for (int i = frontIndex; i <= rearIndex; i++) {
            if (this.array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
    }
}
