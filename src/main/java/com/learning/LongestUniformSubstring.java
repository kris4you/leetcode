package com.learning;

import java.util.Arrays;

public class LongestUniformSubstring {

    public static void main(String[] args) {
        int[] result = longestUniformSubstring("100011122222");
        int[] result2 = longestUniformSubstring("aabbbbCdAA");
        System.out.println(Arrays.toString(result));
    }

    private static int[] longestUniformSubstring(String string) {

        int index = 0;
        int length = string.length();
        int temp = 1;
        int count = 0;
        int result = 0;
        while (temp < length && index < length) {
            if (string.charAt(index) == string.charAt(temp)) {

                temp++;

            } else {
                if (temp - index > count) {
                    count = temp - index;
                    result = index;
                }
                index = temp;
            }
        }
        if (temp == length) {
            if (temp - index > count) {
                count = temp - index;
                result = index;
            }
        }
        return new int[] { result, count };
    }
}
