class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int[] arr) {

        // Your code here
        long sum=0;
        long maxi=Long.MIN_VALUE;
        for(int i:arr)
        {
             
            
            if(sum<0)
            {
                sum=0;
            }
            sum+=i;
             maxi=Math.max(maxi,sum);
          
        }
        return maxi;
    }
}
