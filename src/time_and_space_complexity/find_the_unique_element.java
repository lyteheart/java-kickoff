package time_and_space_complexity;

public class find_the_unique_element {
    public static int findDuplicate(int[] arr) {

        int result = 0;

        // XOR all ARRAY elements.
        for (int val : arr) {
            result ^= val;
        }
        // XOR all EXPECTED numbers (0..N-2).
        for (int i = 0; i <= arr.length-2; i++) {
            result ^= i;
        }

        // Expected numbers cancel.
        // Remaining value = Duplicate.
        return result;
    }

    public static int findUnique(int[] arr) {
        int result = 0;

        // XOR only the ARRAY.
        // Duplicate pairs cancel (a ^ a = 0).
        for (int val : arr) {
            result ^= val;
        }

        // Remaining value = Unique element.
        return result;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 6, 3, 6, 2};
        int[] arr2 = new int[]{0, 7, 2, 5, 4, 7, 1, 3, 6};
//        System.out.println(findUnique(arr));
        System.out.println(findDuplicate(arr2));
    }
}
