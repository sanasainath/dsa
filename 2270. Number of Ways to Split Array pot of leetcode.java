class Solution {
    public int waysToSplitArray(int[] nums) {
  
        int res=0;
        // for(int i=0;i<nums.length-1;i++)
        // {
        //    sum+=nums[i];
        //    int sum1=0;
        //    for(int j=i+1;j<nums.length;j++)
        //    {
        //     sum1+=nums[j];
        //    }
        //    if(sum>=sum1)
        //    {
        //     res++;
        //    }
        // }   will raise TLE ..................
        //so prefix sum will use...
         long []prefix=new long[nums.length];
     
         for(int i=0;i<nums.length;i++)
         {
             if(i==0)
             {
                prefix[i]=nums[i];
             }
             else
             {
                prefix[i]=prefix[i-1]+nums[i];
             }

         }
       
        for(int i=0;i<nums.length-1;i++)
        {
        
          long diff=prefix[nums.length-1]-prefix[i];
          
          if(prefix[i]>=diff)
          {
            res++;
          }
        }
        return res;
        
    }
}