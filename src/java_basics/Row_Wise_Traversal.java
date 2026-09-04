package java_basics;

import java.util.Arrays;

public class Row_Wise_Traversal {

    // This will work for known length of matrix array ✅
    // But not for jagged Arrays 🔴
    public static int[] printRowWise(int [][]a) {
        // Write your code here.
        int[] newVal=new int[a.length * a[0].length];
        int index=0;
        for(int[] row:a){
            for(int val:row){
                newVal[index++]=val;
            }
        }


        return newVal;
    }

    // Solution ✅ for Jagged Arrays
    public static int[] printRowWiseForJaggedArrays(int [][]a) {
        int length=0;
        for(int[] row:a){
            length += row.length;
        }
        System.out.println(length);



        int[] newVal=new int[length];
        int index=0;
        for(int[] row:a){
            for(int val:row){
                newVal[index++]=val;
            }
        }


        return newVal;
    }


    public static void main(String[] args) {
        int[][] twoDArr=new int[][]{
                {1,2,3},
                {4,5,6}
        };
        int[][] twoDArrJagged=new int[][]{
                {1,2,3},
                {4,5},
                {1,2,3,8,5,4},
                {2}
        };
        int[] arr=printRowWise(twoDArr);
        int[] arrJagged=printRowWiseForJaggedArrays(twoDArrJagged);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrJagged));
    }
}
