//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String s) {
        int len=s.length();
        char z=s.charAt(len-1);
        if(z=='-'||s.isEmpty())
        {
            return -1;
        }
        
        
        char first=s.charAt(0);
        Boolean flag=false;
        int x=0;
        if(first=='-')
        {
            flag=true;
        }
       
        for(char i:s.toCharArray())
       {
           if(i=='-')
           {
              
               continue;
           }
         if(Character.isDigit(i))
         {
             x=x*10+(i-'0');
         }
         else
         {
             return -1;
         }
       }
       if(flag)
       {
           x=x*-1;
       }
       return x;
       
	// Your code here
    }
}
