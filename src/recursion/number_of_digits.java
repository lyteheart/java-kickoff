package recursion;

public class number_of_digits {
    // My Approach
    public static int countDigits(int n){
        if(n==0){
            return 0;
        }
        int count=0;
        count++;
        return count + countDigits(n/10);
    }
    // Efficient Approach
    public static int countDigitsEfficient(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        int countDig=countDigits(121212);
        System.out.println(countDig);
    }
}
