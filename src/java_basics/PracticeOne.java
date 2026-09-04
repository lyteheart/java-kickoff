package java_basics;

import java.util.Scanner;

public class PracticeOne {

    static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int j = 2; j * j <= n; j++) {
            if (n % j == 0) {
                return false;
            }
        }

        return true;
    }

    public static int calculateSimple(int principal, double rate, int time) {

        return 1;
    }


    public static void main(String[] args) {
//        for (int i = 2; i <= 50; i++) {
//            if (isPrime(i)) {
//                System.out.println(i);
//            }
//        }


        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        double rate = sc.nextDouble();
        int time = sc.nextInt();
        System.out.println(calculateSimple(principal, rate, time ));
    }
}
