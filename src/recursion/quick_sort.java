package recursion;

import java.util.Arrays;

public class quick_sort {


    public static void quickSort(int[] input, int startIndex, int endIndex) {
        // Base Case — single element or empty
        if (startIndex >= endIndex) return;

        // partition - place pivot to it's right place
        int pivotIndex = partition(input, startIndex, endIndex);

        // recursively sort LEFT of pivot (winding)
        quickSort(input,startIndex,pivotIndex-1);

        // recursively sort RIGHT of pivot (winding)
        quickSort(input,pivotIndex+1,endIndex);

    }

    // means we place the pivot in it's right place that's it
    public static int partition(int[] input, int startIndex, int endIndex) {
        // pick last element as pivot
        int pivot = input[endIndex];

        // Elements less than pivot goes Left
        // Elements greater than pivot goes right
        // so we need to compare one element with another we need i and j
        // j should start from 0
        // i should start from -1

        // i tracks last smaller element
        int i = startIndex - 1;

        for (int j = startIndex; j < endIndex; j++) {
            if (input[j] <= pivot) {
                i++;
                swap(input, i, j);
            }
        }
        swap(input,i+1,endIndex);
        return i+1;

    }


    public static void swap(int[] arr, int posOne, int posTwo) {
        int temp = arr[posTwo];
        arr[posTwo] = arr[posOne];
        arr[posOne] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 6, 8, 5, 4, 3};
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
