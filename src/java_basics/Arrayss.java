package java_basics;

import java.util.Scanner;

public class Arrayss {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int arrSize=sc.nextInt();
//
//        int[] arr=new int[arrSize];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]= sc.nextInt();
//        }
//        int[] clonedArray=arr.clone();
//        Arrays.sort(clonedArray);
//        int min=clonedArray[0];
//        System.out.println(min);
//        ---------------------

        // test case + size of arr + find sun of those array
        Scanner sc = new Scanner(System.in);
        byte testCase = sc.nextByte();
        int[] result=new int[testCase];
        int index = 0;

        while (testCase>0){
            int arrSize = sc.nextInt();
            int[] arr = new int[arrSize];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int sum=0;
            for (int i:arr){
                sum += i;
            }
            result[index++]=sum;
            testCase--;
        }

        if(testCase==0){
            for (int i:result){
                if(i!=0){
                    System.out.print(i+" ");
                }
            }
        }


    }
}
