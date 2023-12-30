//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Solution obj = new Solution();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
            
           
        }
        
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        HashMap<String, Integer> map = new HashMap<>();
        
        // Count the votes for each candidate.
        for(String x : arr)
        {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        
        // Find the candidate with the maximum votes.
        int maxVotes = 0;
        String winner = "";
        
        for(String candidate : map.keySet())
        {
            int votes = map.get(candidate);
            
            if(votes > maxVotes)
            {
                maxVotes = votes;
                winner = candidate;
            }
            else if(votes == maxVotes && candidate.compareTo(winner) < 0)
            {
                // If there is a tie, choose the candidate with the lexicographically smaller name.
                winner = candidate;
            }
        }
        
        // Prepare the result array.
        String[] result = new String[2];
        result[0] = winner;
        result[1] = String.valueOf(maxVotes);
        
        return result;
        
    }
}

