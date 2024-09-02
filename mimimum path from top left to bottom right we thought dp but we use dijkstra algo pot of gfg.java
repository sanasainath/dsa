class Pair{
    int row;
    int col;
    int dis;
    Pair(int row,int col,int dis)
    {
        this.row=row;
        this.col=col;
        this.dis=dis;
    }
}
class Solution
{
    //Function to return the minimum cost to react at bottom
	//right cell from top left cell.
    public int minimumCostPath(int[][] grid)
    {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        boolean [][]visited=new boolean[n][m];
        PriorityQueue<Pair>pq=new PriorityQueue<>((p1,p2)->p1.dis-p2.dis);
        pq.offer(new Pair(0,0,grid[0][0]));
        int [][]distance=new int[n][m];
        for(int []row:distance)
        {
            Arrays.fill(row,Integer.MAX_VALUE);
        }
         int []rows={0,1,0,-1};
            int []cols={1,0,-1,0};
        while(!pq.isEmpty())
        {
            Pair pair=pq.poll();
            int row=pair.row;
            int col=pair.col;
            int dis=pair.dis;
           
            visited[row][col]=true;
           
            for(int i=0;i<4;i++)
            {
                int nrow=rows[i]+row;
                int ncol=cols[i]+col;
                if(nrow>=0&&ncol>=0&&nrow<n&&ncol<grid[0].length&&!visited[nrow][ncol]&&dis+grid[nrow][ncol]<distance[nrow][ncol])
                {
                    distance[nrow][ncol]=dis+grid[nrow][ncol];
                    pq.offer(new Pair(nrow,ncol,distance[nrow][ncol]));
                }
            }
        }
        return distance[n-1][m-1];
    }
}