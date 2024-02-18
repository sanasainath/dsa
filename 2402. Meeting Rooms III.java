import java.util.*;

class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
        int[] ans = new int[n];
        
        PriorityQueue<Pair<Long, Long>> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a.getKey()));
        PriorityQueue<Long> pq2 = new PriorityQueue<>();

        for (int i = 0; i < n; i++)
            pq.offer(new Pair<>(0L, (long) i));

        long time = 0;
        for (int i = 0; i < meetings.length; i++) {
            time = Math.max(time, meetings[i][0]);

            while (!pq.isEmpty() && time >= pq.peek().getKey()) {
                pq2.offer(pq.poll().getValue());
            }

            if (pq2.isEmpty()) {
                time = pq.peek().getKey();
                while (!pq.isEmpty() && time >= pq.peek().getKey()) {
                    pq2.offer(pq.poll().getValue());
                }                
            }

            long meet = pq2.poll();
            ans[(int) meet]++;
            pq.offer(new Pair<>(time + meetings[i][1] - meetings[i][0], meet));
        }

        int room = 0;
        int MAX = 0;

        for (int i = 0; i < n; i++) {
            if (ans[i] > MAX) {
                MAX = ans[i];
                room = i;
            }
        }

        return room;
    }
}
