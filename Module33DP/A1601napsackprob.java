package Module33DP;
public class A1601napsackprob {

    public static int profit(int i,int[] wt,int[] val,int capacity){
        if (i==wt.length) {
            return 0;
        }
        int skip = profit(i+1, wt, val, capacity);
        if (wt[i]>capacity) {
            return skip;
        }
        int pick = val[i]+profit(i+1, wt, val, capacity-wt[i]);
        return Math.max(pick, skip);
    }

    public static void main(String[] args) {
        int[] val = {5,3,9,16};
        int[] wt = {1,2,8,10};
        int capacity = 8;
        System.out.println(profit(0, wt, val, capacity));
    }
}