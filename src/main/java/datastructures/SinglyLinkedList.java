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
        SinglyLinkedNode sln = new SinglyLinkedNode(value, this.head);
        this.head = sln;
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
        if (index == 0) {
            insertAtHead(value);
            return;
        }

        SinglyLinkedNode sln = new SinglyLinkedNode(value);
        SinglyLinkedNode pointer = new SinglyLinkedNode(value);
        sln.to = this.head;

        int counter = 1;

        while (counter <= index) {
            pointer = sln.to;
            sln.to = sln.to.to;
            counter++;
        }

        pointer.to = sln;

        // Second implementation just for better understanding.
        // Actually, I think this is better as a first implementation.
        // I need to look for this solution. Then, I can think of something more
        // "pretty" programatically.
        
        // while (true) {
        // pointer = sln.to;
        // SinglyLinkedNode nextNode = sln.to.to;
        // sln.to = nextNode;

        // // sln pointing to the "correct" node
        // if (index == counter) {
        // pointer.to = sln;
        // break;
        // }

        // counter++;
        // }
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
