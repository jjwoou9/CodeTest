package org.example.CodeTests;

public class MaxProfit implements TestCode<Integer, int[]> {
    /*
    * You are given an array prices where prices[i] is the price of a given stock on the ith day.
    * You want to maximize your profit by choosing a single day to buy one stock
    * and choosing a different day in the future to sell that stock.
    * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
    * */

    // array에서 오른쪽 - 왼쪽이 가장 큰 것을 구해야함.
    // => price[i] 뒤에 숫자중에 find biggest num right
    public int maxProfit(int[] prices) {
        int profit = 0;

        for(int i=0; i < prices.length; i++ ){
            int price = prices[i];
            int max = price;

            for(int j= i+1; j< prices.length; j++){
                max = prices[j] > max ? prices[j] : max;
                int temp = max - price;
                profit = temp > profit ? temp : profit;
            }
        }

        return profit;
    }

    @Override
    public Integer test(int[] value) {
        
        return this.maxProfit(value);
    }
}
