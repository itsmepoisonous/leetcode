package com.remove.duplicates.from.sorted.array;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public int removeDuplicatesSecond(int[] nums) {
        List<Integer> expectedList=new ArrayList<>();
        expectedList.add(nums[0]);

        for(int i=1;i<nums.length;i++){
            if (nums[i] != nums[i - 1])
                expectedList.add(nums[i]);
        }
        for (int i = 0; i < expectedList.size(); i++) {
            nums[i] = expectedList.get(i);
        }
        return expectedList.size();
    }
    public int removeDuplicatesInitial(int[] nums) {
        List<Integer> expectedList=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!expectedList.contains(nums[i]))
                expectedList.add(nums[i]);
        }
        for (int i = 0; i < expectedList.size(); i++) {
            nums[i] = expectedList.get(i);
        }
        return expectedList.size();
    }
}
