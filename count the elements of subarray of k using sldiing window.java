//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k) {
        ArrayList<Integer> li = new ArrayList<>();
        HashMap<Integer,Integer> mapp = new HashMap<>();
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (!mapp.containsKey(A[i])) {
                mapp.put(A[i],1);
                count++;
            }
            else
            {
                mapp.put(A[i],mapp.get(A[i])+1);
            }
        }
        li.add(count);
        
        for (int j = k; j < n; j++) {
            
              if (mapp.get(A[j - k]) == 1) 
                {
                    mapp.remove(A[j-k]);
                    count--;
                }
                else
                {
                
                    mapp.put(A[j-k],mapp.get(A[j-k])-1);
                }  
            if (!mapp.containsKey(A[j])) {
                mapp.put(A[j],1);
                count++;
            }
            else
            {
                 mapp.put(A[j], mapp.getOrDefault(A[j], 0) + 1);
            }
           
             
                
              

            
            
            li.add(count);
        }
        return li;
    }
}

