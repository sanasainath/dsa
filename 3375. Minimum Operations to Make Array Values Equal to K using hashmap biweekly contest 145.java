class Solution {
    public int minOperations(int[] nums, int k) {
        for(int i:nums)
            {
                if(k>i)
                {
                    return -1;
                }
            }
      
        HashMap<Integer,Integer>mapp=new HashMap<>();
        for(int i:nums)

            {
                mapp.put(i,mapp.getOrDefault(i,0)+1);
            }
        if(!mapp.containsKey(k))
        {
            return mapp.size();
        }
        return mapp.size()-1;
        
    }
}