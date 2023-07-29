import java.util.Arrays;

import java.util.*;
class Solution {
   /* static int func(int[] weights)
    {
        Arrays.sort(weights);
        return weights[weights.length-1];
    }
 // static int sum(int []weights)
  {
      int sum=0;
      for(int i=0;i<weights.length;i++)
      {
          sum=sum+weights[i];
      }
      return sum;
  }*/
    static int function(int []weights,int capacity)
    {

      int day=1;
      int load=0;
       for(int i=0;i<weights.length;i++)
       {
           if((weights[i]+load)>capacity)
           {
               day+=1;
               load=weights[i];
           }
           else
           {
               load+=weights[i];
           }
       }
       return day;
    }
    public int shipWithinDays(int[] weights, int days) {
       //  int min=func(weights);
        // int max=sum(weights);
          int min= Integer.MIN_VALUE, max= 0;
        for (int i = 0; i < weights.length; i++) {
            max += weights[i];
            min = Math.max(min, weights[i]);
        }
         while(min<=max)
         {int mid=(min+max)/2;
         int dayreq=function(weights,mid);
             if(dayreq<=days)
             {
                 max=mid-1;
             }
             else
             {
                 min=mid+1;
             }
             
        }
        return  min;
        
        
    }
}