class Solution {
    public int findMinArrowShots(int[][] points) {
        
     
       Arrays.sort(points,Comparator.comparingInt(a->a[0]));
       ArrayList<int[]>li=new ArrayList<>();
       int []interv=points[0];
       li.add(interv);
   for(int i = 1; i < points.length; i++) {
    int[] arr = points[i];
    int[] lastInterval = li.get(li.size() - 1); // Get the last interval in li
    if(arr[0] <= lastInterval[1]) {
        // Merge with the last interval in li
        lastInterval[1] = Math.min(arr[1], lastInterval[1]);
    } else {
        // No overlap, add the new interval to li
        li.add(arr);
    }
}

       return li.size();

        
    }
}