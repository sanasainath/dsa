class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int totalOnes = 0;

        // Count total number of 1s in the array
        for (int num : nums) {
            if (num == 1) {
                totalOnes++;
            }
        }

        // If there are no 1s, return -1
        if (totalOnes == 0) {
            return 0;
        }

        // Find the maximum number of 1s in any window of size totalOnes
        int maxOnesInWindow = 0;
        int currentOnes = 0;

        // Create the initial window
        for (int i = 0; i < totalOnes; i++) {
            if (nums[i] == 1) {
                currentOnes++;
            }
        }
        maxOnesInWindow = currentOnes;

        // Slide the window across the circular array
        for (int i = 1; i < n; i++) {
            // Remove the leftmost element of the previous window
            if (nums[(i - 1) % n] == 1) {
                currentOnes--;
            }
            // Add the rightmost element of the current window
            if (nums[(i + totalOnes - 1) % n] == 1) {
                currentOnes++;
            }
            // Update the maximum number of 1s found in any window
            maxOnesInWindow = Math.max(maxOnesInWindow, currentOnes);
        }

        // The minimum swaps needed is the difference between totalOnes and maxOnesInWindow
        return totalOnes - maxOnesInWindow;
    }
}