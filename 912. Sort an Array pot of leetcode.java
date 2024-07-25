class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((p1,p2)->p1-p2);
        for(int i:nums)
        {
            pq.add(i);
        }
        int xx=0;
        while(!pq.isEmpty())
        {
           nums[xx++]=pq.poll();
        }
        return nums;

        
    }
}