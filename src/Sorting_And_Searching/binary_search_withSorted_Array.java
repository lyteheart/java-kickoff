package Sorting_And_Searching;

public class binary_search_withSorted_Array {

    public static int search(int []nums, int target) {
        if (nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            // left + right can overflow an int.
            // No overflow occurs because: right - left is always much smaller than left + right.
            // The final addition stays within the valid int range.
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1, 3, 7, 9, 11, 12, 45};
        int indexFound=search(arr,3);
        System.out.println(indexFound);
    }
}
