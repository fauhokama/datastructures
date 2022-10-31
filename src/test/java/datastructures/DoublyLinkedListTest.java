package datastructures;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DoublyLinkedListTest {
    @Test
    public void testInsertAtHead() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.insertAtHead(2);

        assertEquals(2, dll.getHead());
        assertEquals(1, dll.getTail());
        assertArrayEquals(null, new int[] { 2, 1 }, dll.getAsArray());

        dll.insertAtHead(3);

        assertEquals(3, dll.getHead());
        assertEquals(1, dll.getTail());
        assertArrayEquals(null, new int[] { 3, 2, 1 }, dll.getAsArray());
    }

    @Test
    public void testInsertAtTail() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.insertAtTail(2);

        assertEquals(1, dll.getHead());
        assertEquals(2, dll.getTail());
        assertArrayEquals(null, new int[] { 1, 2 }, dll.getAsArray());

        dll.insertAtTail(3);

        assertEquals(1, dll.getHead());
        assertEquals(3, dll.getTail());
        assertArrayEquals(null, new int[] { 1, 2, 3 }, dll.getAsArray());
    }

    @Test
    public void testRemoveAtHead() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.insertAtTail(2);
        dll.insertAtTail(3);

        dll.removeAtHead();

        assertEquals(2, dll.getHead());
        assertEquals(3, dll.getTail());
        assertArrayEquals(null, new int[] { 2, 3 }, dll.getAsArray());

        dll.removeAtHead();

        assertEquals(3, dll.getHead());
        assertEquals(3, dll.getTail());
        assertArrayEquals(null, new int[] { 3 }, dll.getAsArray());
    }

    @Test
    public void testRemoveAtTail() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.insertAtTail(2);
        dll.insertAtTail(3);

        dll.removeAtTail();

        assertEquals(1, dll.getHead());
        assertEquals(2, dll.getTail());
        assertArrayEquals(null, new int[] { 1, 2 }, dll.getAsArray());

        dll.removeAtTail();
        assertEquals(1, dll.getHead());
        assertEquals(1, dll.getTail());
        assertArrayEquals(null, new int[] { 1 }, dll.getAsArray());
    }

    @Test
    public void testRemoveAtIndex() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.insertAtTail(2);
        dll.insertAtTail(3);
        dll.insertAtTail(4);
        dll.insertAtTail(5);

        dll.removeAtIndex(0);

        assertEquals(2, dll.getHead());
        assertEquals(5, dll.getTail());
        assertArrayEquals(null, new int[] { 2, 3, 4, 5 }, dll.getAsArray());

        dll.removeAtIndex(3);

        assertEquals(2, dll.getHead());
        assertEquals(4, dll.getTail());
        assertArrayEquals(null, new int[] { 2, 3, 4 }, dll.getAsArray());

        dll.removeAtIndex(1);

        assertEquals(2, dll.getHead());
        assertEquals(4, dll.getTail());
        assertArrayEquals(null, new int[] { 2, 4 }, dll.getAsArray());
    }

    @Test(expected = Error.class)
    public void testRemoveAtIndexOutOfBounds() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.removeAtIndex(1);
    }
}
