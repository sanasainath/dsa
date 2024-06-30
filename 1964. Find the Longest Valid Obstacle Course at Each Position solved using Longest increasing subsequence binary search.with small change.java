class Solution {
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        int []res=new int[obstacles.length];
        res[0]=1;
         List<Integer>li=new ArrayList<>();
        li.add(obstacles[0]);
        for(int i=1;i<obstacles.length;i++)
        {
            if(obstacles[i]>=li.get(li.size()-1))
            {
                li.add(obstacles[i]);
                res[i]=li.size();


            }
            else
            {
                int ind=binarysearch(0,li.size()-1,li,obstacles[i]);
                li.set(ind,obstacles[i]);
                res[i]=ind+1;
                 
            }
   

        
    }
         return res;
    }
 public static int binarysearch(int low,int high,List<Integer>Al,int target)
{
    
    int ans = -1;
    
    while (low <= high) {
        int mid = (low +high)/ 2; // Calculate mid inside the loop
        
        if (Al.get(mid) > target) { 
            ans = mid; // Update ans to potentially capture the upper bound
            high = mid - 1; // Adjust high to search in the left subarray
        } else {
            low = mid + 1; // Adjust low to search in the right subarray
        }
    }
    
    return low;
}
}


