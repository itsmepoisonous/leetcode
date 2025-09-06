package com.remove.duplicates.from.sorted.array2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testRemoveDuplicatesExample1() {
        Solution sol = new Solution();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = sol.removeDuplicates(nums);
        int[] expectedNums = {1, 1, 2, 2, 3};
        
        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    void testRemoveDuplicatesExample2() {
        Solution sol = new Solution();
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int k = sol.removeDuplicates(nums);
        int[] expectedNums = {0, 0, 1, 1, 2, 3, 3};
        
        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    void testRemoveDuplicatesSingleElement() {
        Solution sol = new Solution();
        int[] nums = {5};
        int k = sol.removeDuplicates(nums);
        int[] expectedNums = {5};
        
        assertEquals(expectedNums.length, k);
        assertEquals(expectedNums[0], nums[0]);
    }

    @Test
    void testRemoveDuplicatesAllUnique() {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, 4, 5};
        int k = sol.removeDuplicates(nums);
        int[] expectedNums = {1, 2, 3, 4, 5};
        
        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
}
