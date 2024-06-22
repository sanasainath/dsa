class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                nums[i]=0;
            }
            else
            {
                nums[i]=1;
            }
        }
        return fn(nums,k)-fn(nums,k-1);
      

        
    }
    public static int fn(int []nums,int k)
    {
          int n=nums.length;
          int left=0;
          int sum=0;
          int count=0;
          
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            while(sum>k&&left<=i)
            {
                sum-=nums[left];
                left++;
            }
            count+=((i-left)+1);
           
           
        }
        return count;
    }
}