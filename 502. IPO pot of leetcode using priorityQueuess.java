class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
      PriorityQueue<Integer>maxi=new PriorityQueue<>((a,b)->b-a);  
     PriorityQueue<int []>mini=new PriorityQueue<>((a,b)->a[0]-b[0]);
     for(int i=0;i<profits.length;i++)
     {
        mini.offer(new int[]{capital[i],profits[i]});
     }
     while(k>0)
     {
        while(!mini.isEmpty()&&mini.peek()[0]<=w)
        {
            maxi.add(mini.poll()[1]);

        }
        if(maxi.isEmpty())
        {
            break;
        }
        w+=maxi.poll();
        k--;
     }
     return w;
        
    }
}