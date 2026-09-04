package Sorting_And_Searching;

public class selection_sort {

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min=i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[min]>arr[j]){
                    min=j;
                }

            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }



    public static void main(String[] args) {
        int[] arr = new int[]{17, 5, 14, 16, 11, 18, 10};
        selectionSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
