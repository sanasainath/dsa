class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int maxi=Integer.MAX_VALUE;
        while(l<=r)
            {
                int sum=0;
                int right=0;
                while(right<l)
                    {
                        sum+=nums.get(right);
                        right++;
                    }
                if(sum>0)
                {
                    maxi=Math.min(sum,maxi);
                }
                int left=0;
                while(right<nums.size())
                    {
                        sum-=nums.get(left);
                        left++;
                        sum+=nums.get(right);
                        right++;
                        if(sum>0)
                        {
                             maxi=Math.min(sum,maxi);
                        }
                    }
                l++;
            }
        
        return maxi==Integer.MAX_VALUE?-1:maxi;
        
    }
}