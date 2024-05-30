class Pair{
    int dest;
    int cost;
    Pair(int dest,int cost)
    {
        this.dest=dest;
        this.cost=cost;
    }
}
class Pair1{
    int stop;
    int node;
    int dis;
    Pair1(int stop,int node,int dis)
    {
        this.stop=stop;
        this.node=node;
        this.dis=dis;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
       List<List<Pair>>adj=new ArrayList<>();
       for(int i=0;i<n;i++)
       {
        adj.add(new ArrayList<>());
       }

     for (int[] flight : flights) {
    adj.get(flight[0]).add(new Pair(flight[1], flight[2]));
}

       Queue<Pair1>q=new LinkedList<>();
       q.offer(new Pair1(0,src,0));
       int distance[]=new int [n];
     
    
       Arrays.fill(distance,Integer.MAX_VALUE);
         distance[src]=0;
       while(!q.isEmpty())
       {
        Pair1 del=q.poll();
        int stops=del.stop;
        int val=del.node;
        int distant=del.dis;
          if(stops>k)
          {
            continue;
          }
          for(Pair iii:adj.get(val))
          {
            int dd=iii.dest;
            int cc=iii.cost;
           
           
                 if(distant+cc<distance[dd]&&stops<=k)
            {
                distance[dd]=distant+cc;
                q.offer(new Pair1(stops+1,dd,distant+cc));
            }
             
          }
          
         


       }
       if(distance[dst]==Integer.MAX_VALUE)
       {
        return -1;
       }
       return distance[dst];


        
    }
}