//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    for(int i=0;i<t;i++){
	        int n = Integer.parseInt(br.readLine());
	        String l = br.readLine();
    		String[] sarr = l.split(" ");
    		int[] arr = new int[sarr.length];
    		for(int i1=0;i1<arr.length;i1++){
    			arr[i1] = Integer.parseInt(sarr[i1]);
    		}
    		
            Solution obj = new Solution();
            
            int[] res = obj.twoRepeated(arr, n);
            System.out.println(res[0] + " " + res[1]);
	    }
	}
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
    //Function to find two repeated elements.
    public int[] twoRepeated(int arr[], int n)
    {
        // Your code here
        HashSet<Integer>set=new HashSet<>();
        int []arr1=new int[2];
        int z=0;
        int res=0;
        boolean bool=false;
        for(int i:arr)
        {
            if(z==2)
            {
                break;
            }
            if(!set.contains(i))
            {
                
                 set.add(i);
            }
            else
            {
                if(!bool)
                {
                    res=i;
                    bool=true;
                }
                arr1[z]=i;
                z++;
            }
           
            
        }
        if(arr1[0]==res)
        {
            return arr1;
        }
        else
        {
        int temp=arr1[0];
        arr1[0]=arr1[1];
        arr1[1]=temp;
        }
        return arr1;
        
     
        
    }
    
}