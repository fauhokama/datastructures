package datastructures;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SinglyLinkedListTest {

    @Test
    public void testInsertAtHead() {
        SinglyLinkedList sll = new SinglyLinkedList(1);
        sll.insertAtHead(2);

        assertArrayEquals(null, new int[] { 2, 1 }, sll.getAsArray());

        sll.insertAtHead(3);

        assertArrayEquals(null, new int[] { 3, 2, 1 }, sll.getAsArray());
    }

    @Test
    public void testInsertAtTail() {
        SinglyLinkedList sll = new SinglyLinkedList(1);
        sll.insertAtTail(2);

        assertArrayEquals(null, new int[] { 1, 2 }, sll.getAsArray());

        sll.insertAtTail(3);

        assertArrayEquals(null, new int[] { 1, 2, 3 }, sll.getAsArray());
    }

    @Test
    public void testInsertByIndex() {
        SinglyLinkedList sll = new SinglyLinkedList(1);
        sll.insertByIndex(2, 0);

        assertArrayEquals(null, new int[] { 2, 1 }, sll.getAsArray());

        sll.insertByIndex(3, 1);

        assertArrayEquals(null, new int[] { 2, 3, 1 }, sll.getAsArray());

        sll.insertByIndex(4, 3);

        assertArrayEquals(null, new int[] { 2, 3, 1, 4 }, sll.getAsArray());

        sll.insertByIndex(5, 2);

        assertArrayEquals(null, new int[] { 2, 3, 5, 1, 4 }, sll.getAsArray());
    }

    @Test
    public void testRemoveAtHead() {
        SinglyLinkedList sll = new SinglyLinkedList(1);
        sll.insertAtTail(2);
        sll.insertAtTail(3);

        sll.removeAtHead();
        assertArrayEquals(null, new int[] { 2, 3 }, sll.getAsArray());

        sll.removeAtHead();
        assertArrayEquals(null, new int[] { 3 }, sll.getAsArray());
    }

    @Test
    public void testRemoveAtTail() {
        SinglyLinkedList sll = new SinglyLinkedList(1);
        sll.insertAtTail(2);
        sll.insertAtTail(3);

        sll.removeAtTail();
        assertArrayEquals(null, new int[] { 1, 2 }, sll.getAsArray());

        sll.removeAtTail();
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

        assertArrayEquals(null, new int[] { 2, 3, 4, 5 }, sll.getAsArray());

        sll.removeAtIndex(3);

        assertArrayEquals(null, new int[] { 2, 3, 4 }, sll.getAsArray());

        sll.removeAtIndex(1);

        assertArrayEquals(null, new int[] { 2, 4 }, sll.getAsArray());
    }
}
