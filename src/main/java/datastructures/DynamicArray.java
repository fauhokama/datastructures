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
        DynamicArray da = new DynamicArray();
        da.add(2);
    }
}