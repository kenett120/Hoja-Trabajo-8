package org.example;

import java.util.ArrayList;

/**
 * Implementación de una cola de prioridad utilizando un heap mínimo (Min-Heap).
 *
 * Esta estructura permite insertar elementos y siempre mantener el elemento
 * de mayor prioridad en la raíz del heap (posición 0 del arreglo).
 *
 * Los elementos deben implementar Comparable para poder determinar su orden.
 *
 * @param <E> tipo de dato que extiende Comparable
 *
 * Autor: Kenett Ortega
 * Carnet: 25777
 * Universidad del Valle de Guatemala
 */
public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E> {

    private ArrayList<E> data;

    /**
     * Constructor que inicializa la estructura interna del heap.
     */
    public VectorHeap() {
        data = new ArrayList<>();
    }

    /**
     * Inserta un elemento en la cola de prioridad.
     *
     * @param value elemento a insertar
     */
    @Override
    public void add(E value) {
        data.add(value);
        percolateUp(data.size() - 1);
    }

    /**
     * Elimina y retorna el elemento con mayor prioridad (mínimo).
     *
     * @return elemento de mayor prioridad o null si está vacío
     */
    @Override
    public E remove() {
        if (isEmpty()) return null;

        E min = data.get(0);
        E last = data.remove(data.size() - 1);

        if (!data.isEmpty()) {
            data.set(0, last);
            percolateDown(0);
        }

        return min;
    }

    /**
     * Retorna el elemento con mayor prioridad sin eliminarlo.
     *
     * @return elemento de mayor prioridad o null si está vacío
     */
    @Override
    public E peek() {
        if (isEmpty()) return null;
        return data.get(0);
    }

    /**
     * Retorna la cantidad de elementos en la cola.
     *
     * @return tamaño de la cola
     */
    @Override
    public int size() {
        return data.size();
    }

    /**
     * Indica si la cola está vacía.
     *
     * @return true si está vacía, false en caso contrario
     */
    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * Ajusta la posición de un elemento hacia arriba en el heap
     * para mantener la propiedad de heap.
     *
     * @param index posición del elemento a ajustar
     */
    private void percolateUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;

            if (data.get(index).compareTo(data.get(parent)) < 0) {
                swap(index, parent);
                index = parent;
            } else {
                break;
            }
        }
    }

    /**
     * Ajusta la posición de un elemento hacia abajo en el heap
     * para mantener la propiedad de heap.
     *
     * @param index posición del elemento a ajustar
     */
    private void percolateDown(int index) {
        int left, right, smallest;

        while (true) {
            left = 2 * index + 1;
            right = 2 * index + 2;
            smallest = index;

            if (left < data.size() &&
                data.get(left).compareTo(data.get(smallest)) < 0) {
                smallest = left;
            }

            if (right < data.size() &&
                data.get(right).compareTo(data.get(smallest)) < 0) {
                smallest = right;
            }

            if (smallest != index) {
                swap(index, smallest);
                index = smallest;
            } else {
                break;
            }
        }
    }

    /**
     * Intercambia dos elementos dentro del arreglo interno del heap.
     *
     * @param i índice del primer elemento
     * @param j índice del segundo elemento
     */
    private void swap(int i, int j) {
        E temp = data.get(i);
        data.set(i, data.get(j));
        data.set(j, temp);
    }
}