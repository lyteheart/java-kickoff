package recursion;

public class x_to_the_power_of_n {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        int result = power(2, 2);
        System.out.println(result);
    }
}
