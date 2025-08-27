package com.remove.elements;
class Solution {

    public int removeElement(int[] nums, int val) {
        int i = 0, j = nums.length - 1;

        while (i <= j) {
            if (nums[i] == val) {
                if (i != j) nums[i] = nums[j];
                j--;
            } else {
                i++;
            }
        }
        return j + 1;
    }
    public int removeElementInitial(int[] nums, int val) {
        int numsLength = nums.length;
        int i = 0, j = numsLength - 1;
        if(numsLength==0) return 0;
        if (numsLength == 1) {
            if (nums[0] == val) {
                nums[0] = -1;
                return 0;
            } else {
                return 1;
            }
        }
        while (i < nums.length && i <= j) {
            if (nums[i] == val) {
                if (nums[j] == val) {
                    nums[j] = -1;
                    j--;
                } else {
                    nums[i] = nums[j];
                    nums[j] = -1;
                    j--;
                    i++;
                }
            } else {
                i++;
            }

        }
        return j + 1;
    }
}