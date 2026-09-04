package java_basics;

public class rowWiseSum {
    public static void rowWiseSumMethods(int[][] mat) {
        StringBuilder sb=new StringBuilder();

        for (int i = 0; i < mat.length; i++) {
            int sum=0;
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
            sb.append(sum+" ");
        }

        System.out.println(sb);
    }


    public static void main(String[] args) {
        int[][] sprialArr=new int[][]{
                {1, 2, 3, 4, 5, 6},
                {18,19,20,21,22,7},
                {17,28,29,30,23,8},
                {16,27,26,25,24,9},
                {15,14,13,12,11,10}
        };
        rowWiseSumMethods(sprialArr);
    }
}
