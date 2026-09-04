package java_basics;

public class Total_Sum_On_Boundaries_And_Diagonals {


    public static int printTopLeftToBottomRight(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
        }


        return sum;
    }

    // because indices are arr[0][2] -> arr[1][1] -> arr[2][0]
    public static int printTopRightToBottomLeft(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][mat.length - 1 - i];
        }
        return sum;
    }

    public static int printEdgeDiagonals(int[][] mat) {
        int sum = 0;

        int n = mat.length;

        // Top row (excluding corners)
        for (int j = 1; j < n - 1; j++) {
            sum += mat[0][j];
        }

        // Bottom row (excluding corners)
        for (int j = 1; j < n - 1; j++) {
            sum += mat[n - 1][j];
        }

        // Left column (excluding corners)
        for (int i = 1; i < n - 1; i++) {
            sum += mat[i][0];
        }

        // Right column (excluding corners)
        for (int i = 1; i < n - 1; i++) {
            sum += mat[i][n - 1];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] sprialArr = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sumOne = printTopLeftToBottomRight(sprialArr);
        int sumTwo = printTopRightToBottomLeft(sprialArr);
        int sumThree = printEdgeDiagonals(sprialArr);

        int total = sumOne + sumTwo + sumThree;

        int n = sprialArr.length;
        int m = sprialArr[0].length;

        if (n % 2 == 1) {
            total -= sprialArr[n / 2][n / 2];
        }

        System.out.println(total);

    }
}
