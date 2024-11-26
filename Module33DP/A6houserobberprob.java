package Module33DP;

import java.util.Arrays;

public class A6houserobberprob {
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        int result = rob(nums);
        System.out.println("Maximum amount that can be robbed: " + result);
    }
    public static int amount(int[] nums,int i,int[] dp){
        if (i>=nums.length) {
            return 0;
        }
        if (dp[i]!=-1) {
            return dp[i];
        }
        int take = nums[i]+amount(nums, i+2,dp);
        int skip = amount(nums, i+1,dp);
        return Math.max(take, skip);
    }
    public static int rob(int[] nums){
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return amount(nums,0,dp);
    }
}
//write main method only and dont use any comment on