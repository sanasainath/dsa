class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int[] memo = new int[energy.length];
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < energy.length; i++) {
            int xx = path(energy, k, i, memo);
            maxi = Math.max(maxi, xx);
        }
        return maxi;
    }

    public static int path(int[] energy, int k, int i, int[] memo) {
        if (i >= energy.length) {
            return 0;
        }
        if (memo[i] != 0) {
            return memo[i];
        }
        memo[i] = energy[i] + path(energy, k, i + k, memo);
        return memo[i];
    }
}
