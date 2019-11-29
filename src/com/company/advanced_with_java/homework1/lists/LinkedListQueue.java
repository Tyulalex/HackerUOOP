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


public class LinkedListQueue<E> {


    private Link first;

    class Link {
        E value;
        Link next;

        Link(E item) {
            this.value = item;
        }
    }

    boolean isEmpty() {
        return this.first == null;
    }

    boolean add(E e) {
        if (isEmpty()) {
            this.first = new Link(e);
            return true;
        }
        Link current = this.first;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Link(e);
        return true;
    }

    E peek() {
        return this.first.value;
    }

    E poll() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        E currentTop = this.first.value;
        this.first = this.first.next;
        return currentTop;
    }

    boolean contains(Object element) {
        if (isEmpty()) {
            return false;
        }
        Link current = this.first;
        while (current != null) {
            if (current.value.equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    void clear() {
        this.first = null;
    }

}
