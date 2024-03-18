import java.util.*;
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
            if (intervals.length <= 1) // Handling edge cases
            return 0;
         Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
        int []first=intervals[0];
        List<int []>li=new ArrayList<>();
       
        li.add(first);
       int count=0;
        for(int i=1;i<intervals.length;i++)
        {
          int []curr=intervals[i];
          
            int last[]=li.get(li.size()-1);
            if(curr[0]<last[1])
            {
                count++;
             if(curr[1]<last[1])
             {
                li.set(li.size()-1,curr);
             }
             
                
            }
            else{
                li.add(curr);
            }
           

          
           
          
        }
        return count;
        
    }
}