package com.learning;

public class Panagram {

    public static boolean checkIfPangram(String s) {

        int[] arr = new int[26];
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arr[c - 'a'] += 1;

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                result += (char) (i + 'a');
            }
        }

        if (result.equals("")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkIfPangram("abcde"));
    }
}
