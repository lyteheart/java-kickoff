package java_basics;

public class Square_Matrix {

    // For the main diagonal, the rule is very simple:
    // row index == column index
    // (0,0) (0,1) (0,2)
    // (1,0) (1,1) (1,2)
    // (2,0) (2,1) (2,2)
    // Diagonal positions:(0,0)(1,1)(2,2)
    //


    public static String sqrMat(int[][] mat, int n, int m, int diag[]) {
        StringBuilder sb = new StringBuilder();
        if (n == m) {
            sb.append("YES\n");
            for (int i = 0; i < mat.length; i++) {
                // 🔴mat[i][i] -> [0][0] & [1][1] & [2][2]
                sb.append(mat[i][i]).append(" ");
            }
        } else {
            return "NO";
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {10, 11, 12}
        };
        String str = sqrMat(arr, 3, 3, new int[]{});
        System.out.println(str);
    }
}
