class Solution {
    public int numIslands(char[][] grid) {
        boolean [][]visited=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(!visited[i][j]&&grid[i][j]=='1')
                {
                    count++;
                    dfs(visited,grid,i,j);
                }
            }
        }
        return count;
        
    }
    public static void dfs(boolean [][]visited,char [][]grid,int i,int j)
    {
        visited[i][j]=true;
        int []rows={1,0,-1,0};
        int []cols={0,1,0,-1};
        for(int w=0;w<4;w++)
        {
            int newrow=rows[w]+i;
            int newcol=cols[w]+j;
            if(newrow>=0&&newrow<grid.length&&newcol>=0&&newcol<grid[0].length&&!visited[newrow][newcol]&&grid[newrow][newcol]=='1')
            {
                dfs(visited,grid,newrow,newcol);
            }
        }
    }
}