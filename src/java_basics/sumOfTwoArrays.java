package java_basics;

import java.util.Arrays;

public class sumOfTwoArrays {
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = output.length - 1;

        int carry = 0;
        while (i>=0 || j>=0){
            int digit1 = (i >= 0) ? arr1[i] : 0;
            int digit2 = (j >= 0) ? arr2[j] : 0;

            int sum = digit1 + digit2 + carry;

            output[k] = sum % 10;
            carry = sum / 10;

            i--;
            j--;
            k--;


        }
        output[k] = carry;

        System.out.println(Arrays.toString(output));

    }
// NEED TEMPORARY ARRAY TO HOLD DATA -> NOT OPTIMIZED
    public static void prefixSum(int[] arr) {
        int[] P=new int[arr.length];
        for (int i = 0; i <=arr.length-1 ; i++) {
            int sum=0;
            for (int j = 0; j <=i ; j++) {
                sum=sum+arr[j];
                P[i]=sum;
            }
        }

    }

//    OPTIMIZED -> WITHOUT 3RD VARIABLE
    public static void prefixSumOptimized(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        System.out.println(Arrays.toString(arr));

    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 =    {9, 8, 7, 6};

        int[] output = new int[Math.max(arr1.length, arr2.length) + 1];

//        java_basics.sumOfTwoArrays(arr1, arr2, output);
        prefixSum(arr1);
        prefixSumOptimized(arr1);
    }
}
