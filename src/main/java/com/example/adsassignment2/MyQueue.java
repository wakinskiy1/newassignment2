package com.example.adsassignment2;

public class MyQueue<E> {
    private final MyLinkedList<E> storage = new MyLinkedList<>();

    public void enqueue(E element) {
        storage.add(element);
    }

    public E dequeue() {
        if (storage.isEmpty()) throw new IllegalStateException();
        return storage.remove(0);
    }

    public E peek() {
        if (storage.isEmpty()) throw new IllegalStateException();
        return storage.get(0);
    }

    public boolean isEmpty() {
        return storage.isEmpty();
    }

    public int size() {
        return storage.size();
    }
}
