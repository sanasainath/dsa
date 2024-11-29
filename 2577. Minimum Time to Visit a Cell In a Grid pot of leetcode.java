class Pair{
    int row;
    int col;
    int count;
    Pair(int row,int col,int count)
    {
        this.row=row;
        this.col=col;
        this.count=count;
    }
}
class Solution {
    public int minimumTime(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        if(grid[0][1]>1&&grid[1][0]>1)
        {
            return -1;
        }
        boolean [][]visited=new boolean[n][m];
        PriorityQueue<Pair> q = new PriorityQueue<>((a, b) -> a.count - b.count);
        q.offer(new Pair(0,0,0));
        visited[0][0]=true;
        while(!q.isEmpty())
        {
            Pair pair=q.poll();
            int row=pair.row;
            int col=pair.col;
            int count=pair.count;
            if(row==n-1&&col==m-1)
            {
                return count;
            }
            int []rows={-1,0,1,0};
            int []cols={0,1,0,-1};
            for(int z=0;z<4;z++)
            {
                int newrow=rows[z]+row;
                int newcol=cols[z]+col;
                if(newrow>=0&&newcol>=0&&newrow<n&&newcol<m&&!visited[newrow][newcol])
                {
                    if(grid[newrow][newcol]<=count+1)
                    {
                       visited[newrow][newcol]=true;
                    q.offer(new Pair(newrow,newcol,count+1));
                    }
                    else
                    {
                        
                          int diff=Math.abs(grid[newrow][newcol]-(count+1));
                          if(diff%2==0)
                          {
                            visited[newrow][newcol]=true;
                            q.offer(new Pair(newrow,newcol,count+diff+1));
                          }
                          else
                          {
                            visited[newrow][newcol]=true;
                            q.offer(new Pair(newrow,newcol,count+diff+1+1));
                          }
                        
                        
                    }
                   
                }
            }

        }
        return -1;
        
    }
}