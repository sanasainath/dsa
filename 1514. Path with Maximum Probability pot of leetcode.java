class Pair{
    int x;
    double y;
    Pair(int x,double y)
    {
        this.x=x;
        this.y=y;
    }
}
class Pair1{
    int x;
    double y;
    Pair1(int x,double y)
    {
        this.x=x;
        this.y=y;
    }

}
class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {

        ArrayList<ArrayList<Pair>>li=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            li.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {
            li.get(edges[i][0]).add(new Pair(edges[i][1],succProb[i]));
            li.get(edges[i][1]).add(new Pair(edges[i][0],succProb[i]));
        }
    
        double []dis=new double[n];
        Arrays.fill(dis,0.0);
        PriorityQueue<Pair1>q=new PriorityQueue<>((p1,p2)->Double.compare(p2.y,p1.y));
        q.offer(new Pair1(start_node,1.0));

        while(!q.isEmpty())
        {
            Pair1 pp=q.poll();
            int currnode=pp.x;
            double currdis=pp.y;

         
            
            for(Pair ans:li.get(currnode))
            {
                int adjnode=ans.x;
                double prob=ans.y;
                

                 if(prob*currdis>dis[adjnode])
                 {
                    dis[adjnode]=prob*currdis;
                    q.offer(new Pair1(adjnode,prob*currdis));
                 }


            }

        }
      
       return dis[end_node];




        
    }
}