//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages
    static int func(int [] arr,int val)
    {
        int student=1;
        int num=0;
        for(int i=0;i<arr.length;i++)
        {
            if(num+arr[i]<=val)
            {
                num=num+arr[i];
                
            }
            else
            {
                student++;
                num=arr[i];
            }
        }
        return student;
    }
    public static int findPages(int[]A,int N,int M)
    {
        if(M>A.length)
        {
            return -1;
        }
        //Your code here
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<N;i++)
        {
            low=Math.max(low,A[i]);
            high=high+A[i];
        }
        while(low<=high)
        {
            int mid=(low+high)/2;
            int x=func(A,mid);
            if(x<=M)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    
    }
};