//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int start = sc.nextInt();
            int end = sc.nextInt();

            Solution ob = new Solution();
            int ans = ob.minimumMultiplications(a, start, end);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Pair{
    int val;
    int count;
    Pair(int val,int count)
    {
        this.val=val;
        this.count=count;
    }
}
class Solution {
    int minimumMultiplications(int[] arr, int start, int end) {

        // Your code here
        if(start==end)
        {
            return 0;
        }
        int n=arr.length;
        PriorityQueue<Pair>pq=new PriorityQueue<>((p1,p2)->p1.count-p2.count);
        boolean visited[]=new boolean[100000];
        pq.offer(new Pair(start,0));
        visited[start]=true;
        
        while(!pq.isEmpty())
        {
            int size=pq.size();
            for(int i=0;i<size;i++)
            {
                Pair pp=pq.poll();
                int val=pp.val;
                
                int count=pp.count;
                if(val==end)
                {
                    return count;
                }
                for(int j=0;j<n;j++)
                {
                    if(!visited[(val*arr[j])%100000])
                    {
                         pq.offer(new Pair((val*arr[j])%100000,count+1));
                         visited[(val*arr[j])%100000]=true;
                        
                    }
                   
                    
                }
                
            }
        }
        return -1;
    }
}
