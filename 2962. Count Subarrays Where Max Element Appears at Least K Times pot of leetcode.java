class Solution {
    public long countSubarrays(int[] nums, int k) {
        long res=0;
        HashMap<Integer,Integer>mapp=new HashMap<>();
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            maxi=Math.max(maxi,nums[i]);
        }
      
        int left=0;
        int right=0;
        long count=0;
        long total=(long)nums.length*(nums.length+1)/2;
        while(right<nums.length)
        {
            mapp.put(nums[right],mapp.getOrDefault(nums[right],0)+1);
            while(left<=right&&mapp.containsKey(maxi)&&mapp.get(maxi)>=k)
            {
               
                mapp.put(nums[left],mapp.get(nums[left])-1);
                if(mapp.get(nums[left])==0)
                {
                    mapp.remove(nums[left]);
                }
                left++;
            }
             count+=(right-left+1);
            right++;
        }
        return total-count;
        
    }
}