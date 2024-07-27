class Pair{
    int node;
    int weight;
    Pair(int node,int weight)
    {
        this.node=node;
        this.weight=weight;
    }
}
class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        if(source.length()!=target.length())
        {
            return -1;
        }
        List<List<Pair>>li=new ArrayList<>();
        for(int i=0;i<26;i++)
        {
            li.add(new ArrayList<>());
        }
        for(int i=0;i<cost.length;i++)
        {
            int ori=original[i]-'a';
            int chang=changed[i]-'a';
            li.get(ori).add(new Pair(chang,cost[i]));
        }
        long [][]result=new long[26][26];
        for(long []row:result)
        {
            Arrays.fill(row,Long.MAX_VALUE);
        }
        for(int i=0;i<26;i++)
        {
            dijkstra(li,result,i);
        }
        long res=0;
        for(int i=0;i<source.length();i++)
        {
            int xx=source.charAt(i)-'a';
            int yy=target.charAt(i)-'a';
            if(result[xx][yy]==Long.MAX_VALUE)
            {
                return -1;
            }
            res+=result[xx][yy];
        }
        return res;



        
    }
    public static void dijkstra(List<List<Pair>>li,long [][]result,int val)
    {
        long []distance=new long[26];
        Arrays.fill(distance,Long.MAX_VALUE);
        distance[val]=0;
        PriorityQueue<Pair>pq=new PriorityQueue<>((p1,p2)->p1.weight-p2.weight);
        pq.offer(new Pair(val,0));
        while(!pq.isEmpty())
        {
            Pair pp=pq.poll();
            int node=pp.node;
            int weight=pp.weight;
            for(Pair pair:li.get(node))
            {
              if(distance[pair.node]>weight+pair.weight)
              {
                distance[pair.node]=weight+pair.weight;
                pq.offer(new Pair(pair.node,weight+pair.weight));
              }
            }

           
        }
        System.arraycopy(distance,0,result[val],0,26);
    }
}