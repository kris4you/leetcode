package com.learning;

public class InsertPosition {
    
     public static int searchInsert(int[] nums, int target) {

            for(int i=0;i<nums.length;i++){

                if(target==nums[i]){
                    return i;
                }else{
                    if(target<nums[i]){
                        return i;
                    }
                }
            }

            return nums.length;
    }
    public static void main(String[] args) {
        
        System.out.println(searchInsert(new int[]{1,3,5,6}, 0));
    }
}
