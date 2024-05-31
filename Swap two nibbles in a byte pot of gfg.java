//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.swapNibbles(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int swapNibbles(int n) {
        // code here
          String binaryString = Integer.toBinaryString(n);

        // Ensure the binary string is exactly 8 bits long
        String eight = String.format("%8s", binaryString).replace(' ', '0');
        String xx=eight.substring(0,4);
        String yy=eight.substring(4,eight.length());
        String zz=yy+xx;
        
        return Integer.parseInt(zz,2);
        
    }
}