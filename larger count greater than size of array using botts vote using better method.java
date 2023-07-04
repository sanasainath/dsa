import java.util.*;
public class Solution {
    public static int majorityElement(int []v) {
        // Write your code here
    HashMap<Integer,Integer> mapp=new HashMap<>();
   for(int i=0;i<v.length;i++)
   {
       int value=mapp.getOrDefault(v[i],0);
       mapp.put(v[i],value+1);
   }
   for(Map.Entry<Integer,Integer>x:mapp.entrySet())
   {
       if(x.getValue()>(v.length/2))
       {
           return x.getKey();
       }
   }
   return -1;



    }
}