package Module34dp2;

public class A2second {
    public static void main(String[] args) {
        int[]  arr = {8,5,2,4};
        int target = 9;
        int[][] dp = new int[arr.length][target+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(subset(0,arr,target,dp));
    }
    public static boolean subset(int i,int[] arr,int target,int[][] dp){
        if (i == arr.length) {
            if (0 == target) {
                return true;
            }else{
                return false;
            }
        }
        if (dp[i][target]!=-1) {
            return (dp[i][target] == 1);
        }
        boolean ans = false;
        boolean skip = subset(i+1, arr, target,dp);
        if (target-arr[i]<0) {
            ans = skip;
        }else{
            boolean pick = subset(i+1, arr, target-arr[i],dp);
            ans = pick || skip;
        }
        return ans;
    }
}