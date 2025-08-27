package com.remove.duplicates.from.sorted.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*package com.remove.duplicates.from.sorted.array;*/

public class SolutionTest {

    Solution solution = new Solution();
    @Test
    public void testExample1() {
        int[] nums = {1, 1, 2};
        int[] expectedNums = {1, 2};
        int k = solution.removeDuplicates(nums);  // Assuming your solution class is named Solution

        assertEquals(expectedNums.length, k, "Returned length should match expected");
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i], "Mismatch at index " + i);
        }
    }

    @Test
    public void testExample2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = {0, 1, 2, 3, 4};

        int k = solution.removeDuplicates(nums);

        assertEquals(expectedNums.length, k, "Returned length should match expected");
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i], "Mismatch at index " + i);
        }
    }

    @Test
    public void testSingleElement() {
        int[] nums = {5};
        int[] expectedNums = {5};

        int k = solution.removeDuplicates(nums);

        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    public void testAllDuplicates() {
        int[] nums = {2, 2, 2, 2, 2};
        int[] expectedNums = {2};

        int k = solution.removeDuplicates(nums);

        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    public void testNoDuplicates() {
        int[] nums = {1, 2, 3, 4, 5};
        int[] expectedNums = {1, 2, 3, 4, 5};

        int k = solution.removeDuplicates(nums);

        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
}
