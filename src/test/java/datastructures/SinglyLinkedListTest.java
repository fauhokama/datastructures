package datastructures;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SinglyLinkedListTest {

    @Test
    public void testInsertAtHead() {
        SinglyLinkedList sll = new SinglyLinkedList(1);
        sll.insertAtHead(2);

        assertArrayEquals(null, new int[] { 2, 1 }, sll.getAsArray());

        sll.insertAtHead(3);

        assertEquals(3, sll.getHead());
        assertEquals(1, sll.getTail());
        assertArrayEquals(null, new int[] { 3, 2, 1 }, sll.getAsArray());
    }

    @Test
    public void testInsertAtTail() {
        SinglyLinkedList sll = new SinglyLinkedList(1);
        sll.insertAtTail(2);

        assertEquals(1, sll.getHead());
        assertEquals(2, sll.getTail());
        assertArrayEquals(null, new int[] { 1, 2 }, sll.getAsArray());

        sll.insertAtTail(3);

        assertEquals(1, sll.getHead());
        assertEquals(3, sll.getTail());
        assertArrayEquals(null, new int[] { 1, 2, 3 }, sll.getAsArray());
    }

    @Test
    public void testInsertByIndex() {
        SinglyLinkedList sll = new SinglyLinkedList(1);
        sll.insertByIndex(2, 0);

        assertEquals(2, sll.getHead());
        assertEquals(1, sll.getTail());
        assertArrayEquals(null, new int[] { 2, 1 }, sll.getAsArray());

        sll.insertByIndex(3, 1);

        assertEquals(2, sll.getHead());
        assertEquals(1, sll.getTail());
        assertArrayEquals(null, new int[] { 2, 3, 1 }, sll.getAsArray());

        sll.insertByIndex(4, 3);

        assertEquals(2, sll.getHead());
        assertEquals(4, sll.getTail());
        assertArrayEquals(null, new int[] { 2, 3, 1, 4 }, sll.getAsArray());

        sll.insertByIndex(5, 2);

        assertEquals(2, sll.getHead());
        assertEquals(4, sll.getTail());
        assertArrayEquals(null, new int[] { 2, 3, 5, 1, 4 }, sll.getAsArray());
    }

    @Test(expected = Error.class)
    public void testInsertByIndexOutOfBounds() {
        SinglyLinkedList sll = new SinglyLinkedList(1);
        sll.insertByIndex(2, 2);
    }

    @Test
    public void testRemoveAtHead() {
        SinglyLinkedList sll = new SinglyLinkedList(1);
        sll.insertAtTail(2);
        sll.insertAtTail(3);

        sll.removeAtHead();

        assertEquals(2, sll.getHead());
        assertEquals(3, sll.getTail());
        assertArrayEquals(null, new int[] { 2, 3 }, sll.getAsArray());

        sll.removeAtHead();

        assertEquals(3, sll.getHead());
        assertEquals(3, sll.getTail());
        assertArrayEquals(null, new int[] { 3 }, sll.getAsArray());
    }

    @Test
    public void testRemoveAtTail() {
        SinglyLinkedList sll = new SinglyLinkedList(1);
        sll.insertAtTail(2);
        sll.insertAtTail(3);

        sll.removeAtTail();

        assertEquals(1, sll.getHead());
        assertEquals(2, sll.getTail());
        assertArrayEquals(null, new int[] { 1, 2 }, sll.getAsArray());

        sll.removeAtTail();
        assertEquals(1, sll.getHead());
        assertEquals(1, sll.getTail());
        assertArrayEquals(null, new int[] { 1 }, sll.getAsArray());
    }

    @Test
    public void testRemoveAtIndex() {
        SinglyLinkedList sll = new SinglyLinkedList(1);
        sll.insertAtTail(2);
        sll.insertAtTail(3);
        sll.insertAtTail(4);
        sll.insertAtTail(5);

        sll.removeAtIndex(0);

        assertEquals(2, sll.getHead());
        assertEquals(5, sll.getTail());
        assertArrayEquals(null, new int[] { 2, 3, 4, 5 }, sll.getAsArray());

        sll.removeAtIndex(3);

        assertEquals(2, sll.getHead());
        assertEquals(4, sll.getTail());
        assertArrayEquals(null, new int[] { 2, 3, 4 }, sll.getAsArray());

        sll.removeAtIndex(1);

        assertEquals(2, sll.getHead());
        assertEquals(4, sll.getTail());
        assertArrayEquals(null, new int[] { 2, 4 }, sll.getAsArray());
    }

    @Test(expected = Error.class)
    public void testRemoveAtIndexOutOfBounds() {
        SinglyLinkedList sll = new SinglyLinkedList(1);
        sll.removeAtIndex(1);
    }
}
