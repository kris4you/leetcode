package com.learning;

public class SecondSmallest {

    public static void main(String[] args) {
        System.out.println(findSmallest(new int[] { 5, 3, 2, 1, 39, 44, -23, -23 }));

        System.out.println(findSmallest(new int[] { 2, 2, 2 }));
        System.out.println(findSmallest(new int[] { 12, 13, 1, 10, 34, 1 }));
    }

    private static int findSmallest(int[] is) {

        int min = is[0];
        int secondMin = is[0];
        for (int i = 1; i < is.length; i++) {

            if (is[i] < min) {
                secondMin = min;
                min = is[i];
            } else if (is[i] < secondMin && min != is[i]) {
                secondMin = is[i];
            }
        }
        return secondMin;
    }

}
