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
        DoublyLinkedNode dll = new DoublyLinkedNode(value);
        dll.to = this.head;
        this.head.from = dll;
        this.head = dll;
        if (this.tail.from == null) {
            this.tail = this.head.to;
        }
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
