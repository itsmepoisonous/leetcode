package com.array.jump;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    // Assume the actual solution method is in a class called Solution
    Solution solution = new Solution();

    @Test
    public void testExample1() {
        int[] nums = {2, 3, 1, 1, 4};
        assertTrue(solution.canJump(nums), "Example 1 should return true");
    }

    @Test
    public void testExample2() {
        int[] nums = {3, 2, 1, 0, 4};
        assertFalse(solution.canJump(nums), "Example 2 should return false");
    }

    @Test
    public void testSingleElement() {
        int[] nums = {0};
        assertTrue(solution.canJump(nums), "Single element array should return true");
    }

    @Test
    public void testAllOnes() {
        int[] nums = {1, 1, 1, 1, 1};
        assertTrue(solution.canJump(nums), "Array of all ones should return true");
    }

    @Test
    public void testZeroAtStart() {
        int[] nums = {0, 1, 2, 3};
        assertFalse(solution.canJump(nums), "Array starting with 0 and length > 1 should return false");
    }

    @Test
    public void testLargeJumpAtStart() {
        int[] nums = {5, 1, 0, 0, 0};
        assertTrue(solution.canJump(nums), "Large first jump should allow reaching the end");
    }

    @Test
    public void testZerosInMiddle() {
        int[] nums = {2, 0, 0, 1};
        assertTrue(solution.canJump(nums), "Zeros in middle should still be reachable if jumps allow");
    }
}

