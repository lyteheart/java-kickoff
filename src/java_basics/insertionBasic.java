package java_basics;

import java.util.Arrays;
import java.util.Scanner;

public class insertionBasic {
    static Scanner sc = new Scanner(System.in);

    public static void relocate(int[] arr, int element, int position, int size) {
        for (int i = size; i > position ; i--) {
            arr[i]=arr[i-1];
        }
        arr[position]=element;
        System.out.println(Arrays.toString(arr));

    }


    public static int takeInput(String str){

//        this takeInput() creates a new Scanner every time: 🔴
//        Scanner sc=new Scanner(System.in);
//        Sollution 🟢 :- create a static scanner which is shared and reuse everwhere

        System.out.println(str);
        return  sc.nextInt();
    }




    public static void main(String[] args) {

        int capacity=takeInput("Enter the capacity of that array : ");
        int[] arr=new int[capacity];
        int size = takeInput("Enter the size you want to fillup in that array : ");
        for (int i = 0; i <size ; i++) {
            arr[i]=takeInput("Enter "+i+"th element");
        }
        int element=takeInput("Tell me the new element you want to insert");
        int position=takeInput("Enter the position you want to insert the element : ");
        System.out.println("before relocating : " +Arrays.toString(arr));
        if (size == arr.length) {
            System.out.println("Array is full. Cannot insert.");
            return;
        }
        relocate(arr,element,position,size);

        sc.close();

    }
}
