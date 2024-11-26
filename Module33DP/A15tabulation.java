package Module33DP;

public class A15tabulation {
    public static void main(String[] args) {
        System.out.println(numsquare(12));
    }
    public static boolean isperfect(int n){
        int sqrt = (int)(Math.sqrt(n));
        if (sqrt*sqrt == n) {
            return true;
        }else{
            return false;
        }
    }
    public static int numsquare(int n){
        int[] dp = new int[n+1];

        for(int i=1;i<=n;i++){
            if (isperfect(i)) {
                dp[i] = 1;
            }else{
                int min = Integer.MAX_VALUE;
                for(int j=1;j*j<=i;j++){
                    int count = dp[j*j]+dp[i-j*j];
                    min = Math.min(min, count);
                }
                dp[i] = min;
            }
        }
        return dp[n];
    }
}
