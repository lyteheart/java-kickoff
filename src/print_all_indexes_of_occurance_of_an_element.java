import java.util.Arrays;

public class print_all_indexes_of_occurance_of_an_element {
    public static int[] allIndexesUsing_Indexes(int input[], int x, int index) {
        // during backtracking this already gives a blank array to prev calls :- []
        if (index == input.length)
            return new int[0];

        // Recursively get all indexes from the remaining array
        int[] smallAns = allIndexesUsing_Indexes(input, x, index + 1);

        // Current element is not x
        if (input[index] != x) {
            return smallAns;
        }
        // Current element is x
        int[] newArr = new int[smallAns.length + 1];

        // fill the 1st index
        newArr[0] = index;

        // then copy rest element one by one from 1st index
        for (int i = 0; i < smallAns.length; i++) {
            newArr[i + 1] = smallAns[i];
        }

        return newArr;
    }

    public static int[] allIndexes(int input[], int x) {
        return allIndexesUsing_Indexes(input, x, 0);

    }


    public static void main(String[] args) {
        int[] arr = new int[]{9, 8, 10, 8, 8};
        int[] result = allIndexes(arr, 8);
        System.out.println(Arrays.toString(result));
    }
}
