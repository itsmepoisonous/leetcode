package com.remove.duplicates.from.sorted.array2;

class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int i = 2;
        for (int j = 2; j < nums.length; j++) {
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public int removeDuplicatesInitialSolution(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0, match = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                if (match != 0) match = 0;
                i++;
                nums[i] = nums[j];
            } else if (nums[j] == nums[i] && match == 0) {
                match++;
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}

