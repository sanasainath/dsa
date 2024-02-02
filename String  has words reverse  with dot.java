//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
         String[] words = S.split("\\.");

        for (int start = 0, end = words.length - 1; start < end; start++, end--) {
            String temp = words[start];
            words[start] = words[end];
            words[end] = temp;
        }

        return String.join(".", words);
    }
}