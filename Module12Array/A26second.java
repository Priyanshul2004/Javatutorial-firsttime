package Module12Array;

public class A26second {
    public static void main(String[] args) {
        int[] prizes = {7, 1, 5, 3, 6, 4};
        int buyprize = Integer.MAX_VALUE;
        int maxprofit = 0;
        int sellingDay = -1; 

        for (int i = 0; i < prizes.length; i++) {
            if (prizes[i] > buyprize) {
                int profit = prizes[i] - buyprize;
                if (profit > maxprofit) {
                    maxprofit = profit;
                    sellingDay = prizes[i]; 
                }
            } else {
                buyprize = prizes[i];
            }
        }

        System.out.println("Buying price: " + buyprize);
        System.out.println("Selling day: " + sellingDay);
        System.out.println("Max profit: " + maxprofit);
    }
}