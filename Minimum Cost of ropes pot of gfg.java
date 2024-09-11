class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public long minCost(long[] arr) {
        // code here
        long sum=0;
         PriorityQueue<Long>pq=new PriorityQueue<>((p,q)->Long.compare(p,q));
        for(long i:arr)
        {
            pq.offer(i);
        }
        while(!pq.isEmpty())
        {
            if(pq.size()==1)
            {
                break;
            }
            long xx=pq.poll();
            long yy=0;
            if(!pq.isEmpty())
            {
                yy=pq.poll();
            }
            long zz=xx+yy;
            sum+=zz;
            pq.offer(zz);
        }
        return sum;
        
    }
}