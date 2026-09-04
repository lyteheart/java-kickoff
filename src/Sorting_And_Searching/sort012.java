package Sorting_And_Searching;

public class sort012 {
    // 🚀NOTE:- Single Scan Only
    public static void swap(int posOne, int posTwo, int[] arr) {
        int temp = arr[posTwo];
        arr[posTwo] = arr[posOne];
        arr[posOne] = temp;
    }


    // We will follow Dutch National Flag -> using 3 pointers ( low, mid, high )
    // low  = where next 0 should go
    // mid  = current element
    // high = where next 2 should go
    public static void sort012Methods(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {

            if (arr[mid] == 0) {
                swap(low, mid, arr);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(mid, high, arr);
                high--;
            }
        }


        for (int val : arr) {
            System.out.print(val + " ");
        }

    }

    public static void main(String[] args) {
        sort012Methods(new int[]{0, 1, 2, 0, 2, 0, 1});
    }
}
