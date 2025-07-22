class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer>mapp=new HashSet<>();
        int left=0;
        int right=0;
        int maxi=0;
        int sum=0;
        while(right<nums.length)
        {
          while(left<right&&mapp.contains(nums[right]))
          {
            mapp.remove(nums[left]);
             sum-=nums[left];
            left++;
          }
          sum+=nums[right];
          mapp.add(nums[right]);
          maxi=Math.max(maxi,sum);
          right++;
        }
        return maxi;
    }
}