import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        // Write your code here.
Map<Integer,Integer>mapp=new HashMap<>();
int count=0;
int sum=0;
int n=arr.length;
mapp.put(0,1);
for(int i=0;i<n;i++)
{
    sum=sum+arr[i];
    int res=sum-s;
    count=count+mapp.getOrDefault(res,0);
    mapp.put(sum,mapp.getOrDefault(sum,0)+1);
}
 return count;
    }
   
}