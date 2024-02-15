import java.util.Arrays;
class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum=0;
        int n=nums.length;
        long target=0;
        for(int i=0;i<2;i++)
        {
            sum=sum+nums[i];
        }
        if(sum>nums[2])
        {
            target=sum+nums[2];
        }
        for(int i=2;i<n-1;i++)
        {
            sum=sum+nums[i];
            if(sum>nums[i+1])
            {
                target=sum+nums[i+1];
            }
        }
        if(target==0)
        {
            return -1;
        }
        return target;
        
    }
}