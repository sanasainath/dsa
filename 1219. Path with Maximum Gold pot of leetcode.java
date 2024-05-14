class Solution {
    public int getMaximumGold(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int maxi=0;
        boolean visited[][]=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]!=0)
                {
                  int xx=path(grid,i,j,visited);
                  maxi=Math.max(xx,maxi);
                }
            }
        }

        return maxi;
    }
    public static int path(int [][]grid,int i,int j,boolean [][]visited)
    {
         if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]==0||visited[i][j])
        {
            return 0;
        }
      
       
        visited[i][j]=true;

        int x=grid[i][j]+path(grid,i+1,j,visited);
        int y=grid[i][j]+path(grid,i-1,j,visited);
        int z=grid[i][j]+path(grid,i,j-1,visited);
        int zz=grid[i][j]+path(grid,i,j+1,visited);
        visited[i][j]=false;
        return Math.max(x,Math.max(y,Math.max(z,zz)));

    }
}