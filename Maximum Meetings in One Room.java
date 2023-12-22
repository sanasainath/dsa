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
            
            int N; 
            N = Integer.parseInt(br.readLine());
            
            
            int[] S = IntArray.input(br, N);
            
            
            int[] F = IntArray.input(br, N);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.maxMeetings(N, S, F);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        // code here
          int[][] meetings = new int[N][2];
        for (int i = 0; i < N; i++) {
            meetings[i][0] = F[i];
            meetings[i][1] = i;
        }
       
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
       
        int tym = meetings[0][0];
       
        ArrayList<Integer> ans = new ArrayList<>();
       
        ans.add(meetings[0][1] + 1);
       
        for (int i = 1; i < N; i++) {
            if (S[meetings[i][1]] > tym) {
                ans.add(meetings[i][1] + 1);
                tym = meetings[i][0];
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
        
