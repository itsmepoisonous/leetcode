package com.array.hindex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    // Assume the actual solution method is in a class called Solution
    Solution solution = new Solution();

    @Test
    public void testExample1() {
        int[] citations = {3, 0, 6, 1, 5};
        int expected = 3;
        assertEquals(expected, solution.hIndex(citations), "Example 1 failed");
    }

    @Test
    public void testExample2() {
        int[] citations = {1, 3, 1};
        int expected = 1;
        assertEquals(expected, solution.hIndex(citations), "Example 2 failed");
    }

    @Test
    public void testAllZeros() {
        int[] citations = {0, 0, 0, 0};
        int expected = 0;
        assertEquals(expected, solution.hIndex(citations), "All zeros should return 0");
    }

    @Test
    public void testAllSame() {
        int[] citations = {5, 5, 5, 5, 5};
        int expected = 5;
        assertEquals(expected, solution.hIndex(citations), "All same citations should return n");
    }

    @Test
    public void testSingleElement() {
        int[] citations = {10};
        int expected = 1;
        assertEquals(expected, solution.hIndex(citations), "Single element array should return 1 if >0");
    }

    @Test
    public void testIncreasingOrder() {
        int[] citations = {0, 1, 3, 5, 6};
        int expected = 3;
        assertEquals(expected, solution.hIndex(citations), "Increasing order array failed");
    }

    @Test
    public void testDecreasingOrder() {
        int[] citations = {6, 5, 3, 1, 0};
        int expected = 3;
        assertEquals(expected, solution.hIndex(citations), "Decreasing order array failed");
    }
}

