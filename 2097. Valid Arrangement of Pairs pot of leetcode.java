class Solution {
    public int[][] validArrangement(int[][] pairs) {
        int n = pairs.length;
        HashMap<Integer, Stack<Integer>> graph = new HashMap<>();
        HashMap<Integer, Integer> indegree = new HashMap<>();
        HashMap<Integer, Integer> outdegree = new HashMap<>();
        for (int[] pair : pairs) {
            int f = pair[0];
            int s = pair[1];
            graph.computeIfAbsent(f, k -> new Stack<>()).push(s);
            indegree.put(s, indegree.getOrDefault(s, 0) + 1);
            outdegree.put(f, outdegree.getOrDefault(f, 0) + 1);

        }
        int start = -1;
        for (Integer ii : graph.keySet()) {
            int xx = outdegree.containsKey(ii) ? outdegree.get(ii) : 0;
            int yy = indegree.containsKey(ii) ? indegree.get(ii) : 0;
            if (xx - yy == 1) {
                start = ii;
                break;
            }
        }
        if (start == -1) {
            for (Integer ii : graph.keySet()) {
                start = ii;
                break;
            }

        }
        List<int[]> ans = new ArrayList<>();
        dfs(ans, graph, start);
        Collections.reverse(ans);
        int[][] result = new int[ans.size()][2];
        int xx = 0;
        for (int[] an : ans) {
            result[xx][0] = an[0];
            result[xx][1] = an[1];
            xx++;
        }
        return result;

    }

    public static void dfs(List<int[]> li, HashMap<Integer, Stack<Integer>> graph, int start) {
        if (graph.containsKey(start)) {
            Stack<Integer> st = graph.get(start);
            while (!st.isEmpty()) {
                int res = st.pop();// 9 4 5 1
                dfs(li, graph, res);
                li.add(new int[] { start, res });

            }

        }
    }
}