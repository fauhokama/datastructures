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
        DoublyLinkedNode dln = new DoublyLinkedNode(value);
        dln.to = this.head;
        this.head.from = dln;
        this.head = dln;
        if (this.tail.from == null) {
            this.tail = this.head.to;
        }
    }

    public void insertAtTail(int value) {
        DoublyLinkedNode dln = new DoublyLinkedNode(value);
        this.tail.to = dln;
        dln.from = this.tail;
        this.tail = dln;

        if (this.head.to == null) {
            this.head = this.tail.from;
        }
    }

    public void removeAtHead() {
    }

    public void removeAtTail() {
    }

    public void removeAtIndex(int index) {
    }

    public int getHead() {
        return this.head.value;
    }

    public int getTail() {
        return this.tail.value;
    }

    public int[] getAsArray() {
        DynamicArray da = new DynamicArray();

        DoublyLinkedNode dln = this.head;
        da.add(this.head.value);
        while (dln.to != null) {
            dln = dln.to;
            da.add(dln.value);
        }

        return da.getAsArray();
    }
}
