import java.util.Arrays;

class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int[][] jobs = new int[n][2];
        
        // Pair difficulties with profits
        for (int i = 0; i < n; i++) {
            jobs[i][0] = difficulty[i];
            jobs[i][1] = profit[i];
        }
        
        // Sort jobs by difficulty
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        
        // Sort workers by their abilities
        Arrays.sort(worker);
        
        int maxProfit = 0, sum = 0, i = 0;
        
        // Iterate over each worker
        for (int ability : worker) {
            // While there are jobs that the worker can perform
            while (i < n && jobs[i][0] <= ability) {
                // Update maxProfit to the highest profit job the worker can perform
                maxProfit = Math.max(maxProfit, jobs[i][1]);
                i++;
            }
            // Add the max profit the current worker can earn
            sum += maxProfit;
        }
        
        return sum;
    }
}
