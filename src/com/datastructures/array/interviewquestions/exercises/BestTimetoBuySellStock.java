package com.datastructures.array.interviewquestions.exercises;

public class BestTimetoBuySellStock {
    // You are given an array prices where prices[i] is the price of a given stock on the ith day.
    // You want to maximize your profit by choosing a single day to buy one stock and choosing a different
    // day in the future to sell that stock. Return the maximum profit you can achieve from this transaction.
    // If you cannot achieve any profit, return 0.
    //    Example:
    //
    //    Input: prices = [7, 1, 5, 3, 6, 4]
    //    Output: 5
    //    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.

    public static int maxProfit(int[] prices) {
        int profitMax = 0;
        int diff = 0;
        //l1
        for(int i=0; i<prices.length; i++) {
            //l2
            for(int j=i+1; j<prices.length; j++) {
                diff = prices[j] - prices[i];
                if(diff<0){
                    diff = 0;
                    break;
                } else if (diff>profitMax) {
                    profitMax=diff;
                }
            }
        }
        System.out.println("the max prof is "+profitMax);
        return profitMax;
    }

    public static void main(String[] args) {
        maxProfit(new int[]{7, 1, 5, 3, 6, 4});
    }

}
