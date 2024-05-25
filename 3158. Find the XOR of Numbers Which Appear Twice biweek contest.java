class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer>mapp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            mapp.put(nums[i],mapp.getOrDefault(nums[i],0)+1);
        }
        int sum =0;
       for(Map.Entry<Integer,Integer>en:mapp.entrySet())
       {
        if(en.getValue()==2)
        {
            sum^=en.getKey();
        }
       }
        return sum;
        
    }
}