//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}

// } Driver Code Ends


class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        
        Map<Character,Character>mapp=new HashMap<>();
        if(str1.length()!=str2.length())
        {
            return false;
            
        }
        for(int i=0;i<str1.length();i++)
        {
            char x=str1.charAt(i);
            char y=str2.charAt(i);
            if(!mapp.containsKey(x))
            {
                if(!mapp.containsValue(y))
                {
                mapp.put(x,y);
                }
                else
                {
                    return false;
                }
            }
            else
            {
                char z=mapp.get(x);
                if(z!=y)
                {
                    return false;
                }
            }
            
        }
        return true;
    }
}