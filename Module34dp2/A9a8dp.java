package Module34dp2;

public class A9a8dp {
    static int[][] dp;
    public static void main(String[] args) {
        int[] coins = {1, 2, 5}; 
        int amount = 11;
        int result = coinchange(coins, amount);
        System.out.println("Minimum coins needed: " + result);
    }
    public static long coincount(int i,int[] coins,int amount,long[][] dp){
        if (i==coins.length) {
            if (amount == 0) {
                return 0;
            }else{
                return Integer.MAX_VALUE;
            }
        }
        if (dp[i][amount]!=-1) {
            return dp[i][amount];
        }
        long skip = coincount(i+1, coins, amount,dp);
        if (amount-coins[i]<0) {
            return dp[i][amount] = skip;
        }
        long pick = 1+coincount(i, coins, amount-coins[i],dp);
        return dp[i][amount] = Math.min(skip, pick);
    }
    public static int coinchange(int[] coins,int amount){
        long[][] dp = new long[coins.length][amount+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        int ans =  (int)coincount(0, coins, amount,dp);
        if (ans == Integer.MAX_VALUE) {
            return -1;
        }
        return ans;
    }
}