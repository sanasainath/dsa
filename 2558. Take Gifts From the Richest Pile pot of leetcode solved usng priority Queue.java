class Solution {
    public long pickGifts(int[] gifts, int k) {
        long sum=0;
        PriorityQueue<Integer>pq=new PriorityQueue<>((p,q)->q-p);
        for(int i:gifts)
        {
            pq.offer(i);
        }
        while(k>0&&!pq.isEmpty())
        {
            int xx=pq.poll();
            int yy=(int)Math.sqrt(xx);
            pq.offer(yy);
            k--;
        }
        while(!pq.isEmpty())
        {
            sum+=pq.poll();
        }
        return sum;
        



    }
}