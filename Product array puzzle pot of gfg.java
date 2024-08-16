class Solution {
    public static long[] productExceptSelf(int nums[]) {
        // code here
        long zeroes=0;
        long check1=1;
        long check2=1;
        for(int i:nums)
        {
            if(i==0)
            {
                zeroes++;
            }
            if(i!=0)
            {
                check2=check2*i;
            }
          check1=check1*i;
        }
        long []res=new long[nums.length];
        if(zeroes>1)
        {
            return res;
        }
        int ind=0;
        for(int i:nums)
        {
            if(i!=0)
            {
                 res[ind]=check1/i;
            }
            else
            {
                res[ind]=check2;
            }
            ind++;
        }
        return res;
        
    }
}