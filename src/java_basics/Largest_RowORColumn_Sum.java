package java_basics;

public class Largest_RowORColumn_Sum {


    public static void findLargest(int mat[][]) {
        if (mat.length == 0) {
            System.out.println("row 0 " + Integer.MIN_VALUE);
            return;
        }
        int largestCOL = Integer.MIN_VALUE;
        int largestROW = Integer.MIN_VALUE;

        int colIndex = 0;
        int rowIndex = 0;

        // Column sums
        for (int i = 0; i < mat[0].length; i++) {

            int sum = 0;

            for (int j = 0; j < mat.length; j++) {
                sum += mat[j][i];
            }

            if (sum > largestCOL) {
                largestCOL = sum;
                colIndex = i;
            }
        }

        // Row sums
        for (int i = 0; i < mat.length; i++) {

            int sum = 0;

            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }

            if (sum > largestROW) {
                largestROW = sum;
                rowIndex = i;
            }
        }

        if (largestROW >= largestCOL) {
            System.out.println("row " + rowIndex + " " + largestROW);
        } else {
            System.out.println("column " + colIndex + " " + largestCOL);
        }
    }


    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {6, 9, 8, 5},
                {9, 2, 4, 1},
                {8, 3, 9, 3},
                {8, 7, 8, 6}
        };
        findLargest(arr);
    }
}
