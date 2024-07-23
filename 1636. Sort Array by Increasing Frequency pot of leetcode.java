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
    public int[] frequencySort(int[] nums) {
        int []res=new int[nums.length];
        HashMap<Integer,Integer>mapp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            mapp.put(nums[i],mapp.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>((p1,p2)->{
           if(p1.y!=p2.y)
           {
            return p1.y-p2.y;
           } else
           {
            return p2.x-p1.x;
           }
    });
        for(Map.Entry<Integer,Integer>entry:mapp.entrySet())

        {
           pq.add(new Pair(entry.getKey(),entry.getValue()));
        }
        int xx=0;
        while(!pq.isEmpty())
        {
            Pair p=pq.poll();
            int count=p.y;
            while(count>0)
            {
             res[xx++]=p.x;
             count--;
            }
            
        }
        return res;
        
        
    }
}