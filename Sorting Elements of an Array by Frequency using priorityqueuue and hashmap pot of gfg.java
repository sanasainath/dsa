class Pair{
    int x;int y;
    Pair(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        HashMap<Integer,Integer>mapp=new HashMap<>();
        for(int i:arr)
        {
            mapp.put(i,mapp.getOrDefault(i,0)+1);
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>((p1,p2)->{
            
            if(p2.y!=p1.y)
            {
                return p2.y-p1.y;
            }
            else
            {
                return p1.x-p2.x;
            }
        });
        for(Map.Entry<Integer,Integer>entry:mapp.entrySet())
        {
            pq.add(new Pair(entry.getKey(),entry.getValue()));
            
        }
        ArrayList<Integer>li=new ArrayList<>();
        while(!pq.isEmpty())
        {
            Pair p=pq.poll();
            int x=p.x;
            int y=p.y;
            for(int i=0;i<y;i++)
            {
                 li.add(x);
            }
            
        }
        return li;
        
        
        
        
        
    }
}