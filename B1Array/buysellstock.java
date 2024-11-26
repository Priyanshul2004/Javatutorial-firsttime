package B1Array;

public class buysellstock {
    public static void main(String[] args) {
        int[] prize = { 7, 1, 5, 3, 6, 4 };
        int buy = Integer.MAX_VALUE;
        int sellingDay = -1;
        int maxprofit = 0;

        for (int i = 0; i < prize.length; i++) {
            if (prize[i] > buy) {
                int profit = prize[i] - buy;
                if (profit > maxprofit) {
                    maxprofit = profit;
                    sellingDay = prize[i];
                }
            } else {
                buy = prize[i];
            }
        }
        System.out.println("buy a product in "+buy);
        System.out.println("sell a product in "+sellingDay);
    }
}
