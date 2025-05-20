class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
    //    for(int i=0;i<nums.length;i++)
    //    {
    //     for(int []query:queries)
    //     {
    //         if(query[0]<=i&&query[1]>=i)
    //         {
    //             if(nums[i]!=0)
    //             {
    //                 nums[i]=nums[i]-1;
    //             }
    //         }
    //     }
    //    }
    //    for(int i:nums)
    //    {
    //     if(i!=0)
    //     {
    //         return false;
    //     }
       
    //    }
    //     return true;
    // HashMap<Integer,Integer>mapp=new HashMap<>();
    // for(int i=0;i<nums.length;i++)
    // {
    //     if(nums[i]!=0)
    //     {
    //   mapp.put(i,nums[i]);
    //     }
       
    // }
    int []z=new int[nums.length];
    int []diff=new int[nums.length+1];
     

            for(int []query:queries)
        {
           diff[query[0]]+=1;
           diff[query[1]+1]-=1;
        }
        for(int i=0;i<z.length;i++)
        {
            if(i==0)
            {
                z[i]=diff[i];
            }
            else
            {
                z[i]=z[i-1]+diff[i];
            }
        }
       for(int i=0;i<nums.length;i++)
       {
        if(z[i]<nums[i])
        {
            return false;
        }
       }
        return true;
      
    }
}
