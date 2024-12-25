class Solution {
    public long continuousSubarrays(int[] nums) {
    
        long count=0;
        int left=0;
        int right=0;
        HashMap<Integer,Integer>mapp=new HashMap<>();
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        while(right<nums.length)
        {
            int curr=nums[right];
            mapp.put(curr,mapp.getOrDefault(curr,0)+1);
            mini=Math.min(mini,curr);
            maxi=Math.max(maxi,curr);
            while(maxi-mini>2)
            {
                mapp.put(nums[left],mapp.get(nums[left])-1);
                if(mapp.get(nums[left])==0)
                {
                    mapp.remove(nums[left]);
                }
                mini=Integer.MAX_VALUE;
                maxi=Integer.MIN_VALUE;
                for(int keys:mapp.keySet())
                {
                   mini=Math.min(mini,keys);
                   maxi=Math.max(maxi,keys);
                }
                left++;
                
            }
          
             count+=(right-left+1);
          
            right++;

        }
           return count;
    }
}