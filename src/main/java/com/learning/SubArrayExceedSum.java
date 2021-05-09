package com.learning;

public class SubArrayExceedSum {

    public static int minSubArrayLen(int target, int[] nums) {

        int result = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            while (sum >= target) {
                result = Math.min(result, i - left + 1);
                sum -= nums[left];
                left++;
            }

        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(10, new int[] { 1, 2, 3, 4 }));
    }
}
