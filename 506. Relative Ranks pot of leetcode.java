class Pair{
    int x;
    int y;
    public Pair(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Solution {

    public String[] findRelativeRanks(int[] score) {
       PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(b.x, a.x));

      for(int i=0;i<score.length;i++)
      {
        pq.add(new Pair(score[i],i));
      }
      String []st=new String[score.length];
      int aa=-1;
      int bb=-1;
      int cc=-1;
      int dd=4;
      while(!pq.isEmpty())
      {
        Pair pp=pq.poll();
        int x=pp.x;
        int y=pp.y;
        if(aa==-1)
        {
            st[y]="Gold Medal";
            aa=0;
        }
        else if(bb==-1)
        {
            st[y]="Silver Medal";
            bb=0;
        }
         else if(cc==-1)
        {
            st[y]="Bronze Medal";
            cc=0;
        }
        else
        {
            st[y]=Integer.toString(dd);
            dd++;
        }

      } 
        return st;
    }
}