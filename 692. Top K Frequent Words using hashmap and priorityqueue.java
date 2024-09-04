class Pair{
    String x;
    int y;
    Pair(String x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>mapp=new HashMap<>();
        for(String st:words)
        {
            mapp.put(st,mapp.getOrDefault(st,0)+1);
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>((p1,p2)->{
        if(p1.y!=p2.y)
        {
            return p2.y-p1.y;
        }
        else
        {
            return p1.x.compareTo(p2.x);
        }
        }
        );
        for(Map.Entry<String,Integer>entry:mapp.entrySet())
        {
            pq.offer(new Pair(entry.getKey(),entry.getValue()));
        }
      List<String>res=new ArrayList<>();
        while(k>0&&!pq.isEmpty())
        {
            Pair pp=pq.poll();
            res.add(pp.x);
            k--;
        }
        return res;
    }
}