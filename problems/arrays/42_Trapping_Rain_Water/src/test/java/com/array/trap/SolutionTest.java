package com.array.trap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    // Assume the actual solution method is in a class called Solution
    Solution solution = new Solution();

    @Test
    public void testExample1() {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int expected = 6;
        assertEquals(expected, solution.trap(height), "Example 1 failed");
    }

    @Test
    public void testExample2() {
        int[] height = {4,2,0,3,2,5};
        int expected = 9;
        assertEquals(expected, solution.trap(height), "Example 2 failed");
    }

    @Test
    public void testAllZeros() {
        int[] height = {0,0,0,0};
        int expected = 0;
        assertEquals(expected, solution.trap(height), "All zeros failed");
    }

    @Test
    public void testIncreasingBars() {
        int[] height = {1,2,3,4,5};
        int expected = 0;
        assertEquals(expected, solution.trap(height), "Increasing bars failed");
    }

    @Test
    public void testDecreasingBars() {
        int[] height = {5,4,3,2,1};
        int expected = 0;
        assertEquals(expected, solution.trap(height), "Decreasing bars failed");
    }

    @Test
    public void testFlatBars() {
        int[] height = {3,3,3,3};
        int expected = 0;
        assertEquals(expected, solution.trap(height), "Flat bars failed");
    }

    @Test
    public void testSinglePit() {
        int[] height = {3,0,2};
        int expected = 2;
        assertEquals(expected, solution.trap(height), "Single pit failed");
    }

    @Test
    public void testMultiplePits() {
        int[] height = {0,2,0,4,0,3,0,1};
        int expected = 10;
        assertEquals(expected, solution.trap(height), "Multiple pits failed");
    }

    @Test
    public void testSingleBar() {
        int[] height = {5};
        int expected = 0;
        assertEquals(expected, solution.trap(height), "Single bar failed");
    }
}

