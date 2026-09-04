package java_basics;

import java.util.Arrays;

public class arrayRotatation {


    public static void reverserArrayNew(int[] arr,int startpoint, int endpoint){
        int left=startpoint;
        int right=endpoint;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static int[] rotateArrayByLeft(int []a, int x) {
//        Left Rotation -> small small big -> Reverse[x] Reverse[n-x] Reverse[x]+Reverse[n-x]
//        --> Reverse first k elements -> Reverse remaining elements -> Reverse whole array
//        n -> array length


        x = x % a.length;
        reverserArrayNew(a,0,x-1);
        reverserArrayNew(a,x,a.length-1);
        reverserArrayNew(a,0,a.length-1);
        return a;
    }


    public static int[] rotateArrayByRight(int []a, int x) {
//        Right Rotation -> Big small small -> Reverse[n] Reverse[x] Reverse[n-x]
//        --> Reverse whole -> Reverse first x -> Reverse remaining
//        n -> array length

//    otherwise array index out of bond
        x = x % a.length;

        reverserArrayNew(a,0,a.length-1);
        reverserArrayNew(a,0,x-1);
        reverserArrayNew(a,x,a.length-1);
        return a;
    }




    public static void main(String[] args) {
        int[] leftRotateArr=rotateArrayByLeft(new int[]{6, 2, 4, 1,2,3,7,2},3);
        int[] rightRotateArr=rotateArrayByRight(new int[]{10,9,4,2,7,22,74,32,33,27},5);
        System.out.println(Arrays.toString(leftRotateArr));
        System.out.println(Arrays.toString(rightRotateArr));
    }
}
