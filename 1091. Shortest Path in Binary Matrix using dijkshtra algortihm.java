class Pair{
    int d;
    int r;
    int c;
    public Pair(int d,int r,int c)
    {
        this.d=d;
        this.r=r;
        this.c=c;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.d-b.d);
        int [][]dis=new int[n][n];
        for(int []z:dis)
        {   
            Arrays.fill(z,Integer.MAX_VALUE);
        }
        if(grid[0][0]!=0||grid[n-1][n-1]!=0)

        {
            return -1;
            

        }
         pq.offer(new Pair(1,0,0));
        
            
        
       
        dis[0][0]=1;
        while(!pq.isEmpty())
        {
            int size=pq.size();
            for(int i=0;i<size;i++)
            {
                Pair p=pq.poll();
                int d=p.d;
                int r=p.r;
                int c=p.c;
                if(r==n-1&&c==n-1)
                {
                    return d;
                }
                int []row={-1,-1,0,1,1,1,0,-1};
                int []col={0,1,1,1,0,-1,-1,-1};
                for(int ii=0;ii<8;ii++)
                {
                    int newrow=row[ii]+r;
                    int newcol=col[ii]+c;
                    if(newrow<0||newrow>=n||newcol<0||newcol>=n||grid[newrow][newcol]==1)
                    {
                        continue;   
                                   
                                 
                    }
                    else
                    {
                        if(d+1<dis[newrow][newcol])
                        {
                            dis[newrow][newcol]=d+1;
                            pq.offer(new Pair(d+1,newrow,newcol));
                        }
                    }
                }
               

            }
        }
        return -1;
        
    }
}