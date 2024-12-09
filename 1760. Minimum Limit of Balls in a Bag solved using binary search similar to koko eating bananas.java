class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int low=1;
        int high=0;
        for(int i:nums)
        {
            high=Math.max(high,i);
        }
        while(low<high)
        {
            int mid=(low+high)/2;
            if(check(mid,maxOperations,nums))
            {
                high=mid;

            }
            else
            {
                low=mid+1;
            }
        }
        return low;
        
    }
    public static boolean check(int mid,int maxOperations,int []nums)
    {
        int count=0;
        for(int i:nums)
        {
            count+=(int)Math.ceil((double)i/mid)-1;
            

        }
        if(count<=maxOperations)
        {
            return true;
        }
        return false;
    }
}