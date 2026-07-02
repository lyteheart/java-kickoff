package Sorting_And_Searching;

// now what is that ?
// we need to want to find the sum of the differences
// between the indices of pairs of numbers that are in the wrong order.
public class find_inversion_using_selectionSort {

    public static int getInversions(int[] arr, int n){
        //Your code goes here
        int sum=0;
        for (int i = 0; i < n-1; i++) {
            int min=i;
            for (int j = i+1; j <n ; j++) {
                if(arr[min]>arr[j]){
                    min=j;

                }

            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
            sum += (Math.abs(i-min));
        }



        return sum;
    }




    public static void main(String[] args) {
        int[] arr = new int[]{17, 5, 14, 16, 11, 18, 10};
        int sum=getInversions(arr,7);
        System.out.println(sum);
    }
}
