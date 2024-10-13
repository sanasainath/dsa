class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        HashMap<Integer,Integer>mapp=new HashMap<>();
        int res[]=new int[nums.length-k+1];
        for(int i=0;i<k;i++)
        {
            mapp.put(nums[i],mapp.getOrDefault(nums[i],0)+1);
        }
        int xx=0;
        res[xx++]=path(mapp,x);
        int left=0;
        
        for(int i=k;i<nums.length;i++)
        {
            mapp.put(nums[left],mapp.get(nums[left])-1);
            if(mapp.get(nums[left])==0)
            {
                mapp.remove(nums[left]);
            }
            mapp.put(nums[i],mapp.getOrDefault(nums[i],0)+1);
            res[xx++]=path(mapp,x);
            left++;

        }
        return res;


        
    }
    public static int path(HashMap<Integer,Integer>mapp,int x)
    {
        int sum=0;
        int count=0;
       PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
    (a, b) -> {
        // Sort by frequency in descending order
        int freqCompare = Integer.compare(b.getValue(), a.getValue());
        // If frequencies are the same, sort by key (value) in descending order
        if (freqCompare == 0) {
            return Integer.compare(b.getKey(), a.getKey());
        }
        return freqCompare;
    }
   

);
 pq.addAll(mapp.entrySet());
    while(!pq.isEmpty()&&count<x)
    {
        Map.Entry<Integer, Integer> entry = pq.poll();
        int xx=entry.getValue();
        while(xx>0)
        {
               sum=sum+entry.getKey();
               xx--;
        }
    

        count++;
        
    }
    return sum;


    }
}