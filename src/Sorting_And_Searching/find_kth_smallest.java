package Sorting_And_Searching;


import java.util.Arrays;

// You have to find the kth smallest number.
// suppose we have this [17 5 14 16 11 18 10] & needs to find 5th smallest number
// Answer will be 16 why ?
// [5,10,11,14,16,17,18] at 5th position we have 16
public class find_kth_smallest {

    public static int kthSmallest(int[] arr, int n, int k) {
        if (k < 1 || k > n) {
            return -1;
        }
        return arr[k - 1];
    }


    public static void main(String[] args) {
        int[] arr = new int[]{17, 5, 14, 16, 11, 18, 10};
        int[] sortedArr = bubble_sort.bubbleSortWithReturn(arr, 7);
        int kthSmall = kthSmallest(sortedArr, 7, 5);
        System.out.println(kthSmall);
    }
}
