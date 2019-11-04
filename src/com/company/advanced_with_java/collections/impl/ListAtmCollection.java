package com.company.advanced_with_java.collections.impl;

import java.util.NoSuchElementException;

public class ListAtmCollection {

    IntegerNode head;
    IntegerNode tail;

    public ListAtmCollection() {

    }

    public void push(Integer item) {
        if (head == null) {
            head = new IntegerNode();
            head.value = item;
        } else {
            IntegerNode tmp = head;
            head = new IntegerNode();
            head.value = item;
            head.next = tmp;
        }
    }

    public void append(Integer item) {
        if (head == null) {
            head = new IntegerNode();
            head.value = item;
        } else {
            IntegerNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new IntegerNode();
            current.next.value = item;

        }
    }

    class IntegerNode {
        Integer value;
        IntegerNode next;
    }

    public Integer pop() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        IntegerNode tmp = head;
        head = head.next;
        return tmp.value;
    }

    public boolean remove(Integer item) {
        if (head == null)
            return false;
        if (head.value.equals(item)) {
            head = head.next;
            return true;
        }
        IntegerNode current = head;
        IntegerNode previous = head;
        while (current != null) {
            if (current.value.equals(item)) {
                previous.next = current.next;
                return true;
            }
            previous = current;
            current = current.next;


        }
        return false;
    }
}
