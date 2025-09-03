package com.array.majority;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    // Assume you have a class Solution with a method majorityElement(int[] nums)
    Solution solution = new Solution();

    @Test
    void testExample1() {
        int[] nums = {3, 2, 3};
        assertEquals(3, solution.majorityElement(nums));
    }

    @Test
    void testExample2() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        assertEquals(2, solution.majorityElement(nums));
    }

    @Test
    void testSingleElement() {
        int[] nums = {7};
        assertEquals(7, solution.majorityElement(nums));
    }

    @Test
    void testAllSame() {
        int[] nums = {5, 5, 5, 5, 5};
        assertEquals(5, solution.majorityElement(nums));
    }

    @Test
    void testMajorityAtEnd() {
        int[] nums = {1, 2, 3, 3, 3, 3};
        assertEquals(3, solution.majorityElement(nums));
    }

    @Test
    void testMajorityAtStart() {
        int[] nums = {4, 4, 4, 2, 2, 4, 1};
        assertEquals(4, solution.majorityElement(nums));
    }

    @Test
    void testNegativeNumbers() {
        int[] nums = {-1, -1, -1, 2, 2};
        assertEquals(-1, solution.majorityElement(nums));
    }

    @Test
    void testLargeInput() {
        int n = 10001;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = (i < 6000) ? 9 : 8; // 9 appears 6000 times (> 10001/2)
        }
        assertEquals(9, solution.majorityElement(nums));
    }
}
