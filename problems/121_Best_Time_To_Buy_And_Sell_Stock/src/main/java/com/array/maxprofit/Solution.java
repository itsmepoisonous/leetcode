package com.array.maxprofit;

class Solution {
    public int maxProfit(int[] prices) {
        //{7, 1, 5, 3, 6, 4}
        int max = 0, min = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min) {
                min = price;
            } else {
                max = Math.max(max, price - min);
            }
        }
        return max;
    }
}
