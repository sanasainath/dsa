import java.util.*;
import java.io.*;

public class Solution {
    public static int maximumChocolates(int r, int c, int[][] grid) {
        int[][][] dp = new int[r][c][c];
          for (int[][] matrix : dp) {
            for (int[] row : matrix) {
                Arrays.fill(row, -1);
            }
        }
        return path(0, 0, c - 1, grid, dp);
    }

    public static int path(int i, int c1, int c2, int[][] grid, int[][][] dp) {
        if (c1 < 0 || c1 > grid[0].length - 1 || c2 < 0 || c2 > grid[0].length - 1) {
            return (int) (-1 * Math.pow(10, 8));
        }

        if (dp[i][c1][c2] != -1) {
            return dp[i][c1][c2];
        }

        if (i == grid.length - 1) {
            if (c1 == c2) {
                return grid[i][c1];
            } else {
                return grid[i][c1] + grid[i][c2];
            }
        }

        int maxi = 0;
        for (int z = -1; z <= 1; z++) {
            for (int j = -1; j <= 1; j++) {
                if (c1 == c2) {
                    maxi = Math.max(maxi, grid[i][c1] + path(i + 1, c1 + z, c2 + j, grid, dp));
                } else {
                    maxi = Math.max(maxi, grid[i][c1] + grid[i][c2] + path(i + 1, c1 + z, c2 + j, grid, dp));
                }
            }
        }

        dp[i][c1][c2] = maxi ; // Store the result in dp
         // Store the result in dp

        return maxi;
    }
}
