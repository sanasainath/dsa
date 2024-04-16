//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int k;
            k = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.minimizeDifference(n, k, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int minimizeDifference(int n, int k, int[] arr) {
        int []suffixmax=new int[n];
        int []suffixmin=new int[n];
        suffixmax[n-1]=arr[n-1];
        suffixmin[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            // if(arr[i]>suffixmax[i+1])
            // {
            //     suffixmax[i]=arr[i];
            // }
            // else
            // {
            //     suffixmax[i]=suffixmax[i+1];
            // }
            // if(arr[i]<suffixmin[i+1])
            // {
            //     suffixmin[i]=arr[i];
            // }
            // else
            // {
            //     suffixmin[i]=suffixmin[i+1];
            // }
            suffixmax[i]=Math.max(arr[i],suffixmax[i+1]);
             suffixmin[i]=Math.min(arr[i],suffixmin[i+1]);
            
        }
         int ans=suffixmax[k]-suffixmin[k];//for index 0 manually
         int leftmax=arr[0];
         int leftmin=arr[0];
         for(int i=1;i<n-k;i++)
         {
             int maxi=Math.max(suffixmax[i+k],leftmax);
             int mini=Math.min(suffixmin[i+k],leftmin);
             ans=Math.min(ans,maxi-mini);
             leftmax=Math.max(leftmax,arr[i]);
             leftmin=Math.min(leftmin,arr[i]);
         }
         ans=Math.min(ans,leftmax-leftmin);
         return ans;
 
    }
}
        
