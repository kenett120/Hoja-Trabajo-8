import org.example.VectorHeap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase VectorHeap.
 *
 * Verifica el correcto funcionamiento de las operaciones principales:
 * inserción, eliminación, consulta y estado de la cola.
 *
 * Autor: Kenett Ortega
 * Carnet: 25777
 * Universidad del Valle de Guatemala
 */
public class VectorHeapTest {

    /**
     * Prueba que los elementos se inserten y se eliminen
     * en el orden correcto según la prioridad (heap mínimo).
     */
    @Test
    void testAddAndRemove() {
        VectorHeap<Integer> heap = new VectorHeap<>();

        heap.add(5);
        heap.add(3);
        heap.add(8);

        assertEquals(3, heap.remove());
        assertEquals(5, heap.remove());
        assertEquals(8, heap.remove());
    }

    /**
     * Prueba que peek retorne el elemento mínimo sin eliminarlo.
     */
    @Test
    void testPeek() {
        VectorHeap<Integer> heap = new VectorHeap<>();

        heap.add(10);
        heap.add(2);

        assertEquals(2, heap.peek());
        assertEquals(2, heap.peek()); // sigue siendo el mismo
    }

    /**
     * Prueba que size e isEmpty funcionen correctamente.
     */
    @Test
    void testSizeAndIsEmpty() {
        VectorHeap<Integer> heap = new VectorHeap<>();

        assertTrue(heap.isEmpty());

        heap.add(1);
        heap.add(2);

        assertEquals(2, heap.size());
        assertFalse(heap.isEmpty());
    }

    /**
     * Prueba comportamiento cuando se remueve de un heap vacío.
     */
    @Test
    void testRemoveEmpty() {
        VectorHeap<Integer> heap = new VectorHeap<>();

        assertNull(heap.remove());
    }

    /**
     * Prueba comportamiento cuando se hace peek en un heap vacío.
     */
    @Test
    void testPeekEmpty() {
        VectorHeap<Integer> heap = new VectorHeap<>();

        assertNull(heap.peek());
    }
}