package time_and_space_complexity;


//  Write a function that rotates the given array/list by D elements(towards the left).
// <-- towards the left

import java.util.Arrays;

public class rotate_an_array {

    public static void reverse(int[] arr, int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }


    public static void rotate(int[] arr, int d) {

        int n = arr.length;

        if (n == 0)
            return;

        d = d % n;

        reverse(arr, 0, d - 1);

        reverse(arr, d, n - 1);

        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        rotate(arr, 2);

        System.out.println(Arrays.toString(arr));

    }
}
