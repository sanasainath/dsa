class Complete {

    // Function for finding minimum swaps to group all 1's together
    public static int minSwaps(int arr[], int n) {
        // Step 1: Count total number of 1's in the array
        int totalones = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                totalones++;
            }
        }

        // If there are no 1's, return -1
        if (totalones == 0) {
            return -1;
        }

        // If array length is less than totalones, it's impossible to group them
        if (n < totalones) {
            return -1;
        }

        // Step 2: Count number of 1's in the first window of size totalones
        int currentones = 0;
        for (int i = 0; i < totalones; i++) {
            if (arr[i] == 1) {
                currentones++;
            }
        }

        // Step 3: Use sliding window technique to find the max number of 1's in any window of size totalones
        int maxones = currentones;
        int left = 0;
        for (int right = totalones; right < n; right++) {
            if (arr[left] == 1) {
                currentones--;
            }
            if (arr[right] == 1) {
                currentones++;
            }
            left++;
            maxones = Math.max(maxones, currentones);
        }

        // Step 4: The minimum swaps needed is totalones - maxones
        return totalones - maxones;
    }
}