package Module33DP;

public class A5secondintabulation {
    public static int main(String[] args) {
        int[] cost = { 1, 4, 100, 3, 3, 50, 6 };
        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 2], dp[i - 1]);
        }
        return Math.min(dp[n - 2], dp[n - 1]);
    }
}