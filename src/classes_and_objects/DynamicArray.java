package classes_and_objects;

import java.util.Arrays;

public class DynamicArray {
    private int[] data;
    private int nextIndex;
    private int capacity;

    public DynamicArray() {
        this.capacity = 5;
        this.data = new int[this.capacity];
        this.nextIndex = 0;

    }

    public void add(int element) {
        if (nextIndex == capacity) {
            int[] tempArr = new int[capacity * 2];
            for (int i = 0; i < data.length; i++) {
                tempArr[i] = data[i];
            }
            this.data = tempArr;
            capacity = tempArr.length;
        }
        data[nextIndex] = element;
        nextIndex++;
    }

    public int getIndex(int index) {
        if (index > nextIndex) {
            System.out.println("Element not present");
            return -1;
        }
        return data[index];
    }

    public void set(int index, int element) {
        if (index < 0 || index >= nextIndex) {
            System.out.println("Element not present");
            return;
        }

        data[index] = element;
    }

    public int removeLast() {
        if (nextIndex == 0) {
            System.out.println("Array is empty");
            return -1;
        }

        int removedElement = data[nextIndex - 1];
        nextIndex--;

        return removedElement;
    }

    public void remove(int index) {
        if (index >= nextIndex || index < 0) {
            System.out.println("Element is not present");
            return;
        }
        // Shift all elements one position to the left
        for (int i = index; i < nextIndex-1; i++) {
            data[i] = data[i + 1];
        }
        nextIndex--;
        // Optional: clear the unused position (good for debugging)
        data[nextIndex] = 0;
    }


    public void print() {
        System.out.println(Arrays.toString(data));
    }
}


