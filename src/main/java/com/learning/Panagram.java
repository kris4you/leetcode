package com.learning;

public class Panagram {

    public static boolean checkIfPangram(String s) {

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arr[c - 'a'] += 1;

        }
        for (int i : arr) {
            if (i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
}
