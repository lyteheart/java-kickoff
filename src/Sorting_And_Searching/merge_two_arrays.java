package Sorting_And_Searching;

import java.util.Arrays;

public class merge_two_arrays {
    public static int[] merge(int arr1[], int arr2[]) {
        int biggerLength = (arr1.length + arr2.length);
        int[] newArray = new int[biggerLength];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] >= arr2[j]) {
                newArray[k] = arr2[j];
                j++;
            } else{
                newArray[k] = arr1[i];
                i++;
            }
            k++;
        }
        // rest element collecting for arr1
        while(i<arr1.length){
            newArray[k]=arr1[i];
            i++;
            k++;
        }
        // rest element collecting for arr2
        while(j<arr2.length){
            newArray[k]=arr2[j];
            j++;
            k++;
        }
        return newArray;
    }


    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 3, 4, 7, 11};
        int[] arr2 = new int[]{2, 4, 6, 13};
        int[] mergedArray = merge(arr1, arr2);
        System.out.println(Arrays.toString(mergedArray));

    }
}
