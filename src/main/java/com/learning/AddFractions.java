package com.learning;

import java.util.Arrays;

/***
 * 
 * 1.calucate GCD
 */
public class AddFractions {

    public static int[] addFraction(int[] fraction1, int[] fraction2) {

        // int lcd= getLcd(fraction1[1], fraction2[1]);
        int num = (fraction1[0] * fraction2[1]) + (fraction2[0] * fraction1[1]);
        int deno = (fraction1[1] * fraction2[1]);
        int gcd2 = getGCD(num, deno);
        return new int[] { num / gcd2, deno / gcd2 };
    }

    private static int getGCD(int a, int b) {

        int min = Math.min(a, b);
        while (min > 1) {

            if (a % min == 0 && b % min == 0) {
                return min;
            } else {
                min--;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(addFraction(new int[] { 2, 3 }, new int[] { 1, 2 })));
        System.out.println(Arrays.toString(addFraction(new int[] { 1, 2 }, new int[] { 3, 2 })));
        System.out.println(Arrays.toString(addFraction(new int[] { 1, 3 }, new int[] { 3, 9 })));
    }
}
