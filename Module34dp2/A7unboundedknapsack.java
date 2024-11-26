package Module34dp2;

public class A7unboundedknapsack {
    public static void main(String[] args) {
        int[] val = {5, 3, 9, 16};
        int[] wt = {1, 2, 8, 10};
        int capacity = 8;
        int maxProfit = unboundedKnapsack(wt, val, capacity);
        System.out.println("The maximum profit is: " + maxProfit);
    }

    public static int unboundedKnapsack(int[] wt, int[] val, int capacity) {
        int[] dp = new int[capacity + 1];
        for (int c = 0; c <= capacity; c++) {
            for (int i = 0; i < wt.length; i++) {
                if (wt[i] <= c) {
                    dp[c] = Math.max(dp[c], dp[c - wt[i]] + val[i]);
                }
            }
        }
        return dp[capacity];
    }
}
