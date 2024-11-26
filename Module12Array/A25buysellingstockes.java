package Module12Array;

public class A25buysellingstockes {
    public static void main(String[] args) {
        int[] prizes = {7,1,5,3,6,4};
        int buyprize = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < prizes.length; i++) {
            if (prizes[i] > buyprize) {
                int profit = prizes[i] - buyprize;
                maxprofit = Math.max(maxprofit, profit);
            }else{
                buyprize = prizes[i];
            }
        }

        System.out.println("buying day "+buyprize);
        

        System.out.println(maxprofit);
    }
}
