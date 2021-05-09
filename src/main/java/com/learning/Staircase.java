package com.learning;

public class Staircase {

    public static int countSteps(int n) {

        if (n == 0)
            return 1;
        if (n < 0)
            return 0;

        return countSteps(n - 1) + countSteps(n - 2) + countSteps(n - 3);
    }

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
        System.out.println(climbStairs(3));
        System.out.println(countSteps(3));
    }

}
