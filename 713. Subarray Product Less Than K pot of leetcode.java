class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
 int n=nums.length;
 int count=0;
 int sum=0;
 for(int i=0;i<n;i++)
 {
     sum=1;
    for(int j=i;j<n;j++)
    {
        
        sum=sum*nums[j];
        if(sum<k)
        {
            count++;
        }
        else
        {
            break;
        }

    }
 }
 return count;

        
    }
}