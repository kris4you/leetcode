package com.learning;

import java.util.HashMap;
import java.util.Map;

public class CircularArray {

    private static int circularLength(int[] nums, int index) {

        int count = 0;
        Map<Integer, Integer> entries = new HashMap<>();

        while (!entries.containsKey(index)) {

            entries.put(index, count++);
            index = nums[index];
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(circularLength(new int[] { 1, 2, 0 }, 0));
        System.out.println(circularLength(new int[] { 1, 0 }, 0));
        System.out.println(circularLength(new int[] { 1, 2, 1, 1 }, 0));
        ;
    }
}
