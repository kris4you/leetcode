package com.learning;

public class DistanceStrings {

    public static void main(String[] args) {
        String s = "This is a sample document we just made up";
        String w1 = "we";
        String w2 = "just";
        System.out.println(distance(s, w1, w2));
        System.out.println(distance(s, "is", "a"));
        System.out.println(distance(s, "is", "not"));

    }

    private static double distance(String s, String w1, String w2) {
        String[] words = s.split("[,. ]");
        double distance = s.length();
        double loc1 = 0;
        double loc2 = 0;
        int i = 0;

        for (String word : words) {

            if (word.equals(w1)) {
                loc1 = i + (word.length() / 2d);
            } else if (word.equals(w2)) {
                loc2 = i + (word.length() / 2d);
            }
            if (loc1 > 0 && loc2 > 0) {
                if (loc2 - loc1 < distance) {
                    distance = loc2 - loc1;
                }
            }
            i += word.length() + 1;
        }
        if (loc1 == 0 || loc2 == 0) {
            return -1;
        }
        return distance;
    }
}
