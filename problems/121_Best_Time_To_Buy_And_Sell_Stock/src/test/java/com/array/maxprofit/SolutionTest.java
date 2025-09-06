package com.array.maxprofit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void testExample1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = solution.maxProfit(prices);
        assertEquals(5, result, "Expected profit is 5");
    }

    @Test
    void testExample2() {
        int[] prices = {7, 6, 4, 3, 1};
        int result = solution.maxProfit(prices);
        assertEquals(0, result, "Expected profit is 0");
    }

    @Test
    void testSingleElement() {
        int[] prices = {5};
        int result = solution.maxProfit(prices);
        assertEquals(0, result, "With only one day, profit should be 0");
    }

    @Test
    void testIncreasingPrices() {
        int[] prices = {1, 2, 3, 4, 5};
        int result = solution.maxProfit(prices);
        assertEquals(4, result, "Buy at 1 and sell at 5 for profit 4");
    }

    @Test
    void testDecreasingPrices() {
        int[] prices = {9, 8, 7, 6, 5};
        int result = solution.maxProfit(prices);
        assertEquals(0, result, "Prices only go down, profit should be 0");
    }

    @Test
    void testRandomCase() {
        int[] prices = {3, 2, 6, 1, 4};
        int result = solution.maxProfit(prices);
        assertEquals(4, result, "Buy at 2 and sell at 6 for profit 4");
    }
}


