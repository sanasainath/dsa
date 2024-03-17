import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
       int [][]newarr=new int[intervals.length+1][];
       for(int i=0;i<intervals.length;i++)
       {
        newarr[i]=intervals[i];
       }
        
        newarr[newarr.length-1]=newInterval;
        Arrays.sort(newarr,Comparator.comparingInt(a->a[0]));
        List<int[]>li=new ArrayList<>();
        int []x=newarr[0];
        li.add(x);
       for(int i = 1; i <newarr.length; i++) {
    int[] arr = newarr[i];
    int[] lastInterval = li.get(li.size() - 1); // Get the last interval in li
    if(arr[0] <= lastInterval[1]) {
        // Merge with the last interval in li
        lastInterval[1] = Math.max(arr[1], lastInterval[1]);
    } else {
        // No overlap, add the new interval to li
        li.add(arr);
    }
    
}
    return li.toArray(new int[li.size()][2]);

        
    }
}