package recursion;

public class check_array_sorted_or_not {


    public static boolean arraySortedOrNotUsingIndex(int []A, int N,int index) {
        // Is there a next element?
        if (index==N-1) {
            return true;
        }
        if(A[index]>A[index+1]){
            return false;
        }
        return arraySortedOrNotUsingIndex(A,N,index+1);
    }
    public static boolean arraySortedOrNot(int []A, int N) {
        return arraySortedOrNotUsingIndex(A,N,0);
    }



    public static void main(String[] args) {
        int[] arr=new int[]{10,20,30,40,50,60,70};
        boolean isSorted=arraySortedOrNot(arr,arr.length-1);
        System.out.println(isSorted);
    }
}
