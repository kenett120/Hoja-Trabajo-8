package org.example;

public interface PriorityQueue<E extends Comparable<E>> {

    void add(E value);

    E remove();

    E peek();

    int size();

    boolean isEmpty();
}