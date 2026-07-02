package Sorting_And_Searching;

import java.util.Arrays;

public class bubble_sort {

    public static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static int[] bubbleSortWithReturn(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{17, 5, 14, 16, 11, 18, 10};
        bubbleSort(arr,7);
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
