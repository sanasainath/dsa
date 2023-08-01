class Solution {
    public boolean isPowerOfTwo(int n) {
     if (n <= 0) {
            return false; // Negative numbers and zero cannot be powers of two
        }

        return (n & (n - 1)) == 0;
    }
}