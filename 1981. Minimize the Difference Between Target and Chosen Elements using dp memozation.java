class Solution {
    public int minimizeTheDifference(int[][] mat, int target) {
        int n = mat.length;
        int m = mat[0].length;
        int mini = Integer.MAX_VALUE; // Initialize with MAX_VALUE instead of MIN_VALUE
         int [][]dp=new int[n+1][m*n*70];
         for(int []rows:dp)
         {
            Arrays.fill(rows,-1);
         }
        for (int i = 0; i < m; i++) {
            mini = Math.min(path(0, i, target, mat, 0,dp), mini);
        }
        return mini;
    }

    public static int path(int row, int col, int target, int[][] mat, int sum,int [][]dp) {
        if (row == mat.length) { // Check if we reached the end of rows
            return Math.abs(sum - target); // Return the absolute difference
        }
        if(dp[row][sum]!=-1)
        {
            return dp[row][sum];
        }

        int mini = Integer.MAX_VALUE; // Initialize with MAX_VALUE
        for (int j = 0; j < mat[0].length; j++) {
            mini = Math.min(mini, path(row + 1, j, target, mat, sum + mat[row][j],dp)); // Recursive call
        }

        return dp[row][sum]=mini;
    }

}
