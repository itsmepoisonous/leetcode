package com.array.majority;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public int majorityElement(int[] nums) {
        int majorityCount = 1, majorityElement = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (majorityCount == 0) {
                majorityElement = nums[i];
                majorityCount = 1;
            } else if (nums[i] == majorityElement) {
                majorityCount++;
            } else {
                majorityCount--;
            }
        }
        return majorityElement;
    }

    public int majorityElementInitial(int[] nums) {
        int arrLength = nums.length;
        Map<Integer, Integer> majorityMap = new HashMap<>();
        majorityMap.put(nums[0], 1);
        for (int i = 1; i < arrLength; i++) {
            if (majorityMap.containsKey(nums[i])) {
                int a = majorityMap.get(nums[i]);
                a += 1;
                majorityMap.put(nums[i], a);
            } else majorityMap.put(nums[i], 1);
        }
        for (Map.Entry<Integer, Integer> entry : majorityMap.entrySet()) {
            if (entry.getValue() > arrLength / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }
}