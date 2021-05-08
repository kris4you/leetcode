package com.learning;

public class DistanceStrings {

    public static void main(String[] args) {
        String s = "geeks for geeks contribute practice";
        String w1 = "geeks";
        String w2 = "practice";
        System.out.println(distance(s, w1, w2));

        System.out.println(distance("the quick the brown quick brown the frog", "quick", "frog"));
        // This code is contributed by princiRaj1992
    }

    private static int distance(String s, String w1, String w2) {
        String[] words = s.split(" ");
        int minDistance = words.length + 1;

        for (int i = 0; i < words.length; i++) {

            if (words[i].equals(w1)) {
                int k = i + 1;
                while (k < words.length) {
                    if (words[k].equals(w2)) {
                        int currDistance = k - i - 1;
                        if (currDistance < minDistance) {
                            minDistance = currDistance;
                        }
                    }
                    k++;
                }
            }

        }
        return minDistance;
    }
}
