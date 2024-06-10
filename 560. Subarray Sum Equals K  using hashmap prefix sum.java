class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>mapp=new HashMap<>();
        mapp.put(0,1);
        int count=0;
        int presum=0;
        for(int i=0;i<nums.length;i++)
        {
            presum+=nums[i];
            int xx=presum-k;
            if(mapp.containsKey(xx))
            {
                count+=mapp.get(xx);
              
            }
            mapp.put(presum,mapp.getOrDefault(presum,0)+1);
        }
        return count;
     
        
    }
}