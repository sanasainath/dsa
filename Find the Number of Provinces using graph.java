public class Solution {
    public static int findNumOfProvinces(int[][] roads, int n) {
        boolean[] visited = new boolean[n];
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                dfs(roads, visited, n, i);
            }
        }
        
        return count;
    }
    
    public static void dfs(int[][] roads, boolean[] visited, int n, int city) {
        visited[city] = true;
        
        for (int i = 0; i < n; i++) {
            if (roads[city][i] == 1 && !visited[i]) {
                dfs(roads, visited, n, i);
            }
        }
    }
}
