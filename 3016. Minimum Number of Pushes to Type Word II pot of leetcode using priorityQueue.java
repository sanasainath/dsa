class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer>mapp=new HashMap<>();
        for(char ch:word.toCharArray())
        {
            mapp.put(ch,mapp.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
        for(Integer vals:mapp.values())
        {
            pq.add(vals);
        }
        int ans=0;
        int count=0;
        while (!pq.isEmpty()) {
    int i = pq.poll();
            count++;
          if(count<=8)
          {
            ans+=1*i;
          }
          else if(count<=16)
          {
            ans+=2*i;
          
          }
          else if(count<=24)
          {
            ans+=3*i;
          }
          else
          {
            ans+=4*i;
          }
        }
        return ans;
        
    }
}