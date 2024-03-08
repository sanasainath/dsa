//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            
            Solution ob = new Solution();
            if(ob.sameFreq(a)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    boolean sameFreq(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        
        // Count frequency of each character in the string
        for(int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        int maxFreq = 0;
        int minFreq = Integer.MAX_VALUE;
        int numMaxFreq = 0;
        int numMinFreq = 0;
        
        // Find the maximum and minimum frequencies
        for (int freq : map.values()) {
            maxFreq = Math.max(maxFreq, freq);
            minFreq = Math.min(minFreq, freq);
        }
        
        // Count the number of characters with maximum and minimum frequencies
        for (int freq : map.values()) {
            if (freq == maxFreq) {
                numMaxFreq++;
            }
            if (freq == minFreq) {
                numMinFreq++;
            }
        }
        
        // If all characters have the same frequency or there is only one character
        if (maxFreq == minFreq || map.size() == 1) {
            return true;
        }
        
        // If the difference between max and min frequencies is at most 1 and there is at most one character with a frequency different from the others
        if ((maxFreq - minFreq == 1 && numMaxFreq == 1) || (minFreq == 1 && numMinFreq == 1 && numMaxFreq == map.size() - 1)) {
            return true;
        }
        
        return false;
    }
}

