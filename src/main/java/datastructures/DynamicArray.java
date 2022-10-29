package datastructures;

public class DynamicArray {
    private int[] array;
    private int numberOfElements; //

    public DynamicArray() {
        this.numberOfElements = 0;
        this.array = new int[1];
    }

    // Access O(1)
    public int get(int index) {
        return this.array[index];
    }

    // Search O(n)
    public int search(int element) {
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    // Insertion O(n)
    public void insert(int element, int index) {
        this.numberOfElements++;

        int capacity = this.array.length;
        if (this.numberOfElements > this.array.length) {
            capacity *= 2;
        }
        int[] tmp = new int[capacity];

        for (int i = 0, j = 0; i <= this.array.length; i++, j++) {
            if (index == i) {
                tmp[i] = element;
                j--;
            } else {
                tmp[i] = this.array[j];
            }
        }

        this.array = tmp;
    }

    // Appending O(n)
    public void add(int element) {
        this.numberOfElements++;
        if (this.numberOfElements > this.array.length) {
            int[] tmp = new int[this.array.length * 2];

            for (int i = 0; i < this.array.length; i++) {
                tmp[i] = this.array[i];
            }
            this.array = tmp;
        }
        this.array[this.numberOfElements - 1] = element;
    }

    // Deletion O(n)
    public boolean remove(int element) {
        Boolean found = false;
        int[] tmp = new int[this.array.length];

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if (!found && this.array[i] == element) {
                found = true;
                this.numberOfElements--;
                j--;
            } else {
                tmp[j] = this.array[i];
            }
        }
        this.array = tmp;
        return found;
    }

    public int getLength() {
        return this.array.length;
    }

    public int getNumberOfElements() {
        return this.numberOfElements;
    }
}