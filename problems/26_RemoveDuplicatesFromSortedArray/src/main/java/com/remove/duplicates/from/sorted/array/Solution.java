package com.remove.duplicates.from.sorted.array;

import java.util.ArrayList;
import java.util.List;

/*package com.remove.duplicates.from.sorted.array;*/
class Solution {
    public int removeDuplicates(int[] nums) {
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
