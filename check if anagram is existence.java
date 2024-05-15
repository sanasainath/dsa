//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String S;
            S = br.readLine();

            Solution obj = new Solution();
            String res = obj.doesExists(S);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static String doesExists(String S) {
        // code here
        HashSet<Character>set=new HashSet<>();
        for(char ch:S.toCharArray())
        {
            set.add(ch);
        }
        if(set.size()>1)
        {
            return "YES";
        }
        return "NO";
    }
}
