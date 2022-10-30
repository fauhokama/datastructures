package datastructures;

public class SinglyLinkedList {
    private SinglyLinkedNode head;

    public SinglyLinkedList(int value) {
        this.head = new SinglyLinkedNode(value);
    }

    class SinglyLinkedNode {
        private int value;
        private SinglyLinkedNode to;

        public SinglyLinkedNode(int value, SinglyLinkedNode to) {
            this.value = value;
            this.to = to;
        }

        public SinglyLinkedNode(int value) {
            this.value = value;
            this.to = null;
        }
    }

    public SinglyLinkedNode search(int value) {
        return null;
    }

    public void insertAtHead(int value) {
    }

    public void insertAtTail(int value) {
        SinglyLinkedNode sln = new SinglyLinkedNode(value);

        SinglyLinkedNode pointer = this.head;
        while (pointer.to != null) {
            pointer = pointer.to;
        }

        pointer.to = sln;
    }

    public void insertByIndex(int value, int index) {
    }

    public void removeAtHead() {
    }

    public void removeAtTail() {
    }

    public void removeAtIndex(int index) {
    }

    public int[] getAsArray() {
        DynamicArray da = new DynamicArray();

        SinglyLinkedNode pointer = this.head;
        while (pointer.to != null) {
            da.add(pointer.value);
            pointer = pointer.to;
        }
        da.add(pointer.value);

        return da.getAsArray();
    }
}
