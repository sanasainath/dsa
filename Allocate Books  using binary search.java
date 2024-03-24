import java.util.ArrayList;

public class Solution {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        
        if(m>n)
        {
            return -1;
        }
        int first=arr.get(0);
        int sum=0;
        for(int i:arr)
        {
            sum+=i;

        }
        int low=first;
        int high=sum;
        int res=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(check(mid,m,arr))
            {
                res=mid;
                high=mid-1;
                
            }
            else
            {
                low=mid+1;
            }
        }
        return res;

    }
    public static boolean check(int mid,int m,ArrayList<Integer>arr)
    {
        int pages=0;
        int student=1;
        for(int x:arr)
        {
           if(x>mid)
           {
               return false;
           }
           if(pages+x>mid)
           {
               pages=0;
               student++;
               pages+=x;

           }
           else{
               pages+=x;
           }

        }
        if(student>m)
        {
            return false;
        }
        return true;
    }
}