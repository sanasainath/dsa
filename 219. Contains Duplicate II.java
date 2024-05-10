class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
              int x=map.get(nums[i]);
              if(Math.abs(x-i)<=k)
              {
                return true;
              }
            }
            map.put(nums[i],i);


        }
        return false;
     

        
    }
}