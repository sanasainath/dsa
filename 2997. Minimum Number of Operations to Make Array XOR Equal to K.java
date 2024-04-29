class Solution {
    public int minOperations(int[] nums, int k) {

        int ans = 0;
        for (int i = 0; i < 20; i++) {
            int xorVal = 0;

            for (int j = 0; j < nums.length; j++) {
                int bit = (1 << i) & nums[j];
                xorVal = xorVal ^ bit;
            }
            int kbit = (1 << i) & k;
            if (xorVal != kbit) {
                ans++;
            }
        }
        return ans;
    }
}