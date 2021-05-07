package com.learning;

public class ClimbStairs {

    public static int climbStairs(int n) {

        if (n < 3 || n > 45) {
            return n;
        }

        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;

    }

    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }

}
