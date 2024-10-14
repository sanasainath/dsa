class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((p,q)->(q-p));
        for(int i:nums)
        {
            pq.offer(i);
        }
        long sum=0;
        while(k>0)
        {
         int xx=pq.poll();
         sum=sum+xx;
         double yy=(double)xx/3;
         double res=Math.ceil(yy);
         pq.offer((int)res);
         k--;
        }
        return sum;
        
    }
}