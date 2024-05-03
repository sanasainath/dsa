class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse the digits array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // If the digit is less than 9, just increment it and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the digit is 9, set it to 0 and continue to the next iteration
            digits[i] = 0;
        }
        
        // If we reach here, it means all digits were 9
        // We need to add an additional digit at the beginning
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
