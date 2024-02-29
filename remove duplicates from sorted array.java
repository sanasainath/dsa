class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1) {
            return n; // No duplicates can exist in an array of length 0 or 1
        }
        
        int uniqueIndex = 0; // Index to track the position for the next unique element
        
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[uniqueIndex++] = nums[i]; // Move the unique element to the correct position
            }
        }
        
        nums[uniqueIndex++] = nums[n - 1]; // Copy the last element as it's always unique
        
        return uniqueIndex; // Return the length of the modified array
    }
}
