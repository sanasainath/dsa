class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        k = k + 1; // To pick k+1 free segments if you're skipping k events

        List<Integer> li = new ArrayList<>();

        // Add free time before first event
        if (startTime[0] > 0) {
            li.add(startTime[0]);
        }

        // Add gaps between events
        for (int i = 0; i < startTime.length - 1; i++) {
            int gap = startTime[i + 1] - endTime[i];
            if (gap >= 0) li.add(gap); // Only add positive gaps
        }

        // Add free time after last event
        if (endTime[endTime.length - 1] < eventTime) {
            li.add(eventTime - endTime[endTime.length - 1]);
        }

        // Edge case: if not enough gaps to pick k segments
        if (li.size() < k)
        {
           if(!li.isEmpty())
           {
             int sum=0;
             for(int i:li)
             {
                sum+=i;
             }
             return sum;
           }
           else
           {
            return 0;
           }
          
        }

        int maxSum = Integer.MIN_VALUE;

        // Sliding window of k segments
        int left=0;
        int right=0;
        int sum=0;
         while(right<k)
         {
          sum+=li.get(right);
          right++;
         }
         maxSum=Math.max(maxSum,sum);
       while(right<li.size())
       {
          sum-=li.get(left);
          sum+=li.get(right);
          right++;
          left++;
          maxSum=Math.max(maxSum,sum);
       }

        return maxSum;
    }
}
// 3 
// 7 0 2 3
 
