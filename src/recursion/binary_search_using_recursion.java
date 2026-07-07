package recursion;

public class binary_search_using_recursion {

    public static int binarySearchUsingIndex(int input[], int element, int startIn, int endIn) {

        if (input.length == 0)
            return -1;
        if(startIn>endIn)
         return -1;

        int mid = startIn + (endIn - startIn) / 2;

        if (input[mid] == element)
            return mid;

        if (input[mid] < element) {
            return binarySearchUsingIndex(input, element, mid + 1, endIn);
        } else {
            return binarySearchUsingIndex(input, element, startIn, mid - 1);
        }
    }

    public static int binarySearch(int input[], int element) {
        return binarySearchUsingIndex(input, element, 0, input.length - 1);
    }


    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 5, 6, 8};
        int res = binarySearch(arr, 6);
        System.out.println(res);
    }
}
