import org.example.VectorHeap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VectorHeapTest {

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

    @Test
    void testPeek() {
        VectorHeap<Integer> heap = new VectorHeap<>();

        heap.add(10);
        heap.add(2);

        assertEquals(2, heap.peek());
    }
}
