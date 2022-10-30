package datastructures;

public class SinglyLinkedList {
    private SinglyLinkedNode singlyLinkedNode;

    public SinglyLinkedList(int value) {
        this.singlyLinkedNode = new SinglyLinkedNode(value);
    }

    class SinglyLinkedNode {
        private int value;
        private SinglyLinkedNode to;

        public SinglyLinkedNode(int value, SinglyLinkedNode to) {
            this.value = this.value;
            this.to = to;
        }

        public SinglyLinkedNode(int value) {
            this.value = this.value;
            this.to = null;
        }
    }

    public SinglyLinkedNode search(int value) {
        return null;
    }

    public void insertAtHead(int value) {
    }

    public void insertAtTail(int value) {
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
        return null;
    }
}
