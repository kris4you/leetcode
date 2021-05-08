package com.learning;

public class StringCompression {

    public static int compress(char[] chars) {

        String s = "";

        int i = 0;
        int index = i + 1;

        while (i < chars.length) {

            while (index < chars.length && chars[i] == chars[index]) {
                index++;
            }
            s += chars[i];
            if (index - i > 1) {
                s += index - i;
            }
            i = index;
            index = i + 1;
        }

        chars = s.toCharArray();
        return s.length();
    }

    public static void main(String[] args) {

        System.out.println(compress(new char[] { 'a', 'a', 'b', 'b', 'c', 'c', 'c' }));
    }
}
