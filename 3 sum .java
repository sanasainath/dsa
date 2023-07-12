import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Solution {
    public static List< List < Integer > > triplet(int n, int []arr) {
        // Write your code here.
        List<List<Integer>>li=new ArrayList<>();
        Arrays.sort(arr);
         for(int i=0;i<n;i++)
         {
             if(i>0&&arr[i]==arr[i-1])
             {
                 continue;
             }

             int left=i+1;
             int right=n-1;
             while(left<right)
             {
                 int sum=arr[i]+arr[left]+arr[right];
                 if(sum<0)
                 {
                     left++;
                 }
                 else if(sum>0)
                 {
                     right--;
                 }
                 else{
                     List<Integer>ls=new ArrayList<>();
                     ls.add(arr[i]);
                     ls.add(arr[left]);
                     ls.add(arr[right]);
                     li.add(ls);
                     left++;
                     right--;
                     while(left<right&&arr[left]==arr[left-1])
                     {
                         left++;
                     }
                     while(left<right&&arr[right]==arr[right+1])
                     {
                         right--;
                     }
                 }
             }
         }
         return li;
    }
}