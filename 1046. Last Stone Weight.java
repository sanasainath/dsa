import java.util.PriorityQueue;
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)-> b-a);
        int n=stones.length;
        for(int i=0;i<n;i++)
        {
            pq.add(stones[i]);
        }
        while(!pq.isEmpty()&&pq.size()!=1)
        {

              int x=pq.poll();
              int y=pq.poll();
        if(x==y)
        {
            continue;
        }
        else if(x!=y)
        {
            if(x>y)
            {
                int z=x-y;
                pq.add(z);
            }
            else
            {
                int z=y-x;
                pq.add(z);
            }
        }

        }
        if(pq.isEmpty())
        {
            return 0;
        }
       int result=pq.poll();
       return result;

      

        
    }
}