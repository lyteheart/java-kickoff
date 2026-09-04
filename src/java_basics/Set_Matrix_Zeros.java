package java_basics;

import java.util.Arrays;

public class Set_Matrix_Zeros {
    public static void setZeros(int matrix[][]) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==0){
                    rows[i] = true;
                    cols[j] = true;

                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }




    }

    public static void main(String[] args) {
        int[][] arr=new int[][]{
                {7, 19, 3},
                {4, 21, 0}
        };
        setZeros(arr);
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
