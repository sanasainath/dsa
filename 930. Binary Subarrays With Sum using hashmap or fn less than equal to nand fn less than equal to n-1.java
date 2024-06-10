class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        //count subarray with sum equal to k.............
    //   HashMap<Integer,Integer>mapp=new HashMap<>();
    //     mapp.put(0,1);
    //     int count=0;
    //     int presum=0;
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         presum+=nums[i];
    //         int xx=presum-goal;
    //         if(mapp.containsKey(xx))
    //         {
    //             count+=mapp.get(xx);
              
    //         }
    //         mapp.put(presum,mapp.getOrDefault(presum,0)+1);
    //     }
    //     return count;
return fn(nums,goal)-fn(nums,goal-1);

        
    }
    public static int fn(int []nums,int goal)
    {
        int left=0;
          int count=0;
          int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            while(sum>goal&&left<=i)
            {
                sum-=nums[left];
                left++;

            }
            count+=(i-left+1);



        }
        return count;
      

    }
}