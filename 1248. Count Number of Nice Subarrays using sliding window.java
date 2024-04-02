class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        return path(nums,k)-path(nums,k-1);
        
    }
    public static int path(int []nums,int k)
    {
        int n=nums.length;
        int left=0;
        int maxi=0;
        int count=0;
        for(int right=0;right<n;right++)
        {
            if(nums[right]%2!=0)
            {
                count++;
            }
            while(count>k)
            {
                if(nums[left]%2!=0)
                {
                    count--;
                }

              
                left++;
               
            }
            maxi+=right-left+1;
        }
        return maxi;
    }
}