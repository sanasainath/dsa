class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) 
    {
        
        int n=nums.length;
        while(k>0)
        {
            int index=path(nums);
            nums[index]=nums[index]*multiplier;
            k--;
            
            
        }
        return nums;
        
        
    }
    public static int path(int []nums)
    {
        int mini=nums[0];
        int ind=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<mini||nums[i]==mini&&i<ind)
            {
                mini=nums[i];
                ind=i;
            }
        }
        return ind;
    }
}