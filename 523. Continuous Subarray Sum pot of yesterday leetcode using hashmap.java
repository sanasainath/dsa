class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       HashMap<Integer,Integer>mapp=new HashMap<>();
       int sum=0;
       for(int i=0;i<nums.length;i++)
       {
        sum+=nums[i];
        int rem=sum%k;
        if(rem==0&&i>0)
        {
            return true;
        }
        if(mapp.containsKey(rem))
        {
            if(i-mapp.get(rem)>=2)
            {
                return true;
            }

        }
        if(!mapp.containsKey(rem))
        {
            mapp.put(rem,i);
        }

       }
       return false;
    }
}