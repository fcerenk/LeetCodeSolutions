package com.example.spring.twosumapp.Service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TwoSumService {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); //map interface hashmap its implementation

        for(int i =0; i<nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                //this method check whether key on map or not,here check complement num is on map before
                return new int[]{map.get(complement), i};
                //if we have complement before on map , return with get its index, i is other num index
            }
            map.put(nums[i], i);
            //if we do not have complement before , assign current num and its index on map after that search complement
            //first nums[i] after its index on map,hashmap
        }

        return null;
    }
}
