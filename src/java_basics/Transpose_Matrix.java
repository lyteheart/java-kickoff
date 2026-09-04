package java_basics;

public class Transpose_Matrix {
    // Transpose Matrix means making Row elements to Column & Column elements to Row
    // Arr[i][j] = Arr[j][i]
    public static int[][] transpose(int m, int n, int[][] mat) {
        if (mat.length == 0) {
            return new int[0][0];
        }
        int[][] newArr = new int[n][m];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                newArr[j][i] = mat[i][j];
            }
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[][] tArr = new int[][]{
                {1, 2},
                {2, 3},
                {3, 4}
        };
        int[][] arr = transpose(3, 2, tArr);
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
