//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int A[]= new int[n];
            for(int i = 0; i < n; i++)
                A[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.findWinner(n, A));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int findWinner(int n, int A[]){
        // code here
       
        // code here
        int a=0;
        for(int i=0;i<n;i++)
        {
            a=a^A[i];    // getting xor of array and storing it into a
        }
        if(a==0)   //checking value of a is already 0 or not
        {
            return 1;
        }else
        {
            if(n%2!=0)   //if value of a is not  0, then cheking whether it is even or odd
            {
                return 2;
            }else
            {
              return 1;  
            }
        }
    }
}