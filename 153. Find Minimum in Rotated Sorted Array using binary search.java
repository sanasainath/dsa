class Solution {
    public int findMin(int[] nums) {
        // Arrays.sort(nums);
        // return nums[0];
        //binary searchj
       int low=0;
       int high=nums.length-1;
       int ans=Integer.MAX_VALUE;
       while(low<=high)
       {
        int mid=(low+high)/2;
        if(nums[low]<=nums[mid])
        {
            ans=Math.min(ans,nums[low]);
            low=mid+1;
        }
        else
        {
            ans=Math.max(ans,nums[mid]);
            high=mid-1;
        }
       }
       return ans;
        
    }
}