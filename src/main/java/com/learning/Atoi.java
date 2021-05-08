package com.learning;

public class Atoi {

    public static void main(String[] args) {
        int num = atoi("-123456");
        System.out.println(num);
    }

    private static int atoi(String string) {
        int i = 0;
        boolean isNeg = false;
        int result = 0;
        if (string.charAt(0) == '-') {
            i++;
            isNeg = true;
        }
        while (i < string.length()) {
            int temp = string.charAt(i) - '0';
            if (temp >= 0 && temp <= 9) {
                result = result * 10 + temp;
            }
            i++;
        }
        if (isNeg)
            return result * -1;

        return result;

    }
}
