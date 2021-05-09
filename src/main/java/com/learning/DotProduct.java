package com.learning;

public class DotProduct {

    public static int dotProduct(int[] a, int[] b) {

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i] * b[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(dotProduct(new int[] { 1, 2 }, new int[] { 2, 3 }));
    }
}

// This is a sample document we just made up
// index :23 word 22 word2 25