package Sorting_And_Searching;

import java.util.Arrays;

public class count_small_diff_from_second_array {
    public static int[] countS(int n, int m, int[] a, int[] b) {

        int[] ans = new int[n];


        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = m - 1;
            int lastIndex = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (b[mid] <= a[i]) {
                    lastIndex = mid;
                    left = mid + 1;
                }else{
                    right=mid-1;
                }
            }
            ans[i]=lastIndex+1;
        }


        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{2,4};
        int[] arr2 = new int[]{1,3,5};
        int[] smalldiffarr = countS(arr1.length, arr2.length, arr1, arr2);
        System.out.println(Arrays.toString(smalldiffarr));
    }
}
