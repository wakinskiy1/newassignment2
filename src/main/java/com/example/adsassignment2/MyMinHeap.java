package com.example.adsassignment2;

public class MyMinHeap<E extends Comparable<E>> {
    private final MyArrayList<E> data = new MyArrayList<>();

    public void add(E element) {
        data.add(element);
        siftUp(data.size() - 1);
    }

    public E peek() {
        if (data.isEmpty()) throw new IllegalStateException();
        return data.get(0);
    }

    public E remove() {
        if (data.isEmpty()) throw new IllegalStateException();
        E min = data.get(0);
        int last = data.size() - 1;
        E tail = data.remove(last);
        if (last > 0) {
            data.set(0, tail);
            siftDown(0);
        }
        return min;
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public int size() {
        return data.size();
    }

    private void siftUp(int idx) {
        while (idx > 0) {
            int parent = (idx - 1) / 2;
            if (data.get(idx).compareTo(data.get(parent)) < 0) {
                E tmp = data.get(idx);
                data.set(idx, data.get(parent));
                data.set(parent, tmp);
                idx = parent;
            } else break;
        }
    }

    private void siftDown(int idx) {
        int n = data.size();
        while (true) {
            int left = 2 * idx + 1, right = 2 * idx + 2, smallest = idx;
            if (left < n && data.get(left).compareTo(data.get(smallest)) < 0) smallest = left;
            if (right < n && data.get(right).compareTo(data.get(smallest)) < 0) smallest = right;
            if (smallest != idx) {
                E tmp = data.get(idx);
                data.set(idx, data.get(smallest));
                data.set(smallest, tmp);
                idx = smallest;
            } else break;
        }
    }
}
