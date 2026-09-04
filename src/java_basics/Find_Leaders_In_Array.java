package java_basics;

public class Find_Leaders_In_Array {

    // A[i] is a leader if all elements to its right are less than or equal to A[i].
    // "Is there any number on my right that is bigger than me?" -
    //                          If YES → Not a leader.
    //                          If NO → Leader.
    public static void leaders(int[] input) {
        int max=input[input.length-1];
        System.out.print(max+" ");

        // Then keep moving left and ask: Is current element >= biggest leader seen so far?
        for (int i = input.length-2; i >=0 ; i--) {
            if(input[i]>=max){
                max=input[i];
                System.out.print(input[i]+" ");
            }
        }


    }

    public static void main(String[] args) {
        leaders(new int[]{3, 12, 34, 2, 0, -1});
    }
}
