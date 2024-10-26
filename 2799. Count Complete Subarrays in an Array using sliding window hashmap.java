class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashMap<Integer,Integer>mapp=new HashMap<>();
        int count=0;
        for(int i:nums)
        {
           mapp.put(i,mapp.getOrDefault(i,0)+1);
        }
        int d=mapp.size();
        mapp.clear();
        int left=0;
        for(int i=0;i<nums.length;i++)
        {
           mapp.put(nums[i],mapp.getOrDefault(nums[i],0)+1);
            while(mapp.size()==d)
            {
                count+=(nums.length-i);
                mapp.put(nums[left],mapp.get(nums[left])-1);
                if(mapp.get(nums[left])==0)
                {
                    mapp.remove(nums[left]);
                }
                left++;
            }
            
        }
        return count;
        
    }
    // public static boolean check(HashSet<Integer>set,HashSet<Integer>sub)
    // {
    //     for(int ii:set)
    //     {
    //         if(!sub.contains(ii))
    //         {
    //             return false;
    //         }
    //     }
    //     return true;

    // }
}