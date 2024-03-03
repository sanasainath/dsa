class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
       int dp[][]=new int[rows][cols];
        int count=0;
        dp[0][0]=grid[0][0];
        for(int i=1;i<cols;i++)
        {
            
            
            dp[0][i]=grid[0][i]+dp[0][i-1];
            
            
        }
        
        for(int j=1;j<rows;j++)
        {
            dp[j][0]=grid[j][0]+dp[j-1][0];
        }
        for(int a=1;a<rows;a++)
        {
            for(int b=1;b<cols;b++)
            {
                dp[a][b]=dp[a-1][b]+dp[a][b-1]-dp[a-1][b-1]+grid[a][b];
                
            }
        }
        for(int s=0;s<rows;s++)
        {
            for(int t=0;t<cols;t++)
            {
                if(dp[s][t]<=k)
                {
                    count++;
                }
            }
        }
        return count;
        
    }


}
