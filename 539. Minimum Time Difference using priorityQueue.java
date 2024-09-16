class Pair{
    int hour;
    int minute;
    Pair(int hour,int minute)
    {
        this.hour=hour;
        this.minute=minute;
    }
}
class Solution {
    public int findMinDifference(List<String> timePoints) {
        PriorityQueue<Pair>pq=new PriorityQueue<>((p,q)->{
            if(p.hour!=q.hour)
            {
                return p.hour-q.hour;
            }
            else
            {
                return p.minute-q.minute;
            }
        });
        for(String ii:timePoints)
        {
            String ss=ii.substring(0,2);
            String tt=ii.substring(3,5);
            pq.offer(new Pair(Integer.parseInt(ss),Integer.parseInt(tt)));
        }
        int maxi=Integer.MAX_VALUE;
        Pair p=pq.poll();
        Pair prev=p;
        while(!pq.isEmpty())
        {
              
              Pair pair=pq.poll();
              maxi=Math.min(maxi,path(pair,prev));
              prev=pair;

        }
        maxi=Math.min(maxi,path(prev,p));
        return maxi;

    }
     public static int path(Pair pair,Pair prev)
     {
        int t1=pair.hour*60+pair.minute;
        int t2=prev.hour*60+prev.minute;
        int mini=Math.abs(t1-t2);
        return Math.min(mini,1440-mini);

     }

}