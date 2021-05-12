package com.learning;

public class MedianofSortedArray {

    public static double findMedianSortedArrays(int[] num1, int[] num2) {

        double result = 0d;
        if (num1.length > num2.length) {
            return findMedianSortedArrays(num2, num1);
        }
        int x = num1.length;
        int y = num2.length;
        int low = 0;
        int high = x;

        while (low < high) {
            int partitionX = (low + high) / 2;
            int partitionY = (x + y + 1) / 2 - x;

            int minLeftX = (partitionX == 0) ? Integer.MIN_VALUE : num1[partitionX - 1];
            int maxRightX = (partitionX == x) ? Integer.MAX_VALUE : num1[partitionX];

            int minLeftY = (partitionY == 0) ? Integer.MIN_VALUE : num2[partitionY - 1];
            int maxRightY = (partitionY == y) ? Integer.MAX_VALUE : num2[partitionY];

            if (minLeftX <= maxRightY && minLeftY <= maxRightX) {
                if ((x + y) % 2 == 0) {
                    return ((double) Math.max(minLeftX, minLeftY) + Math.min(maxRightX, maxRightY)) / 2;
                } else {
                    return (double) Math.max(minLeftX, minLeftY);
                }
            } else if (minLeftX > maxRightY) { // we are too far on right side for partitionX. Go on left side.
                high = partitionX - 1;
            } else { // we are too far on left side for partitionX. Go on right side.
                low = partitionX + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 }));

    }
}

// rewardsinquiry v2- aggrigation
