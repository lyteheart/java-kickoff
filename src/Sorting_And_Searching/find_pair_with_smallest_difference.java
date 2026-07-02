package Sorting_And_Searching;

import java.util.Arrays;

// Given two unsorted arrays of non-negative integers,
// 'arr1' and 'arr2' of size 'N' and 'M', respectively.
// Your task is to find the pair of elements (one from each array),
// such that their absolute (non-negative) difference is the smallest, and return the min difference.
public class find_pair_with_smallest_difference {
    // My Approach
    public static int smallestDifferencePair(int[] arr1, int n, int[] arr2, int m) {
        int min_difference = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int diff = Math.abs(arr1[i] - arr2[j]);

                if (diff < min_difference) {
                    min_difference = diff;
                }
            }
        }
        return min_difference;
    }

    // Efficient Approach
    public static int smallestDifferencePairEfficient(int[] arr1, int n, int[] arr2, int m) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        int j = 0;
        int minDiff = Integer.MAX_VALUE;
        while (i < n && j < m) {

            int diff = Math.abs(arr1[i] - arr2[j]);
            minDiff = Math.min(minDiff, diff);

            if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return minDiff;

    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{10, 20, 30};
        int[] arr2 = new int[]{17, 15};
        int smallDiff = smallestDifferencePair(arr1, arr1.length, arr2, arr2.length);
        System.out.println(smallDiff);
    }
}
