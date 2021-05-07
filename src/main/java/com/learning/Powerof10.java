package com.learning;

public class Powerof10 {

    public static void main(String[] args) {
        System.out.println(isPowerOf10(1));
    }

    private static boolean isPowerOf10(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 10 == 0) {
            n /= 10;
        }
        return n == 1;
    }
}
