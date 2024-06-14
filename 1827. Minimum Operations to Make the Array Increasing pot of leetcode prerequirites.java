class Solution {
    public int minOperations(int[] nums) {
        int count=0;

      
        for(int i=1;i<nums.length;i++)
    {
        while(nums[i]<=nums[i-1])
        {
            nums[i]=nums[i]+1;
            count++;

        }
    }
    return count;
        
    }
}