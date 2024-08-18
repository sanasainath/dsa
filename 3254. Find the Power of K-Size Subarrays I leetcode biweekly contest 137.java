class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int res[]=new int[n-k+1];
        int xx=0;
        for(int i=0;i<=n-k;i++)
        {
            boolean check=false;
            for(int j=i+1;j<k+i;j++)
            {
                if(nums[j-1]+1!=nums[j])
                {
                   check=true;
                   break;
                }
            }
            if(!check)
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