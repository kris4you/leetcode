package com.learning;

public class MinPathSum {

    public static int minPathSum(int[][] grid) {

        int i = 0;
        int j = 0;

        for (i = 0; i < grid.length; i++) {
            for (j = 0; j < grid[0].length; j++) {

                if (i == 0 && j == 0) {
                    continue;
                } else if (i == 0) {
                    grid[i][j] += grid[i][j - 1];
                } else if (j == 0) {
                    grid[i][j] += grid[i - 1][j];
                } else {
                    grid[i][j] = Math.min(grid[i - 1][j] + grid[i][j], grid[i][j - 1] + grid[i][j]);
                }

            }
        }

        return grid[i - 1][j - 1];
    }

    public static void main(String[] args) {

        System.out.println(minPathSum(new int[][] { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } }));
    }
}
