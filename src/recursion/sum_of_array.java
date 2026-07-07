package recursion;

import java.util.Arrays;

public class sum_of_array {
    public  static  int newSum(int[] input, int index){
        // base case
        if(index==input.length-1){
            return input[index];
        }
        return input[index] + newSum(input,index+1);
    }



    public static int sum(int input[]) {
       return newSum(input,0);
    }

    public static void main(String[] args) {
        int[] arr=new  int[]{9,8,9};
        int totalsum=sum(arr);
        System.out.println(totalsum);
    }
}
