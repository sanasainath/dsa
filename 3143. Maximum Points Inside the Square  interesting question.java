class Solution {
    public int maxPointsInsideSquare(int[][] points, String s) {
        int n=s.length();
  
        int low=0;
        int high=(int)1e9;
        int maxi=0;
      while(low<=high)
      {
            int mid=low+(high-low)/2;
            int x=path(points,s,mid);
            if(x==-1)
            {
                high=mid-1;
            }
            else
            {
                maxi=Math.max(maxi,x);
                low=mid+1;
            }
      }
        
        return maxi;
        
    }
    public static int path(int points[][],String s,int mid)
    {
        int a=Math.abs(mid);
        int b=-Math.abs(mid);   
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<points.length;i++)
        {
            if ((points[i][0] <= a && points[i][0] >= b) && (points[i][1] <= a && points[i][1] >= b)) 
            {
                if(!set.contains(s.charAt(i)))
                {
                    set.add(s.charAt(i));
                }
                else
                {
                    return -1;
                }
            }
        }
        return set.size();
    }
}