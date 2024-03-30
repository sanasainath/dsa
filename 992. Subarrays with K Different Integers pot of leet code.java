class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        
        int n=nums.length;
        
       return path(k,n,nums)-path(k-1,n,nums);
    }
    public static int path(int k,int n,int []nums)
    {
        int left=0;
        int count=0;
         HashMap<Integer,Integer>mapp=new HashMap<>();
        for(int right=0;right<n;right++)
        {
            mapp.put(nums[right],mapp.getOrDefault(nums[right],0)+1);
            while(mapp.size()>k)
            {
                 int frequency = mapp.get(nums[left]);
            if (frequency > 1) {
                mapp.put(nums[left], frequency - 1);
            } else {
                mapp.remove(nums[left]);
            }

                left++;

            }
            count+=right-left+1;
          

        }
        return count;
    }
}