// User function Template for Java
//spanning treee means 

         n no of vertices and n-1 edges..............



// we use parent node when we need to find the edges of the spanning tree...
class Pair{
    int weight;
    int node;
    int parent;
    public Pair(int weight,int node,int parent)
    {
        this.weight=weight;
        this.node=node;
        this.parent=parent;
    }
}
class Solution {
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        // Code Here.
       PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.weight));

        pq.offer(new Pair(0,0,-1));
        int sum=0;
        boolean []visited=new boolean[V];
        while(!pq.isEmpty())
        {
            Pair pair=pq.poll();
            int weight=pair.weight;
            int node=pair.node;
          
            if(!visited[node])
            {
                
            
            visited[node]=true;
            
            sum+=weight;
            for( int[] ii:adj.get(node))
            {
                if(!visited[ii[0]])
                {
                    pq.offer(new Pair(ii[1],ii[0],node));
                }
                
                
            }
            }
            
        }
        return sum;
    }
}