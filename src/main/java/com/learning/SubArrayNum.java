package com.learning;

import java.util.HashMap;
import java.util.Map;

public class SubArrayNum {
    
 public static int subarraySum(int[] nums, int k) {
       
        int count=0;
        int currSum=0;
        Map<Integer,Integer> countMap=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
          
            currSum+=nums[i];
            if(currSum==k){
                count++;
            }
           count+=countMap.getOrDefault(currSum-k,0);
          
            countMap.put(currSum,countMap.getOrDefault(currSum,0)+1);
            
        }
        return count;
    }

    

    public static void main(String[] args) {
        
        System.out.println(subarraySum(new int[]{0,0}, 0));
        ;
    }
}
