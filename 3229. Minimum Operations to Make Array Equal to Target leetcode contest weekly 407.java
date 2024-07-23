class Solution {
    public long minimumOperations(int[] nums, int[] target) {
        int decop=0;
        int incop=0;
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=target[i]-nums[i];
            if(nums[i]>0)
            {
                if(incop<nums[i])
                {
                     int diff=nums[i]-incop;
                ans+=diff;
                }
                
                incop=nums[i];
                decop=0;
            }
            else if(nums[i]<0)
            {
                if(-nums[i]>decop)
                {
                    int diff=-nums[i]-decop;
                    ans+=diff;
                }
                decop=-nums[i];
                incop=0;
            }
            else
            {
                decop=0;
                incop=0;
            }
        }
        return ans;
        
    }
}