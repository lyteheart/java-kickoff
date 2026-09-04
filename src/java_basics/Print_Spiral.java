package java_basics;

public class Print_Spiral {
    public static void spiralPrint(int matrix[][]){
        if(matrix.length == 0){
            return;
        }
        int top=0, bottom=matrix.length-1;
        int left=0, right=matrix[0].length-1;

        while (left<=right && top<=bottom) {

            // from left-right
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[left][i] + " ");
            }
            top++;
            // from top-bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // from right-left
            if (top<=bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }


            // from bottom-top
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
            }
            left++;
        }




    }


    public static void main(String[] args) {
        int[][] sprialArr=new int[][]{
                {1, 2, 3, 4, 5, 6},
                {18,19,20,21,22,7},
                {17,28,29,30,23,8},
                {16,27,26,25,24,9},
                {15,14,13,12,11,10}
        };
        spiralPrint(sprialArr);
    }
}
