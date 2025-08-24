class Solution {
    public int longestSubarray(int[] nums) {
        int []arr=new int [nums.length];
        int one=0;
        for(int i=0;i<nums.length;i++)
        {
          
          arr[i]=one;
          if(nums[i]==1)
          {
            one++;
          }
          else
          {
            one=0;
          }


        }
        one=0;
        int []suf=new int[nums.length];
           for(int i=nums.length-1;i>=0;i--)
        {
          
          suf[i]=one;
          if(nums[i]==1)
          {
            one++;
          }
          else
          {
            one=0;
          }


        }
        int maxi=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                maxi=Math.max(suf[i],maxi);
            }
            else if(i==nums.length-1)
            {
                maxi=Math.max(arr[i],maxi);
            }
            else
            {
                int sum=suf[i]+arr[i];
                maxi=Math.max(sum,maxi);
            }
        }
        return maxi;

    }
}