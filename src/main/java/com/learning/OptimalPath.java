package com.learning;

public class OptimalPath {

    public static Integer path(int[][] arr) {

        for (int row = arr.length - 1; row >= 0; row--) {

            for (int col = 0; col < arr[0].length; col++) {

                if (row < arr.length - 1 && col > 0) {
                    arr[row][col] += Math.max(arr[row + 1][col], arr[row][col - 1]);
                } else if (row < arr.length - 1) {
                    arr[row][col] += arr[row + 1][col];
                } else if (col > 0) {
                    arr[row][col] += arr[row][col - 1];
                }
            }
        }
        return arr[0][arr[0].length - 1];
    }

    public static void main(String[] args) {

        int[][] mine = { { 1, 3, 1, 5 }, { 2, 2, 4, 1 }, { 5, 0, 2, 3 }, { 0, 6, 1, 2 } };
        int[][] mine1 = { { 0, 0, 0, 0, 5 }, { 0, 1, 1, 1, 0 }, { 2, 0, 0, 0, 0 } };
        System.out.println(path(mine1));
        System.out.println(path(mine));
    }
}
