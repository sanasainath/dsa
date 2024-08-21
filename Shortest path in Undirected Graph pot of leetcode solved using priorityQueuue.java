class Pair{
    int node;
    int dis;
    Pair(int node,int dis)
    {
        this.node=node;
        this.dis=dis;
    }
    
}
class Solution {
    
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        // Code here
        int []res=new int[n];
        int xx=0;
       
        Arrays.fill(res,Integer.MAX_VALUE);
        List<List<Integer>>li=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            li.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {
            
                li.get(edges[i][0]).add(edges[i][1]);
             li.get(edges[i][1]).add(edges[i][0]);
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>((p,q)->p.dis-q.dis);
        pq.offer(new Pair(src,0));
        boolean []visited=new boolean[n];
        res[src]=0;
        while(!pq.isEmpty())
        {
            Pair p=pq.poll();
            int node=p.node;
            int dis=p.dis;
            for(Integer ii:li.get(node))
            {
                if(!visited[ii]&&res[ii]>dis+1)
                {
                    pq.offer(new Pair(ii,dis+1));
                    visited[ii]=true;
                    res[ii]=dis+1;
                }
            }
        }
        for(int i=0;i<res.length;i++)
        {
            if(res[i]==Integer.MAX_VALUE)
            {
                res[i]=-1;
            }
        }
        return res;
        
        
        
    }
}