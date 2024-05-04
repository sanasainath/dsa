class Solution {
    public boolean isBipartite(int[][] graph) {
        int V=graph.length;
        int []col=new int[V];
       
        Arrays.fill(col,-1);
        for(int i=0;i<V;i++)
        {
            // if(col[i]==-1&&path(i,graph,col)==false)
               if(col[i]==-1&&dfs(i,graph,col,0)==false)
            {
                return false;
            }

        }
        return true;
        
    }
    public static boolean dfs(int i,int [][]graph,int []col,int color)
    {
      
        col[i]=color;


for(int ii:graph[i])
{
    if(col[ii]==-1)
    {
      if(!dfs(ii,graph,col,1-color))
      {
        return false;
      }
    }
    else if (col[i]==col[ii])
    {
        return false;

    }
   
}
        return true;
    }


    // public static boolean path(int i,int [][]graph,int []col)
    // {
    //     Queue<Integer>q=new LinkedList<>();
    //     q.offer(i);
    //     col[i]=0;
    //     while(!q.isEmpty())
    //     {
    //         int size=q.size();
    //         for(int j=0;j<size;j++)
    //         {

    //             int x=q.poll();
    //             for(int ii:graph[x])
    //             {
    //                 if(col[ii]==-1)
    //                 {
    //                     col[ii]=1-col[x];
    //                     q.offer(ii);

    //                 }
    //                 else if(col[ii]==col[x])
    //                 {
    //                     return false;
    //                 }
    //             }
    //         }
    //     }
    //     return true;
    // }
}