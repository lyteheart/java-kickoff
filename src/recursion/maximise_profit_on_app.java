package recursion;

import java.util.Arrays;

public class maximise_profit_on_app {
    public static int maximumProfit(int[] budget) {

        // Step 1: Sort the budgets in ascending order.
        // After sorting, if we choose budget[i] as the app price,
        // everyone from index i to the end can afford it.
        Arrays.sort(budget);

        // Stores the maximum profit found so far.
        int maxProfit = 0;

        // Total number of users.
        int n = budget.length;

        // Try every budget as the selling price.
        for (int i = 0; i < n; i++) {

            // Since the array is sorted,
            // all users from index i to n-1 can buy the app.
            int subscribers = n - i;

            // Profit = Price × Number of Subscribers
            int profit = budget[i] * subscribers;

            // Keep the maximum profit.
            maxProfit = Math.max(maxProfit, profit);
        }

        // Return the best profit.
        return maxProfit;
    }

    public static void main(String[] args) {

        int[] budget = {30, 20, 53, 14};

        System.out.println(maximumProfit(budget));
    }
}
