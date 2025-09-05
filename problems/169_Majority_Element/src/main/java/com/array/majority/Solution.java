package com.array.majority;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> majorityMap=new HashMap<>();
        majorityMap.put(nums[0],1);
        for(int i=0;i< nums.length;i++){
        if(majorityMap.containsKey(nums[i])){
            int a=majorityMap.get(nums[i]);
            majorityMap.put(nums[i],a+1);
            if(++a>=nums.length/2)
                return nums[i];
        }
        else majorityMap.put(nums[i],1);

        }
        return nums[0];
    }
}