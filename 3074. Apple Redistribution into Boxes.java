import java.util.Arrays;

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int n = apple.length;
        int m = capacity.length;

        Arrays.sort(capacity);
        int sum = Arrays.stream(apple).sum();
        int ans = 0;

        for (int i = m - 1; i >= 0; i--) {
            if (sum <= 0) break;
            ans++;
            sum -= capacity[i];
        }

        return ans;
    }
}
