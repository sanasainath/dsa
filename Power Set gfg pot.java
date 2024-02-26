//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
//  public List<String> AllPossibleStrings(String s) {
//         int n = s.length();
//         List<String> li = new ArrayList<>();
//         List<Character> dl = new ArrayList<>();
//         if (s.isEmpty()) {
//             return li;
//         }

//         help(0, li, s, dl);
//         Collections.sort(li);
//         return li;
//     }

//     public static void help(int i, List<String> li, String s, List<Character> dl) 
  public List<String> AllPossibleStrings(String s) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", s, 0);
        Collections.sort(result);
        return result;
    }

    private void backtrack(List<String> result, String current, String s, int index) {
        if (index == s.length()) {
            if (!current.isEmpty()) {
                result.add(current);
            }
            return;
        }
        backtrack(result, current + s.charAt(index), s, index + 1);
        backtrack(result, current, s, index + 1);
    }
}