package datastructures;

public class DoublyLinkedList {
    private DoublyLinkedNode head;
    private DoublyLinkedNode tail;

    public DoublyLinkedList(int value) {
        this.head = new DoublyLinkedNode(value);
        this.tail = new DoublyLinkedNode(value);
    }

    class DoublyLinkedNode {
        private int value;
        private DoublyLinkedNode from;
        private DoublyLinkedNode to;

        public DoublyLinkedNode(int value) {
            this.value = value;
            this.from = null;
            this.to = null;
        }

        public DoublyLinkedNode(int value, DoublyLinkedNode to) {
            this.value = value;
            this.from = null;
            this.to = to;
        }

        public DoublyLinkedNode(int value, DoublyLinkedNode from, DoublyLinkedNode to) {
            this.value = value;
            this.from = from;
            this.to = to;
        }
    }

    public void search() {
    }

    public void insertAtHead(int value) {
    }

    public void insertAtTail(int value) {
    }

    public void removeAtHead() {
    }

    public void removeAtTail() {
    }

    public void removeAtIndex(int index) {
    }

    public int getHead() {
        return -1;
    }

    public int getTail() {
        return -1;
    }

    public int[] getAsArray() {
        return new int[] {};
    }
}
