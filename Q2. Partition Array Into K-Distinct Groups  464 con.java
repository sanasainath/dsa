class Solution {
    public boolean partitionArray(int[] nums, int k) {
        HashMap<Integer,Integer>mapp=new HashMap<>();
        if(nums.length%k!=0)
        {
            return false;
        }
        for(int i:nums)
            {
                mapp.put(i,mapp.getOrDefault(i,0)+1);
            }
        if(nums.length==k)
        {
            if(mapp.size()!=k)
            {
                return false;
            }
        }
        int v=nums.length/k;
         for(Integer value:mapp.values())
             {
               if(value>v)
               {
                   return false;
               }
                   
             }
        
//    43
// 66 66
//     106 106
//     33
     
        return true;
    }
}©leetcode