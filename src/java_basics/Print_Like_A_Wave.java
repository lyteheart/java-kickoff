package java_basics;

public class Print_Like_A_Wave {

    public static void wavePrint(int mat[][]) {
        int top = 0, bottom = mat.length - 1;
        int left = 0, right = mat[0].length - 1;

        while (left <= right) {
            if (left % 2 == 0) {

                // from top to bottom
                for (int i = top; i <= bottom; i++) {
                    System.out.print(mat[i][left] + " ");
                }
            } else {
                // from bottom to top
                for (int i = bottom; i >= top; i--) {
                    System.out.print(mat[i][left] + " ");
                }
            }
            left++;
        }


    }

    public static void main(String[] args) {
        int[][] sprialArr = new int[][]{
                {1, 2, 3, 4, 5, 6},
                {18, 19, 20, 21, 22, 7},
                {17, 28, 29, 30, 23, 8}
        };
        wavePrint(sprialArr);
    }
}
