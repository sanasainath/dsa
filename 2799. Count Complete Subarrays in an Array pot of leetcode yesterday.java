class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashMap<Integer,Integer>mapp=new HashMap<>();
        for(int i:nums)
        {
            mapp.put(i,mapp.getOrDefault(i,0)+1);
        }
        int n=mapp.size();
        int total=(nums.length*(nums.length+1))/2;
        if(n==1)
        {
            return total;
        }
        int count=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     HashMap<Integer,Integer>map=new HashMap<>();
        //     map.put(nums[i],mapp.getOrDefault(nums[i],0)+1);
        //     if(map.size()==n)
        //     {
        //         count++;
        //     }
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //        map.put(nums[j],mapp.getOrDefault(nums[j],0)+1);
        //     if(map.size()==n)
        //     {
        //         count++;
        //     }
                  
        //     }
        // }
        // return count;

        mapp.clear();
        int left=0;
        int right=0;
        while(right<nums.length)
        {
              mapp.put(nums[right],mapp.getOrDefault(nums[right],0)+1);
            while(mapp.size()==n&&left<right)
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