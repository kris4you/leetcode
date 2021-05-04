package com.learning;

public class TotalWater {
    
     public static int maxArea(int[] height) {
        
        int result=0;
        int k=height.length-1;
        for(int i=0;i<height.length &&k>0;){
            
                int temp=height[i]>=height[k]?height[k]:height[i];
            
            
                if(result<(temp*(k-i))){
                    result=temp*(k-i);
                  
                }else if(height[i]>height[k]){
                    k--;
                }else if(height[i]<height[k]){
                    i++;
                }else{
                    k--;
                    i++;
                }
                
        }
        
        return result;
    }

    public static void main(String[] args) {
        
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
