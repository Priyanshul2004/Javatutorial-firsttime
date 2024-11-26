package Module34dp2;

public class A4a3usingdp {
    static int sum;
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1};
        int target = 3;
        int result = findtargetsunways(arr, target);
        System.out.println("Number of ways to achieve the target sum: " + result);
    }
    public static int ways(int i,int[] arr,int res,int target,int[][] dp){
        if (i==arr.length) {
            if (target == res) {
                return 1;
            }else{
                return 0;
            }
        }
        if (dp[i][res+sum]!=-1) {
            return dp[i][res+sum];
        }
        int add = ways(i+1, arr, res+arr[i],target,dp);
        int sub = ways(i+1, arr, res-arr[i],target,dp);
        return add+sub;
    }
    public static int findtargetsunways(int[] arr,int target){
        sum = 0;
        int n = arr.length;
        for(int ele:arr){
            sum += ele;
        }
        int [][] dp = new int[n][2*sum+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        return  ways(0, arr,0, target,dp);
    }
}