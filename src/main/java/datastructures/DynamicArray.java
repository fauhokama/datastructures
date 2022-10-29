package datastructures;

public class DynamicArray {
    private int[] array;
    private int numberOfElements;

    public DynamicArray() {
        this.numberOfElements = 0;
        this.array = new int[1];
    }

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

    public void remove(int element) {
        this.numberOfElements--;
        int[] tmp = new int[this.array.length];
        Boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (found == false && this.array[i] == element) {
                found = true;
            } else {
                if (found) {
                    tmp[i - 1] = this.array[i];
                } else {
                    tmp[i] = this.array[i];
                }
            }
        }
        this.array = tmp;
    }

    public int get(int index) {
        return this.array[index];
    }

    public int getLength() {
        return this.array.length;
    }

    public int getNumberOfElements() {
        return this.numberOfElements;
    }

    public static void main(String[] args) {
        // ArrayList as = new ArrayList<>();
        // as.remove(as)
    }
}