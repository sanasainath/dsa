class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean [][]visited=new boolean[n][m];
     
        int res=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {

            
            if(grid[i][j]=='1'&&!visited[i][j])
            {
                res++;
                path(visited,grid,i,j,m,n);
            }
            }
        }
        return res;
        
    }
    public static void path(boolean [][]visited,char [][]grid,int i,int j,int m,int n)
    {
        if(i<0||j<0||i>=n||j>=m||grid[i][j]=='0'||visited[i][j])
        {
            return;
        }
        visited[i][j]=true;
        path(visited,grid,i+1,j,m,n);
        path(visited,grid,i-1,j,m,n);
        path(visited,grid,i,j-1,m,n);
        path(visited,grid,i,j+1,m,n);
      
    }
}