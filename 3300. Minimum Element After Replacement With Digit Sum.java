class Solution {
    public int minElement(int[] nums) {
        int mini=Integer.MAX_VALUE;
        for(int i:nums)
        {
            int sum=0;
            while(i>0)
            {
                sum+=i%10;
                i=i/10;
            }
            mini=Math.min(sum,mini);

        }
        return mini;
        
    }
}
