class Solution {
    public int findKthLargest(int[] nums, int k) {
     PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
        }
        int count=0;
        while(!pq.isEmpty())
        {
            count++;
            if(count==k)
            {
                return pq.poll();
            }
            pq.poll();
            
       
        }
        return -1;
    }
}