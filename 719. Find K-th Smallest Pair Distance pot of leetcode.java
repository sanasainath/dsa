class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int high=nums[n-1]-nums[0];
        int low=Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
        {
            low=Math.min(low,Math.abs(nums[i-1]-nums[i]));
        }
        while(low<high)
        {
            int mid=(low+high)/2;
            int left=0;
            int count=0;
            for(int i=1;i<n;i++)
            {
                while(Math.abs(nums[left]-nums[i])>mid)
                {
                    left++;
                }
                if(Math.abs(nums[left]-nums[i])<=mid)
                {

                  count+=(i-left);
                }
            
            }
            if(count>=k)
            {
                high=mid;
            }
            else
            {
                low=mid+1;
            }
            

        }
        return low;
    }
}