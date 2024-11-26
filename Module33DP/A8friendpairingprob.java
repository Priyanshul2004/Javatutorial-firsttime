package Module33DP;

import java.util.Arrays;
import java.util.Scanner;

public class A8friendpairingprob {
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n ");
        int n = sc.nextInt();
        System.out.println(pair(n,dp));
    }
    public static int pair(int n,int[] dp){
        if (n<=2) {
            return n;
        }
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        if (dp[n]!=-1) {
            return dp[n];
        }
        return pair(n-1,dp)+(n-1)*pair(n-2,dp);
    }
}
