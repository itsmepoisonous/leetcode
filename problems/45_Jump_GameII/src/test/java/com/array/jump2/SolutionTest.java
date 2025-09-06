package com.array.jump2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    // Assume the actual solution method is in a class called Solution
    Solution solution = new Solution();

    @Test
    public void testExample1() {
        int[] nums = {2, 3, 1, 1, 4};
        int expected = 2;
        assertEquals(expected, solution.minJumps(nums), "Test case 1 failed");
    }

    @Test
    public void testExample2() {
        int[] nums = {2, 3, 0, 1, 4};
        int expected = 2;
        assertEquals(expected, solution.minJumps(nums), "Test case 2 failed");
    }

    @Test
    public void testSingleElement() {
        int[] nums = {0};
        int expected = 0;
        assertEquals(expected, solution.minJumps(nums), "Single element array should return 0 jumps");
    }

    @Test
    public void testAllOnes() {
        int[] nums = {1, 1, 1, 1, 1};
        int expected = 4;
        assertEquals(expected, solution.minJumps(nums), "Array of all ones failed");
    }

    @Test
    public void testLargeJumpAtStart() {
        int[] nums = {5, 1, 1, 1, 1};
        int expected = 1;
        assertEquals(expected, solution.minJumps(nums), "Large first jump failed");
    }

    @Test
    public void testZerosInMiddle() {
        int[] nums = {3, 2, 1, 0, 4, 2};
        int expected = 3; // assuming it's reachable according to problem constraints
        assertEquals(expected, solution.minJumps(nums), "Zeros in middle failed");
    }
}


