package time_and_space_complexity;

/*
    Efficient Approach :-
                Sort both arrays first
                Use Two Pointer i and j
                One Linear Scan with i and j checking with movement
                -------
                Sorting O(N log N) + O(M log M)
                Traversal O(N + M)
                Overall = O(N log N + M log M)
*/


import java.util.Arrays;

public class array_intersection_using_time_complexity {

    public static void intersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                System.out.println(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }


    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 6, 8, 5, 4, 3};
        int[] arr2 = new int[]{2, 3, 4, 7};
        intersection(arr1, arr2);

    }
}
