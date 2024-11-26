package Module33DP;

import java.util.Arrays;

public class A4mincostclimbingstair {
    public static void main(String[] args) {
        int[] cost = {1,2,3,4,50,6};
        int result = mincostclimbingstair(cost);
        System.out.println("Minimum cost to climb the stairs: " + result);
    }
    public static int mincost(int[] cost,int idx,int[] dp){
        if (idx == 0 || idx == 1) {
            return cost[idx];
        }
        if (dp[idx]!=-1) {
            return dp[idx];
        }
        return dp[idx] = cost[idx]+Math.min(mincost(cost, idx-1,dp), mincost(cost, idx-2,dp));
    }
    public static int mincostclimbingstair(int[] cost){
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return Math.min(mincost(cost,n-1,dp),mincost(cost,n-2,dp));
    }
}
