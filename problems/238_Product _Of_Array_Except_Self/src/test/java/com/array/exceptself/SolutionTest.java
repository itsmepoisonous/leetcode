package com.array.exceptself;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class SolutionTest {

    // Assume the actual solution method is in a class called Solution
    Solution solution = new Solution();

    @Test
    public void testExample1() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, solution.productExceptSelf(nums), "Example 1 failed");
    }

    @Test
    public void testExample2() {
        int[] nums = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};
        assertArrayEquals(expected, solution.productExceptSelf(nums), "Example 2 failed");
    }

    @Test
    public void testAllOnes() {
        int[] nums = {1, 1, 1, 1};
        int[] expected = {1, 1, 1, 1};
        assertArrayEquals(expected, solution.productExceptSelf(nums), "All ones failed");
    }

    @Test
    public void testAllZeros() {
        int[] nums = {0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, solution.productExceptSelf(nums), "All zeros failed");
    }

    @Test
    public void testSingleZero() {
        int[] nums = {1, 2, 0, 4};
        int[] expected = {0, 0, 8, 0};
        assertArrayEquals(expected, solution.productExceptSelf(nums), "Single zero failed");
    }

    @Test
    public void testNegativeNumbers() {
        int[] nums = {-1, 2, -3, 4};
        int[] expected = {-24, 12, -8, 6};
        assertArrayEquals(expected, solution.productExceptSelf(nums), "Negative numbers failed");
    }

    @Test
    public void testTwoElements() {
        int[] nums = {5, 10};
        int[] expected = {10, 5};
        assertArrayEquals(expected, solution.productExceptSelf(nums), "Two elements array failed");
    }
}

