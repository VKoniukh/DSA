package com.example.dsa.problems.arrays.easy;

public class MaxProfit {
    /*The algorithm tracks the minimum stock price and the maximum potential profit in a single
    pass through the stock prices array. It updates the minimum price whenever a lower price is encountered,
    and calculates potential profit by subtracting this minimum price from the current price.
    If this potential profit exceeds the previously recorded maximum profit, it updates the maximum profit.
     This ensures the best buy and sell points are identified to maximize profit with only one transaction.*/

    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }

    //OR
    public static int maxProfit2(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices) {
            if(price < minPrice) {
                minPrice = price;
            }

            if(price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
