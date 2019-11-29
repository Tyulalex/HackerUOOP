package com.company.advanced_with_java.homework1.lists;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * boolean add(E item) - Добавляет указанный элемент в конец этого списка
 * void clear() - Удаляет все элементы из этого списка (необязательная операция)
 * boolean contains(Object element) - Возвращает true, если этот список содержит указанный элемент
 * boolean isEmpty() - Возвращает true, если этот список не содержит элементов
 * E remove(int indx) – Удаляет элемент в указанной позиции в этом списке (необязательная операция)
 * E remove(E element) - Удаляет первое вхождение указанного элемента из этого списка, если он присутствует (необязательная операция)
 * Object[] toArray() - Возвращает массив, содержащий все элементы в этом списке в правильной последовательности (от первого до последнего элемента).
 */
public class ArrayList<E> {

    private E[] array;
    private int size;

    public ArrayList(int capacity) {
        this.array = (E[]) new Object[capacity];
    }

    boolean add(E item) {
        if (this.size == this.array.length) {
            this.array = (E[]) grow();
        }
        this.array[size++] = item;
        return true;
    }

    private E[] grow() {
        return Arrays.copyOf(this.array, this.array.length * 2 + 1);
    }

    void clear() {
        this.array = (E[]) new Object[this.size];
        this.size = 0;
    }

    boolean isEmpty() {
        return this.size == 0;
    }

    boolean contains(Object element) {
        if (isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.size; i++) {
            if (this.array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    E remove(int indx) {
        checkIndex(indx);
        E oldElement = this.array[indx];
        final int newSize;
        newSize = this.size - 1;
        if (newSize > indx) {
            System.arraycopy(this.array, indx + 1, this.array, indx, newSize - indx);
        }
        this.size = newSize;
        this.array[this.size] = null;
        return oldElement;
    }

    E remove(E element) {
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] == element) {
                return remove(i);
            }
        }
        throw new NoSuchElementException();
    }

    void checkIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    Object[] toArray() {
        return Arrays.copyOf(this.array, this.size);
    }

}
