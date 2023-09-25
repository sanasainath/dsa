//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {
    public static int equilibriumPoint(long arr[], int n) {
        if (n == 1) {
            return 1; // There's only one element, so it's the equilibrium point.
        }
        
        long totalSum = 0;
        long leftSum = 0;

        // Calculate the total sum of all elements in the array
        for (long num : arr) {
            totalSum += num;
        }

        for (int i = 0; i < n; i++) {
            // Deduct the current element from the total sum
            totalSum -= arr[i];

            if (leftSum == totalSum) {
                // If the sum of elements on the left is equal to the sum of elements on the right
                // Return the index + 1 to convert it from 0-based to 1-based indexing
                return i + 1;
            }

            // Add the current element to the sum of elements on the left
            leftSum += arr[i];
        }

        // If no equilibrium point is found
        return -1;
    }
}
