package com.example.adsassignment2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements MyList<E> {
    private class Node {
        E value;
        Node prev, next;
        Node(E v) { value = v; }
    }

    private Node head, tail;
    private int size;

    public MyLinkedList() {
        head = tail = null;
        size = 0;
    }

    @Override
    public void add(E element) {
        Node node = new Node(element);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        Node cur = head;
        for (int i = 0; i < index; i++) cur = cur.next;
        return cur.value;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        Node cur = head;
        for (int i = 0; i < index; i++) cur = cur.next;
        if (cur.prev != null) cur.prev.next = cur.next;
        else head = cur.next;
        if (cur.next != null) cur.next.prev = cur.prev;
        else tail = cur.prev;
        size--;
        return cur.value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node cur = head;
            @Override public boolean hasNext() {
                return cur != null;
            }
            @Override public E next() {
                if (cur == null) throw new NoSuchElementException();
                E v = cur.value;
                cur = cur.next;
                return v;
            }
        };
    }
}
