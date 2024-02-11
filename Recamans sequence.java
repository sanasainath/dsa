//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.recamanSequence(n);
            for(int i = 0;i < n;i++)
                System.out.print(ans.get(i)+" ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
     static ArrayList<Integer> recamanSequence(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        
        helper(n, list, set);
        return list;
    }

    private static int helper(int n, ArrayList<Integer> list, HashSet<Integer> set) {
        if (n == 0) {
            list.add(0);
            set.add(0);
            return 0;
        }
        
        int prevElement = helper(n - 1, list, set);
        int element = prevElement - n;

        if (element <= 0 || set.contains(element)) {
            element = prevElement + n;
        }

        list.add(element);
        set.add(element);
        return element;
    }
}