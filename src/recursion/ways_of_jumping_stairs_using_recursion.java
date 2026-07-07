package recursion;

/*

The core idea
To reach step N, the child's last hop must have been either:

        a 1-step hop from step N-1, or
        a 2-step hop from step N-2, or
        a 3-step hop from step N-3

        ways(N) = ways(N-1) + ways(N-2) + ways(N-3)

        1. ways(0) = 1 → there's exactly 1 way to be standing at the ground (step 0): do nothing.
                    This is the classic "empty" base case that makes the recursion work cleanly.
        2. ways(negative) = 0 → you can't have "arrived" at a negative step,
                     so that's an invalid path — contributes 0 ways.


 */


public class ways_of_jumping_stairs_using_recursion {

    public static int staircase(int n) {
        // child can not stand at negative base even on imagination
        if (n < 0)
            return 0;
        // standing on ground base — 1 way (do nothing)
        if (n == 0)
            return 1;


        return staircase(n - 1) + staircase(n - 2) + staircase(n - 3);
    }


    public static void main(String[] args) {
        System.out.println(staircase(3));
    }
}
