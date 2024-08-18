class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int []res=new int[n-k+1];
        int xx=0;
        if(k==1)
        {
            for(int i:nums)
            {
                res[xx++]=i;
            }
            return res;

        }
        boolean check=true;
        for(int i=1;i<k;i++)
        {
            if(nums[i-1]+1!=nums[i])
            {
                check=false;
                break;
            }
        }
        if(check)
        {
            res[xx++]=nums[k-1];
        }
        else
        {
            res[xx++]=-1;
        }
        for(int i=1;i<=n-k;i++)
        {
            if(check)
            {
                if(nums[i+k-1]!=nums[i+k-2]+1)
                {
                    check=false;
                  
                }
            }
            else
            {
                check=true;
                for(int j=i+1;j<i+k;j++)
                {
                    if(nums[j-1]+1!=nums[j])
                    {
                        check=false;
                        break;

                    }
                }

            }
            if(check)
            {
                res[xx++]=nums[i+k-1];
            }
            else
            {
                res[xx++]=-1;
            }
        }
        return res;
        
    }
}