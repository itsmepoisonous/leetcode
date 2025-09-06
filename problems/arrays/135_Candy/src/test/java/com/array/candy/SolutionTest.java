package com.array.candy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    // Assume the actual solution method is in a class called Solution
    Solution solution = new Solution();

    @Test
    public void testExample1() {
        int[] ratings = {1, 0, 2};
        int expected = 5; // candies distribution: [2,1,2]
        assertEquals(expected, solution.candy(ratings), "Example 1 failed");
    }

    @Test
    public void testExample2() {
        int[] ratings = {1, 2, 2};
        int expected = 4; // candies distribution: [1,2,1]
        assertEquals(expected, solution.candy(ratings), "Example 2 failed");
    }

    @Test
    public void testAllEqualRatings() {
        int[] ratings = {3, 3, 3, 3};
        int expected = 4; // all get 1 candy each
        assertEquals(expected, solution.candy(ratings), "All equal ratings failed");
    }

    @Test
    public void testIncreasingRatings() {
        int[] ratings = {1, 2, 3, 4, 5};
        int expected = 15; // distribution: [1,2,3,4,5]
        assertEquals(expected, solution.candy(ratings), "Increasing ratings failed");
    }

    @Test
    public void testDecreasingRatings() {
        int[] ratings = {5, 4, 3, 2, 1};
        int expected = 15; // distribution: [5,4,3,2,1]
        assertEquals(expected, solution.candy(ratings), "Decreasing ratings failed");
    }

    @Test
    public void testPeakRatings() {
        int[] ratings = {1, 3, 2, 2, 1};
        int expected = 7; // distribution: [1,2,1,2,1]
        assertEquals(expected, solution.candy(ratings), "Peak ratings failed");
    }

    @Test
    public void testValleyRatings() {
        int[] ratings = {2, 1, 2, 1, 2};
        int expected = 7; // distribution: [2,1,2,1,2]
        assertEquals(expected, solution.candy(ratings), "Valley ratings failed");
    }

    @Test
    public void testSingleChild() {
        int[] ratings = {5};
        int expected = 1; // only one child, gets 1 candy
        assertEquals(expected, solution.candy(ratings), "Single child failed");
    }
}

