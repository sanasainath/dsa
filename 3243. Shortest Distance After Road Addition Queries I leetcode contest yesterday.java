import java.util.*;

class Pair {
    int x;
    int y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            li.add(new ArrayList<>());
        }

        // Initialize the graph with edges between consecutive nodes
        for (int i = 0; i < n - 1; i++) {
            li.get(i).add(i + 1);
        }

        List<Integer> dl = new ArrayList<>();
        
        for (int[] query : queries) {
            // Add edge from query[0] to query[1]
            li.get(query[0]).add(query[1]);
            // If the graph is undirected

            // Use Dijkstra's algorithm to find the shortest path from node 0 to node n-1
            PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.y));
            boolean[] visited = new boolean[n];
            int[] distances = new int[n];
            Arrays.fill(distances, Integer.MAX_VALUE);

            pq.offer(new Pair(0, 0));
            distances[0] = 0;

            while (!pq.isEmpty()) {
                Pair p = pq.poll();
                int node = p.x;
                int weight = p.y;

                if (visited[node]) continue;
                 visited[node] = true;

                for (int neighbor : li.get(node)) {
                    if (!visited[neighbor]) {
                       
                        int newDist = weight + 1; // Since each edge has weight 1
                        if (newDist < distances[neighbor]) {
                            distances[neighbor] = newDist;
                            pq.offer(new Pair(neighbor, newDist));
                        }
                    }
                }
            }

            int result =  distances[n - 1];
            dl.add(result);
        }

        // Convert list to array
        int[] res = new int[dl.size()];
        for (int i = 0; i < dl.size(); i++) {
            res[i] = dl.get(i);
        }

        return res;
    }
}
