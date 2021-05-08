package com.learning;

public class RunlengthEncoding {

    public static void printRLE(String s) {

        String t = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 1;

            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            t += s.charAt(i) + "" + (count > 1 ? count : "");
        }
        System.out.println(t);
    }

    public static void main(String[] args) {

        printRLE("wwwwaaadexxxxxxywww");
    }
}
