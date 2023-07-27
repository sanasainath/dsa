
class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int temp=Integer.MAX_VALUE;
        while(low<=high)
        {
                int mid=(low+high)/2;
                if(nums[low]<=nums[mid])
                {
                    temp=Math.min(temp,nums[low]);
                    low=mid+1;
                }
                else
                {
                    temp=Math.min(temp,nums[mid]);
                    high=mid-1;
                }

        }
        return temp;
        
    }
}