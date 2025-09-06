package com.array.maxprofit2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void testExample1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = solution.maxProfit(prices);
        assertEquals(7, result, "Expected profit is 7");
    }

    @Test
    void testExample2() {
        int[] prices = {1, 2, 3, 4, 5};
        int result = solution.maxProfit(prices);
        assertEquals(4, result, "Expected profit is 4");
    }

    @Test
    void testExample3() {
        int[] prices = {7, 6, 4, 3, 1};
        int result = solution.maxProfit(prices);
        assertEquals(0, result, "Expected profit is 0");
    }

    @Test
    void testSingleDay() {
        int[] prices = {5};
        int result = solution.maxProfit(prices);
        assertEquals(0, result, "Only one day, profit should be 0");
    }

    @Test
    void testTwoDaysProfit() {
        int[] prices = {3, 8};
        int result = solution.maxProfit(prices);
        assertEquals(5, result, "Buy on day 1, sell on day 2, profit 5");
    }

    @Test
    void testTwoDaysNoProfit() {
        int[] prices = {10, 7};
        int result = solution.maxProfit(prices);
        assertEquals(0, result, "Prices only go down, profit should be 0");
    }

    @Test
    void testRandomCase() {
        int[] prices = {1, 7, 2, 5, 3, 6};
        int result = solution.maxProfit(prices);
        assertEquals(12, result, "Multiple transactions for max profit");
    }
}
