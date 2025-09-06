package com.array.rotate;

class Solution {
    public void rotate(int[] nums, int k) {
        int numLength = nums.length, i = numLength - (k % numLength);
        if (i == numLength) i = 0;
        if (numLength != 1) {
            int[] rotateNums = new int[numLength];
            for (int j = 0; j < numLength; j++, i++) {
                if (i >= numLength) i = 0;
                rotateNums[j] = nums[i];
            }
            System.arraycopy(rotateNums, 0, nums, 0, numLength);
        }
    }
}
