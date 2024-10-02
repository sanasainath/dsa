class Pair{
    int x;
    int y;
    Pair(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        PriorityQueue<Pair>pq=new PriorityQueue<>((p,q)->p.x-q.x);
        int []res=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            pq.offer(new Pair(arr[i],i));

        }
        int val=Integer.MAX_VALUE;
         int count=1;
    while(!pq.isEmpty())
    {
       Pair p=pq.poll();
    //    int currval=p.x;

       int index=p.y;
       if(val==Integer.MAX_VALUE||val==p.x)
       {
                   res[index]=count;
                   val=p.x;

       }
       else
       {
            count++;
            res[index]=count;
          
              val=p.x;
       }

     
    }
    return res;

        
    }
}
