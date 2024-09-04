class Pair{
    int x;
    int y;
    Pair(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>mapp=new HashMap<>();
        for(int i:nums)
        {
            mapp.put(i,mapp.getOrDefault(i,0)+1);
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>((p1,p2)->p2.y-p1.y);
        for(Map.Entry<Integer,Integer>entry:mapp.entrySet())
        {
            pq.offer(new Pair(entry.getKey(),entry.getValue()));
        }
       int []res=new int[k];
       int xx=0;
        while(k>0&&!pq.isEmpty())
        {
            Pair pp=pq.poll();
            res[xx++]=pp.x;
            k--;

        }
        return res;
          
        
    }
}