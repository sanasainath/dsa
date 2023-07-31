class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer>mapp=new HashMap<>();
        for(char i:s.toCharArray())
        {
            mapp.put(i,(mapp.getOrDefault(i,0))+1);
        }
    PriorityQueue<Character>p=new PriorityQueue<>((x,y)->mapp.get(y)-mapp.get(x));
        for(char x:mapp.keySet())
        {
            p.offer(x);
        }
        StringBuilder g=new StringBuilder();
        while(!p.isEmpty())
        {
            char c=p.poll();
            for(int i=0;i<mapp.get(c);i++)
            {
                g.append(c);
            }
        }
        return g.toString();
    }
}