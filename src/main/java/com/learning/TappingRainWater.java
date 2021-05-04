package com.learning;

public class TappingRainWater {
    
     public static int trap(int[] height) {
        
        int ans=0;
        int lr=0,right=height.length-1;
        int lmax=0,rmax=0;
       
        while(lr<=right){
            if(height[lr]<height[right]){
                if(lmax<=height[lr]){
                    lmax=height[lr];
                }else{
                    ans+=lmax-height[lr];
                }
                lr++;

            }else{
                if(rmax<height[right]){
                    rmax=height[right];
                }else{
                    ans+=rmax-height[right];
                }
                right--;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
