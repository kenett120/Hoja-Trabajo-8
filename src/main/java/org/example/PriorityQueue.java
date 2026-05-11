package org.example;

/**
 * Interfaz que define el comportamiento de una cola de prioridad.
 *
 * Una cola de prioridad es una estructura de datos en la cual los elementos
 * se procesan según su prioridad, en lugar de su orden de inserción.
 * El elemento con mayor prioridad es el primero en ser atendido.
 *
 * Los elementos deben implementar la interfaz Comparable para poder
 * determinar su orden dentro de la cola.
 *
 * @param <E> tipo de elemento que extiende Comparable
 *
 * Autor: Kenett Ortega
 * Carnet: 25777
 * Universidad del Valle de Guatemala
 */
public interface PriorityQueue<E extends Comparable<E>> {

    /**
     * Inserta un elemento en la cola de prioridad.
     *
     * @param value elemento a insertar
     */
    void add(E value);

    /**
     * Elimina y retorna el elemento con mayor prioridad.
     *
     * @return elemento con mayor prioridad, o null si la cola está vacía
     */
    E remove();

    /**
     * Retorna el elemento con mayor prioridad sin eliminarlo.
     *
     * @return elemento con mayor prioridad, o null si la cola está vacía
     */
    E peek();

    /**
     * Retorna la cantidad de elementos en la cola.
     *
     * @return número de elementos
     */
    int size();

    /**
     * Indica si la cola de prioridad está vacía.
     *
     * @return true si está vacía, false en caso contrario
     */
    boolean isEmpty();
}