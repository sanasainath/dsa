import java.util.Arrays;

class Solution {
    public long minOperationsToMakeMedianK(int[] nums, int k) {
        Arrays.sort(nums);
        long sum = 0;
        int n = nums.length;
        
        // Handle empty array
        if (n == 0) {
            return -1; // Or throw an exception
        }
        
        int mid = n / 2;
    
        
        if (k == nums[mid]) {
            return 0;
        }
        
        if (nums[mid] > k) {
            sum += nums[mid] - k;
        } else {
            sum += k - nums[mid];
        }
        
        for (int i = 0; i < mid; i++) {
            if (nums[i] > k) {
                sum += nums[i] - k;
           
            }
        }
        
        for (int j = mid + 1; j < n; j++) {
            if (nums[j] < k) {
                sum += k - nums[j];
            
            }
        }
        
        return sum;
    }
}
