package java_basics;

import java.util.Arrays;

public class arrangeNumbersInArray {

    // fill up number given by user in middle of 1,3,5,.......,6,4,2.
    // user -> 9 -> 1 3 5 7 9 8 6 4 2
    // user -> 6 -> 1 3 5 6 4 2


    public static void arrange(int[] arr, int n) {
        int startOdd = 1;
        int startEven = 2;
        int fromNextLoop = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = startOdd;
            startOdd += 2;
            if (arr[i] >= n) {
                arr[i] = n;
                fromNextLoop = i;
                break;
            }
        }
        for (int i = arr.length - 1; i > fromNextLoop; i--) {
            arr[i] = startEven;
            startEven += 2;
        }

        System.out.println(Arrays.toString(arr));
    }

    //    OPTIMIZED WAY
//    optimal solution for the "Arrange Numbers in Array" problem.
    public static void arrangeOptimised(int[] arr, int n) {

        int left = 0;
        int right = n - 1;

        int value = 1;

        while (left <= right) {

            arr[left] = value;
            left++;
            value++;

            if (left <= right) {
                arr[right] = value;
                right--;
                value++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        arrange(new int[9], 9);
        arrangeOptimised(new int[9], 9);
    }
}
