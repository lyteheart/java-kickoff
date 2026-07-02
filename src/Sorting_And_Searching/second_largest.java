package Sorting_And_Searching;

public class second_largest {
    public static int secondLargestElement(int[] arr, int n) {
        if (n < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 10, 9, 2};
        int secondLarge=secondLargestElement(arr,5);
        System.out.println(secondLarge);

    }

    public static class count_small_diff_from_second_array {



    }
}
