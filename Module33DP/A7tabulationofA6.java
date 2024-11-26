package Module33DP;
public class A7tabulationofA6 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println("max is "+rob(nums));
    }
    public static int rob(int[] arr){
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = arr[0];
        if (n>1) {
            dp[1] = Math.max(arr[0], arr[1]);
        }
        for(int i=2;i<n;i++){
            dp[i] = Math.max(arr[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }
}