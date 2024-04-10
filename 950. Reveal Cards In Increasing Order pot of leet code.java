class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int []arr=new int[deck.length];
        Queue<Integer>q=new LinkedList<>();
         for(int i=0;i<deck.length;i++)
         {
            q.offer(i);
         }
         int xx=0;
         for(int j=0;j<deck.length;j++)
         {
            if(!q.isEmpty())
            {
                xx=q.poll();

            }
            if(!q.isEmpty())
            {
                int yy=q.poll();
                q.offer(yy);
            }

            arr[xx]=deck[j];
         }
         return arr;



        
    }
}