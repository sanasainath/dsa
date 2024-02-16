import java.util.*;

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        int n = arr.length;
        HashMap<Integer, Integer> mapp = new HashMap<>();

        // Count occurrences of each integer
        for (int i = 0; i < n; i++) {
            mapp.put(arr[i], mapp.getOrDefault(arr[i], 0) + 1);
        }

        // Create a PriorityQueue to store entries based on their value (occurrences)
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        // Add all entries to the priority queue
        pq.addAll(mapp.entrySet());

        // Decrement k based on occurrences and remove corresponding entries
        while (!pq.isEmpty() && k > 0) {
            Map.Entry<Integer, Integer> entry = pq.poll();
            int occurrences = entry.getValue();
            if (k >= occurrences) {
                k -= occurrences;
            } else {
                // If k is less than occurrences, we need to remove only part of the occurrences
                entry.setValue(occurrences - k);
                k = 0; // Reset k to 0 as we have consumed all allowed removals
                pq.offer(entry); // Add the updated entry back to the priority queue
            }
        }

        // Return the remaining count of unique integers
        return pq.size();
    }
}
