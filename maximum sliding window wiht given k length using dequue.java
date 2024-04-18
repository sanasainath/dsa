class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> deq = new ArrayDeque<>();
     
        int ii = 0;
        int[] arr = new int[n - k + 1];
        for (int i = 0; i < n; i++) {
            if(!deq.isEmpty()&&deq.peekFirst()==i-k)
            {
                deq.pollFirst();
            }
            while (!deq.isEmpty() && nums[deq.peekLast()] < nums[i]) {
                deq.pollLast();
            }
            deq.offer(i);
            if(i>=k-1)
            {
                arr[ii++]=nums[deq.peekFirst()];
            }
         
          
        }
        return arr;
    }
}
