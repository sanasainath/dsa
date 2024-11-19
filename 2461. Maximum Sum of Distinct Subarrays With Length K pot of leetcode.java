class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxi=0;
        int left=0;
        int right=0;
        long sum=0;
       HashMap<Integer,Integer>mapp=new HashMap<>();
         while(right<nums.length)
         {
            if(mapp.size()==k)
                {
                    maxi=Math.max(maxi,sum);
                      sum-=nums[left];
                    mapp.put(nums[left],mapp.get(nums[left])-1);
                  if (mapp.get(nums[left]) == 0)
                    {
                        mapp.remove(nums[left]);
                    }
                    left++;
                    
                }
                while(left<right&&mapp.containsKey(nums[right]))
                {
                   
                    sum-=nums[left];
                    mapp.put(nums[left],mapp.get(nums[left])-1);
                  if (mapp.get(nums[left]) == 0)
                    {
                        mapp.remove(nums[left]);
                    }
                    left++;
                    
                }
                
                mapp.put(nums[right],mapp.getOrDefault(nums[right],0)+1);
                sum+=nums[right];

              
            right++;
         }
          if(mapp.size()==k)
                {

                 maxi=Math.max(maxi,sum);
                }
         
    
                  return maxi;

        
    }
}