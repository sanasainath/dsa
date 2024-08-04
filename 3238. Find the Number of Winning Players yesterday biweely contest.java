class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        int res=0;
        for(int i=0;i<n;i++)
      {
        boolean check=false;
        HashMap<Integer,Integer>mapp=new HashMap<>();
        for(int j=0;j<pick.length;j++)

        {
            if(pick[j][0]==i)
            {
                mapp.put(pick[j][1],mapp.getOrDefault(pick[j][1],0)+1);

            }
        }
        for(Integer val:mapp.values())
        {
            if(val>i)
            {
                check=true;
                break;

            }
        }
        if(check)
        {
            res++;
        }

      }
      return res;
        
    }
}