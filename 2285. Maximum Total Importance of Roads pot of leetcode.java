class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long []arr=new long[n];
       

        for(int i=0;i<roads.length;i++)
        {
            arr[roads[i][0]]++;
            arr[roads[i][1]]++;
            
        }
        Arrays.sort(arr);
        long sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=(long)(arr[i-1]*i);

        }
        return sum;
        
    }
}