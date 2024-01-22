class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int [][]dp=new int[m][n];
        return path(m-1,n-1,obstacleGrid,dp);


        
    }
    public static int path(int m,int n,int [][]grid,int [][]dp)
    {
        if(m==0&&n==0)
        {
            return grid[0][0]==0?1:0;
        }
         if(m<0||n<0)
        {
            return 0;
        }
        if(grid[m][n]==1)
        {
            return 0;
        }
        if(dp[m][n]!=0)
        {
            return dp[m][n];
        }
       
        int a=path(m-1,n,grid,dp);
        int b=path(m,n-1,grid,dp);
        return dp[m][n]=a+b;
    }
}