class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length%2!=0)
        {
            return false;
        }
        int nn=nums.length/2;
        HashMap<Integer,Integer>mapp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
        mapp.put(nums[i],mapp.getOrDefault(nums[i],0)+1);
        }
        for(Integer val:mapp.values())
        {
            if(val%2!=0)
            {
                return false;
            }
        }
        return true;

        
    }
}