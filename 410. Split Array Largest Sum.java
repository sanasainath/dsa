class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
        }
        int start=nums[0];
        int end=sum;
        int res=0;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(check(mid,k,nums))
            {
                res=mid;
                 end=mid-1;

            }
            else
            {
                start=mid+1;
            }
        }
        return res;

        
    }
    public static boolean check(int mid,int k,int []nums)
    {
        int p=0;
        int s=1;
        for(int i=0;i<nums.length;i++)
        {

            if(nums[i]>mid)
            {
                return false;
            }
            if(nums[i]+p>mid)
            {
                p=0;
                s++;
                p+=nums[i];

            }
            else
            {
                p+=nums[i];
            }
        }
        if(s>k)
        {
            return false;
        }
        return true;
    }
}