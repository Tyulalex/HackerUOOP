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

public class LinkedListStack<E> {

    private Link top;

    class Link {
        E value;
        Link next;

        Link(E item) {
            this.value = item;
        }
    }

    boolean isEmpty() {
        return this.top == null;
    }

    void clear() {
        this.top = null;
    }

    boolean push(E e) {
        if (top == null) {
            this.top = new Link(e);
            return true;
        }
        Link previousTop = this.top;
        this.top = new Link(e);
        this.top.next = previousTop;
        return true;
    }

    E peek() {
        return this.top.value;
    }

    E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        E currentTop = this.top.value;
        this.top = this.top.next;
        return currentTop;
    }

    boolean contains(Object element){
        if (isEmpty()) {
            return false;
        }
        Link current = this.top;
        while (current != null) {
            if (current.value.equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

}
