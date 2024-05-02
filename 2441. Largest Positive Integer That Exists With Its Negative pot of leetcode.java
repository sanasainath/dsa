class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]>0&&set.contains(-nums[i]))
            {
                return nums[i];


            }
        }
        return -1;

        
    }
}