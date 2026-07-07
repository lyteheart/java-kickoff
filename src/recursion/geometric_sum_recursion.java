package recursion;


// Given k, find the geometric sum i.e. :-   1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)
public class geometric_sum_recursion {
    public static double geometricSum(int k) {
        if(k==0)
            return 1;
        double res=(1.0/Math.pow(2,k));
        return res + geometricSum(k-1);
    }

    public static void main(String[] args) {
        double res=geometricSum(3);
        System.out.println(res);
    }
}
