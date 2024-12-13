class Pair {
    int val;
    int ind;

    Pair(int val, int ind) {
        this.val = val;
        this.ind = ind;
    }
}

class Solution {
    public long findScore(int[] nums) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((p, q) -> {
            if (p.val != q.val) {
                return p.val - q.val;
            } else {
                return p.ind - q.ind;
            }

        });
        for (int i = 0; i < nums.length; i++) {
            pq.offer(new Pair(nums[i], i));

        }
        long score = 0;
        boolean[] visited = new boolean[nums.length];

        while (!pq.isEmpty()) {

            Pair pair = pq.poll();
            int value = pair.val;
            int index = pair.ind;
            if (!visited[index]) {
                visited[index] = true;

                score += value;
                if (index - 1 >= 0) {
                    visited[index - 1] = true;

                }
                if (index + 1 < nums.length) {
                    visited[index + 1] = true;

                }
            }

        }
        return score;

    }
}