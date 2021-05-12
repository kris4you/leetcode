package com.learning;

public class KnightAnalysis {

    public static boolean isValid(int i, int j, int n) {
        if (i >= 0 && j >= 0 && i < n && j < n) {
            return true;
        }
        return false;
    }

    public static double knightProbability(int n, int row, int column, int k) {

        double ans = 0.0;
        double[][] curr = new double[n][n];
        double[][] next = new double[n][n];
        int[] rp = new int[] { 2, 2, 1, 1, -1, -1, -2, -2 };
        int[] cp = new int[] { 1, -1, 2, -2, 2, -2, 1, -1 };

        curr[row][column] = 1;

        for (; k > 0; k--) {

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int pr = 0; pr < 8; pr++) {
                        int cr = i + rp[pr];
                        int cc = j + cp[pr];

                        if (isValid(cr, cc, n)) {
                            next[cr][cc] += curr[i][j] / 8.0;
                        }
                    }
                }
            }
            curr = next;
            next = new double[n][n];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans += curr[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(knightProbability(8, 0, 0, 0));
        System.out.println(knightProbability(8, 0, 0, 1));
        System.out.println(knightProbability(8, 3, 3, 1));
        System.out.println(knightProbability(8, 0, 0, 2));
        System.out.println(knightProbability(8, 0, 0, 1));
        System.out.println(knightProbability(8, 1, 2, 10));
        ;
    }
}
