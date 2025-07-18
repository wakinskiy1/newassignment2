package com.example.adsassignment2;

public class MyStack<E> {
    private final MyArrayList<E> storage = new MyArrayList<>();

    public void push(E element) {
        storage.add(element);
    }

    public E pop() {
        if (storage.isEmpty()) throw new IllegalStateException();
        return storage.remove(storage.size() - 1);
    }

    public E peek() {
        if (storage.isEmpty()) throw new IllegalStateException();
        return storage.get(storage.size() - 1);
    }

    public boolean isEmpty() {
        return storage.isEmpty();
    }

    public int size() {
        return storage.size();
    }
}
