class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i=i+3)
        {
            HashMap<Integer,Integer>mapp=new HashMap<>();
            for(int j=i;j<nums.length;j++)
            {
                mapp.put(nums[j],mapp.getOrDefault(nums[j],0)+1);
            }
            boolean check=false;
            for(int value:mapp.values())
            {
                if(value!=1)
                {
                    check=true;
                }
            }

            if(!check)
            {
                return count;
            }
            else
            {
                count++;
            }
        }
        return count;
        
    }
}