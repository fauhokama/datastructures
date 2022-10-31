package datastructures;

public class SinglyLinkedList {
    private SinglyLinkedNode head;
    private SinglyLinkedNode tail;

    public SinglyLinkedList(int value) {
        this.head = new SinglyLinkedNode(value);
        this.tail = new SinglyLinkedNode(value);
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
        this.tail.to = sln;
        this.tail = sln;

        if (this.head.to == null) {
            this.head.to = sln;
        }
    }

    // Assumptions: you can insertByIndex in the last element.
    // Would be the same as insertAtTail
    public void insertByIndex(int value, int index) {
        if (index == 0) {
            insertAtHead(value);
            return;
        }

        SinglyLinkedNode sln = new SinglyLinkedNode(value);
        SinglyLinkedNode pointer = new SinglyLinkedNode(value);
        sln.to = this.head;

        int counter = 1;
        while (true) {
            pointer = sln.to;

            if (sln.to == null) {
                throw new Error("Out of bounds");
            }

            sln.to = sln.to.to;

            if (index == counter) {
                pointer.to = sln;
                if (sln.to == null) {
                    this.tail = sln;
                }
                break;
            }

            counter++;
        }
    }

    public void removeAtHead() {
        this.head = this.head.to;
    }

    public void removeAtTail() {
        // Easy one pointer solution because of Java GC
        // If not, I think you would need two pointers to don't lose reference.

        if (this.head.to == null) {
            this.tail = this.head;
            return;
        }

        SinglyLinkedNode pointer = new SinglyLinkedNode(0);
        pointer.to = this.head;

        while (true) {
            if (pointer.to.to.to == null) {
                pointer.to.to = null;
                break;
            }

            pointer.to = pointer.to.to;
        }

        this.tail = pointer.to;
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

        while (true) {
            pointer2 = pointer1.to;

            if (pointer1.to == null) {
                throw new Error("Out of bounds");
            }

            pointer1.to = pointer1.to.to;

            if (counter == index) {
                if (pointer1.to == null) {
                    throw new Error("Out of bounds");
                }
                pointer2.to = pointer1.to.to;

                if (pointer2.to == null) {
                    this.tail = pointer2;
                }

                break;
            }

            counter++;
        }
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

    public int getHead() {
        return this.head.value;
    }

    public int getTail() {
        return this.tail.value;
    }
}
