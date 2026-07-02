package Sorting_And_Searching;

public class sqrtN {
    public static int sqrtN(long N) {
        long ans = 0;
        for (int i = 1; (long) i * i <= N; i++) {
            ans = i;
        }
        return (int) ans;
    }

    // using binary search way - efficient
    public static int sqrtNusingBinarySearch(long N) {
        long left = 0;
        long right = N;
        long ans = 0;

        while (left <= right) {

            long mid = left + (right - left) / 2;
            if (mid == N / mid) {
                return (int) mid;
            } else if (mid < N / mid) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) ans;
    }

    public static void main(String[] args) {
//        int sqrt=sqrtN(6);
        int sqrt = sqrtNusingBinarySearch(6);
        System.out.println(sqrt);
    }
}
