package com.example.adsassignment2;

import java.util.Iterator;

public interface MyList<E> extends Iterable<E> {
    void add(E element);
    E get(int index);
    E remove(int index);
    int size();
    boolean isEmpty();
    Iterator<E> iterator();
}


