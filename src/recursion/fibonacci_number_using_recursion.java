package recursion;

public class fibonacci_number_using_recursion {
    public static int fib(int n){
        if(n==1 || n==2)
            return 1;
        int fib_n_1=fib(n-1);
        int fib_n_2=fib(n-2);
        int sum = fib_n_1 + fib_n_2;
        return sum;
    }
    public static void main(String[] args) {
        int res=fib(5);
        System.out.print(res+" ");
    }
}
