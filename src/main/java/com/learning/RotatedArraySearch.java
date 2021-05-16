package com.learning;

public class RotatedArraySearch {

    //
    public static int search(int[] nums, int target) {

        return binarySearch(nums, target, 0, nums.length - 1);

    }

    private static int binarySearch(int[] nums, int target, int i, int length) {

        if (i > length) {
            return -1;
        }
        int mid = (i + length) / 2;
        if (nums[mid] == target) {
            return mid;
        }

        if (nums[i] <= nums[mid]) {

            if (target >= nums[i] && target <= nums[mid]) {

                return binarySearch(nums, target, i, mid);
            }
            return binarySearch(nums, target, mid + 1, length);
        }
        if (target >= nums[mid] && target <= nums[length]) {
            return binarySearch(nums, target, mid, length);
        }

        return binarySearch(nums, target, i, mid - 1);

    }

    public static void main(String[] args) {

        // System.out.println(search(new int[] { 1, 2, 3, 4, 5, 6 }, 5));
        // System.out.println(search(new int[] { 1 }, 1));
        // System.out.println(search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
        System.out.println(search(new int[] { 3, 1 }, 3));
    }
}
