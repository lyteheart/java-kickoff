package java_basics;

import java.util.Arrays;

public class findTriplet {
    //     O(n³) complexity
    public static int findTriplet(int[] arr, int x) {
        //Your code goes here
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {

            for (int j = i + 1; j < arr.length - 1; j++) {

                for (int k = j + 1; k < arr.length; k++) {

                    if (arr[i] + arr[j] + arr[k] == x) {
                        count++;
                    }
                }
            }
        }


        return count;
    }
    //     O(n²) complexity -> Sort + Two Pointers
    public static int findTripletNewOptimised(int[] arr, int x) {
        Arrays.sort(arr);
        int count=0;

        for (int i = 0; i < arr.length - 2; i++) {

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == x) {
                    count++;
                    left++;
                    right--;
                } else if (sum < x) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return  count;
    }


    public static void main(String[] args) {
        int count = findTriplet(new int[]{2, -5, 8, -6, 0, 5, 10, 11, -3}, 10);
        int countTwo = findTripletNewOptimised(new int[]{2, -5, 8, -6, 0, 5, 10, 11, -3}, 10);
        System.out.println(count);
        System.out.println(countTwo);

    }
}
