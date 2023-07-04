class Solution {
    public int[] twoSum(int[] nums, int target) {
       
     HashMap<Integer, Integer> mpp = new HashMap<>();
     int arr[]=new int[2];
     for(int i=0;i<nums.length;i++)
     {
        
         int res=target-nums[i];
         if(mpp.containsKey(res))
         {
             arr[0]=mpp.get(res);
             arr[1]=i;
             return arr;

         }
         mpp.put(nums[i],i);
         }
         return arr;
        
    }
}