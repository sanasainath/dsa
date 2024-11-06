class Pair{
    int r;
    int c;
    int t;
    boolean check;
    Pair(int r,int c,int t,boolean check)
    {
        this.r=r;
        this.c=c;
        this.t=t;
        this.check=check;
    }

}
class Solution {
    public int minTimeToReach(int[][] moveTime) {
        int n=moveTime.length;
        int m=moveTime[0].length;
        int [][]dis=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                dis[i][j]=Integer.MAX_VALUE;
            }
        }
        dis[0][0]=0;
        PriorityQueue<Pair>q=new PriorityQueue<>((a,b)->Integer.compare(a.t,b.t));
        q.offer(new Pair(0,0,0,false));
        int []row={-1,0,1,0};
        int []col={0,1,0,-1};
        while(!q.isEmpty())
        {
            Pair p=q.poll();
              if(p.r==n-1&&p.c==m-1)
               {
                return dis[p.r][p.c];
               }
            for(int z=0;z<4;z++)
            {
                int nrow=row[z]+p.r;
                int ncol=col[z]+p.c;
             
                if(nrow>=0&&ncol>=0&&nrow<n&&ncol<m)
                {
                    // if(p.t>=moveTime[nrow][ncol]&&dis[nrow][ncol]>p.t)
                    // {
                    //    dis[nrow][ncol]=p.t+1;
                    // q.offer(new Pair(nrow,ncol,p.t+1));
                    // }
                    // else
                    // {
                    //     if(p.t<moveTime[nrow][ncol]&&dis[nrow][ncol]>moveTime[nrow][ncol])
                    //     {
                    //          dis[nrow][ncol]=moveTime[nrow][ncol]+1;
                    //  q.offer(new Pair(nrow,ncol,moveTime[nrow][ncol]+1));
                    //     }
                          
                    // }  //getting tle
                   int time=Math.max(p.t,moveTime[nrow][ncol]);
                   boolean check=p.check;
                   if(!check)
                   {
                    time+=1;
                   }
                   else if(check)
                   {
                    time+=2;
                   }
                   if(dis[nrow][ncol]>time)
                   {
                    dis[nrow][ncol]=time;
                    q.offer(new Pair(nrow,ncol,time,!check));
                   }
                }

            }

        }
       return dis[n-1][m-1];

        
    }
}