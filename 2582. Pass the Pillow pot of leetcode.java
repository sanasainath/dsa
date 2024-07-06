class Solution {
    public int passThePillow(int n, int time) {
        // int xx=1;
        // boolean check=true;
        // for(int i=1;i<=time;i++)
        // {
           
        //     if(check)
        //     {
        //           xx++;
        //           if(xx==n)
        //     {
        //         check=false;
               
        //     }

        //     }
        //     else
        //     {
        //          xx--;
        //           if(xx==1)
        //     {
        //         check=true;
              

        //     }

        //     }
            
            
           


        // }
        // return xx;

        //optimized way............
        int res=0;
        int x=time/(n-1);
       int y=time%(n-1);
      if(x%2==0)
      {
        res=y+1;

      }
      else
      {
        res=n-y;

      }
      return res;
        
    }
}