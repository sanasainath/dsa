class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;  
        int can=nums[0];
        int count=1;
        for(int i=1;i<n;i++)
        {
            if(count==0)
            {
                can=nums[i];
            }
            if(can==nums[i])
            {
                count++;
            }
            else
            {
                count--;
            }


        }
        return can;
        
    }
}