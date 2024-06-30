class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        //time limit exceeded.......
        // int xx=path(nums,0,-1);
        // if(xx>=3)
        // {
        //    return true; 
        // }
        // return false;
            if (nums.length < 3) {
            return false;
        }
        
        // Initialize first and second to maximum integer values
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        
        // Iterate through the array
        for (int num : nums) {
            // Update first if the current number is smaller or equal
            if (num <= first) {
                first = num;
            } 
            // Update second if the current number is larger than first but smaller or equal to second
            else if (num <= second) {
                second = num;
            } 
            // If the current number is larger than both first and second, we found our triplet
            else {
                return true;
            }
        }
        
        // If no triplet found, return false
        return false;
         
    }
    // public static int path(int []nums,int i,int prev)
    // {
    //     if(i==nums.length)
    //     {
    //         return 0;
    //     }
    //     int x=0;
    //     if(prev==-1||nums[i]>nums[prev])
    //     {
    //         x=1+path(nums,i+1,i);
    //     }
    //     int y=path(nums,i+1,prev);
    //     return Math.max(x,y);
    // }
}