package java_basics;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    static Scanner sc=new Scanner(System.in);

    public static int[] reverseBetween(int n, int l, int r, int []arr) {
        // Write your code from here.

        int left=l;
        int right=r;
        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            right--;
            left++;
        }


        return  arr;
    }




    public static void reverseArr(int[] arr){
        System.out.println(Arrays.toString(arr));
        int left=0;
        int right=arr.length-1;
        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            right--;
            left++;
        }

        System.out.println(Arrays.toString(arr));

    }


    public static void pushZerosToTheEnd(int[] arr){
        System.out.println(Arrays.toString(arr));


        // zero = position where next non-zero should go.
        // nonzero scans the array.
        int zero=0;
        for (int nonzero = 0; nonzero < arr.length ; nonzero++) {
            if(arr[nonzero]!=0){
                int temp=arr[zero];
                arr[zero]=arr[nonzero];
                arr[nonzero]=temp;
                zero++;
            }
        }
        System.out.println(Arrays.toString(arr));


    }

    public static void pushMinusToTheEnd(int[] arr){
        System.out.println(Arrays.toString(arr));


        // zero = position where next non-zero should go.
        // nonzero scans the array.
        int zero=0;
        for (int nonzero = 0; nonzero < arr.length ; nonzero++) {
            if(arr[nonzero]<0){
                int temp=arr[zero];
                arr[zero]=arr[nonzero];
                arr[nonzero]=temp;
                zero++;
            }
        }
        System.out.println(Arrays.toString(arr));


    }

    public static void main(String[] args) {
//        int[] arr=new int[5];
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i]=sc.nextInt();
//        }

//        reverseArr(arr);
//        int[] reverseArr=reverseBetween(10,0,2,arr);
//        System.out.println(Arrays.toString(reverseArr));
//        pushZerosToTheEnd(new int[]{1,0,6,2,0,7,0,0,3,2,1,7});
        pushMinusToTheEnd(new int[]{1,-3,6,-2,-7,7,4,-9,3,2,-1,7});

        sc.close();
    }




}
