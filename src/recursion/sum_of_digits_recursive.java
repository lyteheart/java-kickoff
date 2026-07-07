package recursion;

public class sum_of_digits_recursive {

    public static int sumOfDigits(int input) {
        if(input==0)
            return 0;
        int rem=input%10;
        return rem + sumOfDigits(input/10);
    }


    public static void main(String[] args) {
        int res = sumOfDigits(12345);
        System.out.println(res);
    }
}
