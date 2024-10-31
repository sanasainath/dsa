class Solution {
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
 
         List<Integer>li=new ArrayList<>();
           for(int[] f: factory) {
            while(f[1] > 0) {
                li.add(f[0]);
                f[1]--;
            }
        }
               Collections.sort(li);
               Collections.sort(robot);
        long [][]dp=new long[robot.size()][li.size()];
        for(long[] arr: dp) {
            Arrays.fill(arr, -1l);
        }
     
       

        return path(robot,li,0,0,dp);
        
    }
    public static long path(List<Integer>robot,List<Integer>li,int i,int j,long [][]dp)
    { 
        if(i==robot.size())
        {
            return 0;
        }
        if(j==li.size())
        {
            return Long.MAX_VALUE/2;
        }
        
        if(dp[i][j]!=-1)
         {
            return dp[i][j];
         }

        long xx=Math.abs(li.get(j)-robot.get(i))+path(robot,li,i+1,j+1,dp);
       
          
        
        
        long yy=path(robot,li,i,j+1,dp);

        return dp[i][j]=Math.min(xx,yy);
         
    }
}