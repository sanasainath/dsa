class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int xx = queries[i][0];
            while (xx <= queries[i][1]) {
                nums[xx] = (int) (((long) nums[xx] * queries[i][3]) % 1000000007);
                // nums[xx] = (int) (((long) nums[xx] * queries[i][3]) % MOD);

                xx += queries[i][2];
            }
        }
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num = nums[i] ^ num;
        }
        return num;
    }
}©leetcode