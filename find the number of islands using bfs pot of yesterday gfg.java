class Pair{
    int x;
    int y;
    Pair(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        // Code here
        int res=0;
        int n=grid.length;
        int m=grid[0].length;
        boolean [][]visited=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1'&&!visited[i][j])
                {
                    res++;
                    bfs(grid,visited,i,j);
                }
            }
        }
        return res;
    }
    public static void bfs(char [][]grid,boolean [][]visited,int i,int j)
    {
        int [][]dir={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        Queue<Pair>q=new LinkedList<>();
        q.offer(new Pair(i,j));
        visited[i][j]=true;
        while(!q.isEmpty())
        {
            Pair p=q.poll();
            int x=p.x;
            int y=p.y;
            for(int []d:dir)
            {
                int xx=x+d[0];
                int yy=y+d[1];
                if(xx>=0&&yy>=0&&xx<grid.length&&yy<grid[0].length&&grid[xx][yy]=='1'&&!visited[xx][yy])
                {
                    visited[xx][yy]=true;
                  q.offer(new Pair(xx,yy));
                }
            }
        }
        
    }
}