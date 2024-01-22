import java.util.*;

public class Solution {
    public static int minimumPathSum(int[][] triangle, int n) {
        // Start from the top of the triangle (row 0) and index 0
                int[][] memo = new int[n][n];
                for(int []row:memo)
                {
                    Arrays.fill(row,-1);
                }
        return tri(triangle, n, 0, 0,memo);

    
    }

    public static int tri(int[][] triangle, int n, int row, int col,int [][]memo) {
        // Base case: If we reach the bottom row of the triangle
        if (row == n - 1) {
            return triangle[row][col];
        }
        if(memo[row][col]!=-1)
        {
            return memo[row][col];
        }
        // Recursive calls for the two possible paths down the triangle
        int down1 = triangle[row][col] + tri(triangle, n, row + 1, col,memo);
        int down2 = triangle[row][col] + tri(triangle, n, row + 1, col + 1,memo);

        // Choose the minimum of the two paths
        return  memo[row][col]=Math.min(down1, down2);
 }
}