class Pair{
    String x;
    int y;
    public Pair(String x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String res[]=new String[names.length];
        int xx=0;
        PriorityQueue<Pair>pq=new PriorityQueue<>((p1,p2)->p2.y-p1.y);
        for(int i=0;i<names.length;i++)
        {
            pq.add(new Pair(names[i],heights[i]));
        }
        while(!pq.isEmpty())
        {
            Pair pp=pq.poll();
            res[xx++]=pp.x;
        }
        return res;
           
        
    }
}