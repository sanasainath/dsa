class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer>li=new ArrayList<>();
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==target)
        {
            li.add(i);
        }
        else if(nums[i]>target)
        {
            break;
        }
       }
        return li;
        
    }
}
