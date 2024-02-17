import java.util.PriorityQueue;

class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> ladderUsed = new PriorityQueue<>();
        int n = heights.length;
        int i = 0;
        for (i = 0; i < n - 1; i++) {
            if (heights[i] >= heights[i + 1]) {
                continue;
            } else {
                int diff = heights[i + 1] - heights[i];
                if (ladders > 0) {
                    ladderUsed.offer(diff);
                    ladders--;
                } else {
                    if (!ladderUsed.isEmpty() && diff > ladderUsed.peek()) {
                        bricks -= ladderUsed.poll();
                        ladderUsed.offer(diff);
                    } else {
                        bricks -= diff;
                    }
                    if (bricks < 0) break;
                }
            }
        }
        return i;
    }
}