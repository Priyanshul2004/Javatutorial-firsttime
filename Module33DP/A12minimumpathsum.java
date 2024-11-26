package Module33DP;

public class A12minimumpathsum {
    public static void main(String[] args) {
        int[][] grid = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };
        int result = minpathsum(grid);
        System.out.println("The minimum path sum is: " + result);
    }
    public static int minpathsum(int[][] arr){
        int m = arr.length;
        int n = arr.length;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if (i==0 && j==0) {
                    dp[i][j] = arr[i][j];
                }else if (i==0) {
                    dp[i][j] = arr[i][j]+dp[i][j-1];
                }else if (j==0) {
                    dp[i][j] = arr[i][j]+dp[i-1][j];
                }else{
                    dp[i][j] = arr[i][j]+Math.min(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[m-1][n-1];
    }
}
// using dp also tabulation