class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        HashMap<Integer,Integer>mapp=new HashMap<>();
        for(int i:tops)
        {
            mapp.put(i,mapp.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(mapp.entrySet());
sortedList.sort((a, b) -a> b.getValue() - a.getValue()); 
int res=Integer.MAX_VALUE;
for (Map.Entry<Integer, Integer> entry : sortedList) {
    int count=0;
    boolean check=false;
    for(int i=0;i<tops.length;i++)
    {
        if(tops[i]!=entry.getKey())
        {
            if(bottoms[i]!=entry.getKey())
            {
               check=true;
               break;
            }
            else if(bottoms[i]==entry.getKey())
            {
                count++;
            }
        }
    }
    if(!check)
    {
        res=Math.min(res,count);
    }
}
mapp.clear();
        for(int i:bottoms)
        {
            mapp.put(i,mapp.getOrDefault(i,0)+1);
        }
        sortedList.clear();
        sortedList = new ArrayList<>(mapp.entrySet());
        sortedList.sort((a, b) -> b.getValue() - a.getValue()); 

        for (Map.Entry<Integer, Integer> entry : sortedList) {
    int count=0;
    boolean check=false;
    for(int i=0;i<tops.length;i++)
    {
        if(bottoms[i]!=entry.getKey())
        {
            if(tops[i]!=entry.getKey())
            {
               check=true;
               break;
            }
            else if(tops[i]==entry.getKey())
            {
                count++;
            }
        }
    }
    if(!check)
    {
        res=Math.min(res,count);
    }
}
return res==Integer.MAX_VALUE?-1:res;
        
    }
}