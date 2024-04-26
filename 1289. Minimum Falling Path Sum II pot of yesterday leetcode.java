class Solution {
    public int minFallingPathSum(int[][] grid) {
        int maxi=Integer.MAX_VALUE;
        int [][]dp=new int[grid.length][grid[0].length];
        for(int []row:dp)
        {
            Arrays.fill(row,-1);
        }
        for(int i=0;i<grid[0].length;i++)
        {
           int res=path(grid,grid.length-1,i,dp);
           maxi=Math.min(res,maxi);

         
        }
        return maxi;
        

        
    }
    public static int path(int [][]grid,int i,int j,int [][]dp)
    {
        if(i==0)
        {
            return grid[i][j];
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
            int m=Integer.MAX_VALUE;
            for(int xx=0;xx<grid[0].length;xx++)
            {
                if(xx!=j)
                {
                    int rr=path(grid,i-1,xx,dp)+grid[i][j];
                    m=Math.min(rr,m);

                }
                 

            }
            return dp[i][j]=m;
               

    


    }
}