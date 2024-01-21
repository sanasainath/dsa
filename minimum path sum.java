import java.util.* ;
import java.io.*; 
public class Solution {
    public static int minSumPath(int[][] grid) {
    	// Write your code here.
        int m=grid.length;
        int n=grid[0].length;
        int [][]dp=new int[m][n];
        for(int []row:dp)
        {
            Arrays.fill(row,-1);
        }
        return sum(m-1,n-1,dp,grid);

    }
    public static int sum(int m,int n,int [][]dp,int [][]grid)
    {
        if(m==0&&n==0)
        {
            return grid[0][0];
        }
        if(m<0||n<0)
        {
            return Integer.MAX_VALUE;
        }
        if(dp[m][n]!=-1)
        {
            return dp[m][n];
        }
        // int up=grid[m][n]+sum(m-1,n,dp,grid);
        // int left=grid[m][n]+sum(m,n-1,dp,grid);
         int up=sum(m-1,n,dp,grid);
        int left=sum(m,n-1,dp,grid);
        // dp[m][n]=Math.min(up,left);
        dp[m][n]=grid[m][n]+Math.min(up,left);
        return dp[m][n];
    }
}