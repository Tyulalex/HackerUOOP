package com.company.advanced_with_java.homework1.lists;

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
    private Link next;
    private int size;

    LinkedList() {

    }

    class Link<E> {
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

    boolean isEmpty(){
        return this.first == null;
    }

    E remove(int indx) {
        if (indx<0){

        }
    }
}
