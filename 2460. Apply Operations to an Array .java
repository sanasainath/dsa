class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                nums[i-1]=nums[i]*2;
                nums[i]=0;
                i++;
            }
        }
        int xx=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[xx]=nums[i];
                xx++;
            }
            else
            {
                count++;
            }
        }
        count=nums.length-count;
        for(int i=count;i<nums.length;i++)
        {
          nums[i]=0;
        }
        return nums;
        
    }
}