class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        boolean [][]visited=new boolean[grid2.length][grid2[0].length];
        int res=0;
        for(int i=0;i<grid2.length;i++)
        {
            for(int j=0;j<grid2[0].length;j++)
            {
                if(grid2[i][j]==1&&!visited[i][j])
                {
                    if(check(grid1,grid2,visited,i,j))
                    {
                        res++;
                    }       

                }
              
            }
        }
        return res;
        
    }
    public static boolean check(int [][]grid1,int [][]grid2,boolean [][]visited,int i,int j)
    {

        boolean []arr={true};
        dfs(grid1,grid2,visited,i,j,arr);
        return arr[0];
    }
    public static void dfs(int [][]grid1,int [][]grid2,boolean [][]visited,int i,int j,boolean []arr)
    {
        visited[i][j]=true;
        if(grid1[i][j]!=grid2[i][j])
        {
            arr[0]=false;
        }
        int []row={0,1,0,-1};
        int []col={1,0,-1,0};
        for(int z=0;z<4;z++)
        {
            int newrow=row[z]+i;
            int newcol=col[z]+j;
            if(newrow>=0&&newcol<grid2[0].length&&newcol>=0&&newrow<grid2.length&&!visited[newrow][newcol]&&grid2[newrow][newcol]==1)
            {
                dfs(grid1,grid2,visited,newrow,newcol,arr);

            }


        }
    }
}