class Pair{
    int start;
    int end;
   
    Pair(int start,int end)
    {
        this.start=start;
        this.end=end;
    
    }
}
class Solution {
    public int maximumBeauty(int[] nums, int k) {
        List<Pair>li=new ArrayList(); 
        for(int i:nums)
        {
            li.add(new Pair(i-k,i+k));
        }
        Collections.sort(li,(p,q)->{
            if(p.start!=q.start)
            {
                return p.start-q.start;
            }
            else
            {
                return p.end-q.end;
            }
        });
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        
           int maxi=0;
       
        // while(!pq.isEmpty())    ///tle arisessssssssssssssssssss
        // {
        //     Pair pair=pq.poll();
        //     int start=pair.start;
        //     int end=pair.end;
        //     PriorityQueue<Pair>copy=new PriorityQueue<>(pq);
        //     int count=1;
        //     while(!copy.isEmpty())
        //     {
        //        Pair newpair=copy.poll();
        //        if(newpair.end>=start&&newpair.start<=start)
        //        {
        //         count++;
        //        }
        //     }
        //     maxi=Math.max(count,maxi);

        // }
        // SO USING LINE SWEEP ALGORITHM......................

        for(Pair pair:li)
        {
            while(!pq.isEmpty()&&pq.peek()<pair.start)
            {
                pq.poll();
            }
            pq.offer(pair.end);
            maxi=Math.max(maxi,pq.size());
        }
        if(maxi==1)
        {
            HashMap<Integer,Integer>mapp=new HashMap<>();
            for(int i=0;i<nums.length;i++)
            {
                mapp.put(nums[i],mapp.getOrDefault(nums[i],0)+1);

                
            }
            for(Integer val:mapp.values())
            {
                maxi=Math.max(maxi,val);
            }
        }
        return maxi;

        

        
    }
}