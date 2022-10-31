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
        this.head = this.head.to;
    }

    public void removeAtTail() {
        // Easy one pointer solution because of Java GC
        // If not, I think you would need two pointers to don't lose reference.
        if (this.head.to == null) {
            return;
        }

        SinglyLinkedNode pointer = new SinglyLinkedNode(0);
        pointer.to = this.head;

        // First intuitive Solution
        while (true) {
            if (pointer.to.to.to == null) {
                pointer.to.to = null;
                break;
            }

            pointer.to = pointer.to.to;
        }

        // Second Solution:
        // while (pointer.to.to.to != null) {
        // pointer.to = pointer.to.to;
        // }
        // pointer.to.to = null;

    }

    public void removeAtIndex(int index) {
        if (index == 0) {
            removeAtHead();
            return;
        }

        SinglyLinkedNode pointer1 = new SinglyLinkedNode(0);
        SinglyLinkedNode pointer2 = new SinglyLinkedNode(0);

        pointer1.to = this.head;
        int counter = 1;

        // Easy intuitive solution
        while (true) {
            pointer2 = pointer1.to;
            pointer1.to = pointer1.to.to;

            if (counter == index) {
                pointer2.to = pointer1.to.to;
                break;
            }

            counter++;
        }

        // Refactor
        // while (counter <= index) {
        // pointer2 = pointer1.to;
        // pointer1.to = pointer1.to.to;
        // counter++;
        // }

        // pointer2.to = pointer1.to.to;
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
