package recursion;

public class check_number_recursively {
    public static boolean checkNumberNew(int input[], int index, int findNum) {
        if (index < 0) {
            return false;
        }
        if (input[index] == findNum) {
            return true;
        }
        return checkNumberNew(input, index - 1, findNum);
    }

    public static boolean checkNumber(int input[], int x) {

        return checkNumberNew(input, input.length - 1, x);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 4, 1, 7, 66, 4, 2};
        boolean isPresent = checkNumber(arr, 566);
        System.out.println(isPresent);
    }
}
