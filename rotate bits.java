//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int d = sc.nextInt();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.rotate (n, d);
            System.out.println(res.get(0));
            System.out.println(res.get(1));
            
           
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    ArrayList<Integer> rotate(int N, int D)
    {
        // your code here
        
        ArrayList<Integer>li=new ArrayList<>();
        if(N<=0)
        {
         return li;    
        }
          N = N & 0xFFFF;
           String bin = String.format("%16s", Integer.toBinaryString(N)).replace(' ', '0');
        String left=leftpos(bin,D);
        String right=rightpos(bin,D);
        li.add(Integer.parseInt(left,2));
        li.add(Integer.parseInt(right,2));
        return li;
        
        
        
    }
    static String leftpos(String bin,int position)
    {
         int len = bin.length();
    position = position % len;
        return bin.substring(position)+bin.substring(0,position);
    }
    static String rightpos(String bin,int position)
    {
         int len = bin.length();
    position = position % len;
    int split=len-position;
        return bin.substring(split)+bin.substring(0,split);
    }
}