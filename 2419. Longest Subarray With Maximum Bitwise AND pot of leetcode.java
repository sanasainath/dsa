class Solution {
    public int longestSubarray(int[] nums) {
        int maxi=0;
        for(int num:nums)
        {
            maxi=Math.max(num,maxi);
        }
        int res=0;
        int count=0;
        for(int i:nums)
        {
            if(i==maxi)
            {
                count++;
                res=Math.max(res,count);
            }
            else
            {
                count=0;
            }
        }
        return res;

        
    }
}