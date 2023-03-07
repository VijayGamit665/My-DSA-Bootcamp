package com.dsa.array;

public class BuyAndSellStocks {

    //   Time Complex city = o(n)

    public static void main(String[] args) {
        int Prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(bestTimmeSellStock(Prices));
    }

    public static int bestTimmeSellStock(int Prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < Prices.length; i++) {
            if (buyPrice < Prices[i]) {             //  profit
                int Profit = Prices[i] - buyPrice; //   today's profit
                maxprofit = Math.max(maxprofit, Profit);
            } else {
                buyPrice = Prices[i];
            }
        }
        return maxprofit;
    }
}
