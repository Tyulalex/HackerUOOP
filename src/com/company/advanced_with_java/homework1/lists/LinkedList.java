package com.company.advanced_with_java.homework1.lists;

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

public class LinkedList<E> {

    private Link first;
    private int size;

    LinkedList() {

    }

    class Link {
        E value;
        Link next;

        Link(E item) {
            this.value = item;
        }
    }

    boolean add(E item) {
        if (this.isEmpty()) {
            this.first = new Link(item);
        } else {
            Link current = this.first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Link(item);
            this.size++;
        }
        return true;
    }

    void clear() {
        this.first = null;
    }

    boolean contains(Object element) {
        if (this.isEmpty()) {
            return false;
        } else {
            Link current = this.first;
            while (current.next != null) {
                if (current.value.equals(element)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean isEmpty() {
        return this.first == null;
    }

    E remove(int indx) {
        if (indx < 0 || indx >= this.size || this.isEmpty()) {
            throw new NoSuchElementException();
        }
        if (indx == 0) {
            return removeFirstElement();
        }
        int i = 0;
        Link current = this.first;
        Link previous = null;
        while (i != indx) {
            previous = current;
            current = current.next;
            i++;
            if (i >= this.size) {
                throw new NoSuchElementException();
            }
        }
        Link itemToRemove = current;
        previous.next = current.next;
        this.size--;
        return (E) itemToRemove.value;
    }

    private E removeFirstElement() {
        Link itemToRemove = this.first;
        this.first = this.first.next;
        this.size--;
        return itemToRemove.value;
    }


    E remove(E element) {
        if (this.first == null)
            throw new NoSuchElementException();
        if (this.first.value.equals(element)) {
            return removeFirstElement();
        }
        Link current = this.first;
        Link previous = this.first;
        while (current != null) {
            if (current.value.equals(element)) {
                Link itemToRemove = this.first;
                previous.next = current.next;
                this.size--;
                return (E) itemToRemove.value;
            }
            previous = current;
            current = current.next;
        }
        throw new NoSuchElementException();
    }

    Object[] toArray() {
        Object[] array = new Object[this.size];
        Link current = this.first;
        for (int i = 0; i < this.size; i++) {
            array[i] = current;
            current = current.next;
        }

        return array;
    }
}
