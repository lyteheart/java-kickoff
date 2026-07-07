package recursion;

public class count_zero_using_recursion {

    public static int countZerosRec(int input) {
        if (input == 0) {
            return 1;
        }

        if (input < 10) {
            return 0;
        }

        if (input % 10 == 0) {
            return 1 + countZerosRec(input / 10);
        }

        return countZerosRec(input / 10);
    }

    public static void main(String[] args) {
        int res2 = countZerosRec(Integer.parseInt("00010204"));
        System.out.println(res2);

    }
}
