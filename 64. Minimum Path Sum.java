import java.util.Arrays;

class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        // for (int[] x : dp) {
        //     Arrays.fill(x, -1);
        // }
        // return path(grid, m - 1, n - 1, dp);
        dp[0][0]=grid[0][0];
       for(int i = 0; i < m; i++) {
    for(int j = 0; j < n; j++) {
        if (i == 0 && j == 0) {
            dp[i][j] = grid[i][j];
        } else {
            int up = i > 0 ? dp[i - 1][j] + grid[i][j] : Integer.MAX_VALUE;
            int left = j > 0 ? dp[i][j - 1] + grid[i][j] : Integer.MAX_VALUE;
            dp[i][j] = Math.min(up, left);
        }
    }
}

        return dp[m-1][n-1];
    }

    // public static int path(int[][] grid, int m, int n, int[][] dp) {
    //     if (m == 0 && n == 0) {
    //         return grid[0][0];
    //     }
    //     if (m < 0 || n < 0) {
    //         return Integer.MAX_VALUE;
    //     }
    //     if (dp[m][n] != -1) {
    //         return dp[m][n];
    //     }
    //     int x = path(grid, m - 1, n, dp) + grid[m][n];
    //     int y = path(grid, m, n - 1, dp) + grid[m][n];
    //     return dp[m][n] = Math.min(x, y);
    // }
}
