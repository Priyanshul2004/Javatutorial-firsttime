package Module34dp2;

public class A8coinchange {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5}; 
        int amount = 11;
        int result = coinchange(coins, amount);
        System.out.println("Minimum coins needed: " + result);
    }
    public static long coincount(int i,int[] coins,int amount){
        if (i==coins.length) {
            if (amount == 0) {
                return 0;
            }else{
                return Integer.MAX_VALUE;
            }
        }
        long skip = coincount(i+1, coins, amount);
        if (amount-coins[i]<0) {
            return skip;
        }
        long pick = 1+coincount(1, coins, amount-coins[i]);
        if (amount-coins[i]<0) {
            return skip;
        }
        return Math.min(skip, pick);
    }
    public static int coinchange(int[] coins,int amount){
        int ans =  (int)coincount(0, coins, amount);
        if (ans == Integer.MAX_VALUE) {
            return -1;
        }
        return ans;
    }
}