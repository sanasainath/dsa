class Solution {
    public int countKDifference(int[] nums, int k) {
            Arrays.sort(nums);
        int sum=0;
        HashMap<Integer,Integer>mapp=new HashMap<>();
        for(int i:nums)
        {
            
            if(mapp.containsKey(i-k))
            {
                sum+=mapp.get(i-k);
            }
            mapp.put(i,mapp.getOrDefault(i,0)+1);
           
        }
        return sum;
        
    }
}