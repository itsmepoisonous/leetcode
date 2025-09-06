package com.array.rotate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class SolutionTest {

    @Test
    void testExample1() {
        Solution sol = new Solution();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        sol.rotate(nums, k);
        assertArrayEquals(new int[]{5,6,7,1,2,3,4}, nums);
    }

    @Test
    void testExample2() {
        Solution sol = new Solution();
        int[] nums = {-1,-100,3,99};
        int k = 2;
        sol.rotate(nums, k);
        assertArrayEquals(new int[]{3,99,-1,-100}, nums);
    }

    @Test
    void testKZero() {
        Solution sol = new Solution();
        int[] nums = {1,2,3,4};
        int k = 0;
        sol.rotate(nums, k);
        assertArrayEquals(new int[]{1,2,3,4}, nums);
    }

    @Test
    void testKGreaterThanLength() {
        Solution sol = new Solution();
        int[] nums = {1,2,3};
        int k = 4; // same as rotating 1 step
        sol.rotate(nums, k);
        assertArrayEquals(new int[]{3,1,2}, nums);
    }

    @Test
    void testSingleElement() {
        Solution sol = new Solution();
        int[] nums = {10};
        int k = 100; // rotation does nothing
        sol.rotate(nums, k);
        assertArrayEquals(new int[]{10}, nums);
    }

    @Test
    void testTwoElements() {
        Solution sol = new Solution();
        int[] nums = {1,2};
        int k = 1;
        sol.rotate(nums, k);
        assertArrayEquals(new int[]{2,1}, nums);
    }
}

