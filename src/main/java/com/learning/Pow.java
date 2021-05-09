package com.learning;

public class Pow {

    public static double myPow(double x, int n) {
        if (n == 0)
            return 1.0;

        if (n < 0) {
            return 1 / (x * myPow(x, -(n + 1)));
        }

        if (n % 2 == 0) {// n is even
            return myPow(x * x, n / 2);
        } else {// odd
            return x * myPow(x * x, (n - 1) / 2);
        }

    }

    public static void main(String[] args) {

        System.out.println(myPow(2, 3));
    }
}
