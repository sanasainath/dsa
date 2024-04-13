import java.util.Arrays;

class Solution {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        int[] x = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            x[i] = points[i][0];
        }
        Arrays.sort(x); // Sort the x-coordinates
        
        int count = 0; // Initialize count to 1 as we start counting from the second element
        int ref=x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] - ref > w) {
                count++; // Increment count if the gap between x-coordinates is greater than w
                ref=x[i];
            }
        }
        
        return count+1;
    }
}
