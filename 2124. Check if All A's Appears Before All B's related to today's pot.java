class Solution {
    public boolean checkString(String s) {
       int n=s.length();
     if(s.charAt(0)=='b')
     {
       
       for(int i=0;i<n;i++)
       {
        if(s.charAt(i)=='a')
        {
        return false;
        }

       }
     }
     else
     {
        boolean xx=false;
        for(int i=0;i<n;i++)
       {
       if(s.charAt(i)=='b')
       {
        xx=true;
       }
       if(s.charAt(i)=='a'&&xx)
       {
        return false;
       }
          
       }

     }
     return true;
      
    //     int bb[]=new int[n];
    //     int aa[]=new int[n];
    //     int sum=0;
    //     for(int i=0;i<n;i++)
    //     {
    //         bb[i]=sum;
    //         if(s.charAt(i)=='b')
    //         {
    //             sum++;
    //         }

    //     }
    //     sum=0;
    //     for(int i=n-1;i>=0;i--)
    //     {
    //         aa[i]=sum;
    //         if(s.charAt(i)=='a')
    //         {
    //             sum++;
    //         }

    //     }
    //     int res=Integer.MAX_VALUE;
    //     for(int i=0;i<n;i++)
    //     {
    //         res=Math.min(res,aa[i]+bb[i]);

    //     }
    //    if(res==0)
    //    {
    //     return true;
    //    }
    //    return false;
        
    }
}