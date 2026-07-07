public class multiplication_not_using_multiply_operator {


    public static int multiplyTwoIntegers(int m, int n){
        if(n==0)
            return 0;
        return m + multiplyTwoIntegers(m,n-1);

    }

    public static void main(String[] args) {
        int res=multiplyTwoIntegers(4,0);
        System.out.println(res);
    }
}
