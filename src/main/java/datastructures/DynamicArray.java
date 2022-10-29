package datastructures;

public class DynamicArray {
    private int[] array;

    public DynamicArray() {
        this.array = new int[0];
    }

    public void add(int element) {
        int[] tmp = new int[this.array.length + 1];

        for (int i = 0; i < this.array.length; i++) {
            tmp[i] = this.array[i];
        }
        tmp[this.array.length] = element;
        this.array = tmp;
    }

    public void remove(int element) {
    }

    public int get(int index) {
        return this.array[index];
    }

    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(2);
        da.add(3);
        da.get(1);
    }
}