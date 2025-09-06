package com.array.rotate;

class Solution {
    public void rotate(int[] nums, int k) {//reversal method
        int numsLength = nums.length;
        k %= numsLength;
        //Reverse whole array
        reverse(nums, 0, numsLength - 1);
        //Reverse left array 0 to k-1
        reverse(nums, 0, k - 1);
        //Reverse right array k to numsLength-1
        reverse(nums, k, numsLength - 1);
    }


    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            nums[left] += nums[right];
            nums[right] = nums[left] - nums[right];
            nums[left] -= nums[right];
            left++;
            right--;
        }
    }

    public void rotateCycleSolution(int[] nums, int k) {
        int numsLength = nums.length;
        int currentIndex, newIndex, currentIndexValue, lastIndexValue;
        for (int start = 0, count = 0; count < numsLength; start++) {
            currentIndex = start;
            currentIndexValue = nums[start];
            do {
                newIndex = (currentIndex + k) % numsLength;
                lastIndexValue = nums[newIndex];
                nums[newIndex] = currentIndexValue;
                currentIndexValue = lastIndexValue;
                currentIndex = newIndex;
                count++;
            } while (start != currentIndex);
        }
    }

    public void rotateInitialSolution(int[] nums, int k) {
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
