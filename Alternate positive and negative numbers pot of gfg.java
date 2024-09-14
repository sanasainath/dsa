class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // Separate positive and negative numbers into different lists
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> res1 = new ArrayList<>();

        // Split the input array into negatives and positives
        for (Integer ii : arr) {
            if (ii < 0) {
                res.add(ii); // Negative numbers
            } else {
                res1.add(ii); // Positive numbers
            }
        }

        int xx = 0, yy = 0; // Pointers for negatives and positives

        // Rearrange with alternating positives and negatives
        for (int i = 0; i < arr.size(); i++) {
            if (i % 2 == 0 && yy < res1.size()) {
                arr.set(i, res1.get(yy++)); // Positive number at even index
            } else if (xx < res.size()) {
                arr.set(i, res.get(xx++)); // Negative number at odd index
            }  else {
                arr.set(i, res1.get(yy++)); // Fill remaining slots with negatives
            }
        }
      
        
    }
}a