package Sorting_And_Searching;

public class closestIndex {

    public static int binarySearchClosest(int []nums, int left, int right, int target) {

        if (nums.length == 0) {
            return -1;
        }


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

        // Target is smaller than all elements
        if (right < 0) {
            return left;
        }

        // Target is larger than all elements
        if (left >= nums.length) {
            return right;
        }

        // Compare the two closest candidates
        if (target - nums[right] <= nums[left] - target) {
            return right;
        } else {
            return left;
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1, 3, 7, 9, 11, 12, 45};
        int indexFound=binarySearchClosest(arr,0,arr.length-1,10);
        System.out.println(arr[indexFound]);
    }
}
