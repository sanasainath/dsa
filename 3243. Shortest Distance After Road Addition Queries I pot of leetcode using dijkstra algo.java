class Pair{
    int node;
    int distance;
    Pair(int node,int distance)
    {
        this.node=node;
        this.distance=distance;
    }
}
class Solution {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        int []res=new int[queries.length];
      
        List<List<Integer>>li=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            li.add(new ArrayList<>());
        }
        for(int i=0;i<n-1;i++)
        {
           li.get(i).add(i+1);
        }
        int xx=0;
        for(int []query:queries)
        {
            int x=query[0];
            int y=query[1];
            li.get(x).add(y);
            res[xx++]=path(li,n);
            
        }
        return res;




        
    }
    public static int path(List<List<Integer>>li,int n)
    {
          int []dis=new int [n];
        Arrays.fill(dis,Integer.MAX_VALUE);
        Queue<Pair>q=new LinkedList<>();
        q.offer(new Pair(0,0));
        dis[0]=0;
        while(!q.isEmpty())
        {
            Pair pair=q.poll();
            int node=pair.node;
            int distance=pair.distance;
            for(Integer ii:li.get(node))
            {
                if(distance+1<dis[ii])
                {
                    dis[ii]=distance+1;
                    q.offer(new Pair(ii,distance+1));                }
            }
        }
        return dis[n-1];

    }
}