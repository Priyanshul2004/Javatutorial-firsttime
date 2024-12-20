package Module33DP;

public class A9tabulationA8 {
    public static void main(String[] args) {
        System.out.println(friends(4));
    }
    public static int friends(int n){
        int[] dp = new int[n+1];
        dp[1] = 1;
        if (n>1) {
            dp[2] = 2;
        }
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1]+(i-1)*dp[i-2];
        }
        return dp[n];
    }
}
//quest count derangements