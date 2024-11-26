package Module33DP;

import java.util.Arrays;

public class A14perfectsquare {
    public static void main(String[] args) {
        int n = 12;
        int result = numsquer(n); 
        System.out.println("Minimum number of perfect squares for " + n + " is: " + result);
    }
    public static boolean isperfect(int n){
        int sqrt = (int)(Math.sqrt(n));
        if (sqrt*sqrt == n) {
            return true;
        }else{
            return false;
        }
    }
    public static int minssquares(int n,int[] dp){
        if (isperfect(n)) {
            return 1;
        }
        if (dp[n]!= -1) {
            return dp[n];
        }
        int min = Integer.MAX_VALUE;

        for(int i=1;i*i<=n;i++){
            int count = minssquares(i*i,dp)+minssquares(n-i*i,dp);
            min = Math.min(min, count);
        }
        return dp[n] = min;
    }
    
    public static int numsquer(int n){
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return minssquares(n,dp);
    }
}