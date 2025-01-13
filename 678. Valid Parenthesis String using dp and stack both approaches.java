class Solution {
    public boolean checkValidString(String s) {
        // Stack<Integer>open=new Stack<>();
        // Stack<Integer>star=new Stack<>();

        // for(int i=0;i<s.length();i++)
        // {
        //     char ch=s.charAt(i);
        //     if(ch=='*')
        //     {
        //         star.push(i);
        //     }
        //     else if(ch=='(')
        //     {
        //         open.push(i);
        //     }
        //     else
        //     {
        //         if(!open.isEmpty())
        //         {
        //           open.pop();
        //         }
        //         else if(!star.isEmpty())
        //         {
        //             star.pop();
        //         }
        //         else
        //         {
        //             return false;
        //         }
        //     }
        // }
        // while(!star.isEmpty()&&!open.isEmpty())
        // {
        //     if(open.peek()>star.peek())
        //     {
        //         return false;
        //     }
        //     open.pop();
        //     star.pop();
        // }
        // return open.isEmpty();
        int [][]dp=new int[s.length()][s.length()];
    for(int []d:dp)
    {
        Arrays.fill(d,-1);
    }
        return path(s,0,0,dp);
        
    }
    public static boolean path(String s,int i,int count,int [][]dp)
    {
        if(count<0)
        {
            return false;
        }

        if(i==s.length())
        {
            if(count==0)
            {
                return true;
            }
            return false;
        }
        boolean check=false;
        if(dp[i][count]!=-1)
        {
               if(dp[i][count]==1)
               {
                return true;
               }
               return false;
        }
    
        if(s.charAt(i)==')')
        {
           check=path(s,i+1,count-1,dp);
        }
        else if(s.charAt(i)=='(')
        {
           check=path(s,i+1,count+1,dp);
        }
        else
        {
            boolean xx=path(s,i+1,count+1,dp);
           boolean yy= path(s,i+1,count-1,dp);
           boolean zz=path(s,i+1,count,dp);
            check=xx|yy|zz;
        
        }
        if(check)
        {
            dp[i][count]=1;
        }
        else if(!check)
        {
            dp[i][count]=0;
        }
        return check;
    }
}