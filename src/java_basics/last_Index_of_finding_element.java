package java_basics;

public class last_Index_of_finding_element {
    public static int lastIndexUsingIndex(int input[], int x, int index ) {
        // Base case
        if (index == input.length) {
            return -1;
        }

        // this will call from index from 1 not 0
        int smallAns=lastIndexUsingIndex(input, x, index + 1);

        // Did they find one?
        // Yes → return it
        if(smallAns!=-1){
            return smallAns;
        }

        // No → check yourself
        if (input[index] == x) {
            return index;
        }

        return -1;
    }

    public static int lastIndex(int input[], int x) {
        return lastIndexUsingIndex(input, x, 0);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{9, 8, 10, 8};
        int isFound = lastIndex(arr, 8);
        System.out.println(isFound);
    }
}
