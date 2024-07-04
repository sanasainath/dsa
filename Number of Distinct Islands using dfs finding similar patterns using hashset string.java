class Solution {
  
    public static void dfs(boolean [][]visited,int i,int j,int [][]grid,List<String>li,int baseX,int baseY)
    {
        visited[i][j]=true;
        
      li.add((i-baseX)+","+(j-baseY));
        int []rows={-1,0,1,0};
        int []cols={0,1,0,-1};  
        for(int ii=0;ii<4;ii++)
        {
            int nrow=rows[ii]+i;
            int ncol=cols[ii]+j;
            if(nrow>=0&&ncol>=0&&nrow<grid.length&&ncol<grid[0].length&&grid[nrow][ncol]==1&&!visited[nrow][ncol])
            {
                dfs(visited,nrow,ncol,grid,li,baseX,baseY);
                
            }
            
        }
        
    }

    int countDistinctIslands(int[][] grid) {
        // Your Code here
        HashSet<List<String>>set=new HashSet<>();
     
        int n=grid.length;
        int m=grid[0].length;
        boolean [][]visited=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(!visited[i][j]&&grid[i][j]==1)
                {
                      List<String>li=new ArrayList<>();
                    dfs(visited,i,j,grid,li,i,j);
                    set.add(li);
                    
                }
                
            }
        }
        return set.size();
    }
}