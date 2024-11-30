class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
          HashMap<String, PriorityQueue<String>> graph = new HashMap<>();
        HashMap<String, Integer> indegree = new HashMap<>();
        HashMap<String, Integer> outdegree = new HashMap<>();
        for (List<String>list: tickets) {
            String f = list.get(0);
            String  s = list.get(1);
            graph.computeIfAbsent(f, k -> new PriorityQueue<>()).offer(s);
            indegree.put(s, indegree.getOrDefault(s, 0) + 1);
            outdegree.put(f, outdegree.getOrDefault(f, 0) + 1);

        }
        String start = "JFK";
        
        List<String> ans = new ArrayList<>();
        dfs(ans, graph, start);
        ans.add(start);
        Collections.reverse(ans);
      
        
        return ans;

    }
      public static void dfs(List<String> li, HashMap<String, PriorityQueue<String>> graph, String start) {
        if (graph.containsKey(start)) {
            PriorityQueue<String> st = graph.get(start);
            while (!st.isEmpty()) {
                String res = st.poll();
                dfs(li, graph, res);
                li.add(res);

            }

        }
    }
}