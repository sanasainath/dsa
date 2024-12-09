class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean res[]=new boolean[queries.length];
        int xx=0;
        int []prefix=new int[nums.length];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]%2==nums[i]%2)
            {
                prefix[i]=1;
            }
           
        }
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i]+prefix[i-1];
        }
        for(int []query:queries)
        {
            int left=query[0];
            int right=query[1];
            if(left==right)
            {
                res[xx++]=true;
            }
            else
            {
                int q=prefix[right]-prefix[left];
                if(q==0)
                {
                    res[xx++]=true;
                }
                else
                {
                    res[xx++]=false;
                }
            }
        }
        return res;

        
    }
}