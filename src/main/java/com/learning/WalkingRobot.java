package com.learning;

public class WalkingRobot {

    public static void main(String[] args) {

        robomovement("UDDLLRUUUDUURUDDUULLDRRRR");
        robomovement("UUU");

    }

    public static void robomovement(String str) {

        int i = 0;
        str = str.toUpperCase();
        int x = 0, y = 0;
        while (i < str.length()) {

            switch (str.charAt(i)) {

            case 'U':
                y++;
                break;
            case 'D':
                y--;
                break;
            case 'L':
                x--;
                break;
            case 'R':
                x++;
                break;
            }
            i++;
        }
        System.out.println(x + " " + y);
    }
}
