import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testAddNode() {
        LinkedList list = new LinkedList();
        list.addNode(5);
        list.addNode(10);
        list.addNode(15);
        assertEquals(3, list.size());
    }

   /* @Test
    public void testRemoveNode() {
        LinkedList list = new LinkedList();
        list.addNode(5);
        list.addNode(10);
        list.addNode(15);
        list.removeNode(10);
        assertEquals(2, list.size());
        assertEquals(5, list.getHead().data);
        assertEquals(15, list.getTail().data);
    }

    @Test
    public void testGetNode() {
        LinkedList list = new LinkedList();
        list.addNode(5);
        list.addNode(10);
        list.addNode(15);
        Node node = list.getNode(10);
        assertNotNull(node);
        assertEquals(10, node.data);
    }

    @Test
    public void testIsEmpty() {
        LinkedList list = new LinkedList();
        assertTrue(list.isEmpty());
        list.addNode(5);
        assertFalse(list.isEmpty());
    }
    @Test
    public void testAddNodeToEmptyList() {
        LinkedList list = new LinkedList();
        list.addNode(5);
        assertEquals(1, list.size());
        assertEquals(5, list.getHead().data);
        assertEquals(5, list.getTail().data);
    }

    @Test
    public void testAddNodeToNonEmptyList() {
        LinkedList list = new LinkedList();
        list.addNode(5);
        list.addNode(10);
        list.addNode(15);
        list.addNode(20);
        assertEquals(4, list.size());
        assertEquals(5, list.getHead().data);
        assertEquals(20, list.getTail().data);
    }

    @Test
    public void testAddNodeAtIndex() {
        LinkedList list = new LinkedList();
        list.addNode(5);
        list.addNode(10);
        list.addNode(20);
        list.addNodeAtIndex(15, 2);
        assertEquals(4, list.size());
        assertEquals(5, list.getHead().data);
        assertEquals(20, list.getTail().data);
        assertEquals(15, list.getNode(2).data);
    }

    @Test
    public void testAddNodeAtIndexToEmptyList() {
        LinkedList list = new LinkedList();
        list.addNodeAtIndex(5, 0);
        assertEquals(1, list.size());
        assertEquals(5, list.getHead().data);
        assertEquals(5, list.getTail().data);
    }

    @Test
    public void testAddNodeAtInvalidIndex() {
        LinkedList list = new LinkedList();
        list.addNode(5);
        list.addNode(10);
        assertFalse(list.addNodeAtIndex(15, 5));
        assertEquals(2, list.size());
    }

    @Test
    public void testRemoveNodeFromEmptyList() {
        LinkedList list = new LinkedList();
        assertFalse(list.removeNode(5));
        assertEquals(0, list.size());
        assertNull(list.getHead());
        assertNull(list.getTail());
    }

    @Test
    public void testRemoveNodeFromNonEmptyList() {
        LinkedList list = new LinkedList();
        list.addNode(5);
        list.addNode(10);
        list.addNode(15);
        list.addNode(20);
        assertTrue(list.removeNode(15));
        assertEquals(3, list.size());
        assertEquals(5, list.getHead().data);
        assertEquals(20, list.getTail().data);
    }

    @Test
    public void testRemoveNonExistingNode() {
        LinkedList list = new LinkedList();
        list.addNode(5);
        list.addNode(10);
        assertFalse(list.removeNode(15));
        assertEquals(2, list.size());
        assertEquals(5, list.getHead().data);
        assertEquals(10, list.getTail().data);
    }

    @Test
    public void testGetNodeFromEmptyList() {
        LinkedList list = new LinkedList();
        assertNull(list.getNode(5));
    }

    @Test
    public void testGetNodeFromNonEmptyList() {
        LinkedList list = new LinkedList();
        list.addNode(5);
        list.addNode(10);
        list.addNode(15);
        assertEquals(10, list.getNode(10).data);
    }

    @Test
    public void testGetNonExistingNode() {
        LinkedList list = new LinkedList();
        list.addNode(5);
        list.addNode(10);
        assertNull(list.getNode(15));
    }

    @Test
    public void testIsEmptyOnEmptyList() {
        LinkedList list = new LinkedList();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testIsEmptyOnNonEmptyList() {
        LinkedList list = new LinkedList();
        list.addNode(5);
        assertFalse(list.isEmpty());
    }

    @Test
    public void testClearList() {
        LinkedList list = new LinkedList();
        list.addNode(5);
        list.addNode(10);
        list.addNode(15);
        list.addNode(20);
        list.clear();
        assertEquals(0, list.size());
        assertNull(list.getHead());
        assertNull(list.getTail());
    }*/
}