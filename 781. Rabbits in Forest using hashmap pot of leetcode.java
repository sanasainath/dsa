class Solution {
    public int numRabbits(int[] answers) {
// HashSet<Integer>set=new HashSet<>();
int count=0;
// for(int i:answers)
// {
//     if(!set.contains(i)&&i!=0)
//     {
//         set.add(i);
//         count+=(i+1);
//     }
//     else if(i==0)
//     {
//         count++;
//     }
// }
// return count;
HashMap<Integer,Integer>mapp=new HashMap<>();
for(int i:answers)
{
    mapp.put(i,mapp.getOrDefault(i,0)+1);
}
if(mapp.containsKey(0))
{
    count+=mapp.get(0);
}
for(Map.Entry<Integer,Integer>entry:mapp.entrySet())
{
    if(entry.getKey()==0)
    {
        continue;
    }
    else if(entry.getKey()+1>=entry.getValue())
    {
        count+=entry.getKey()+1;
    }
    else
    {
         int diff=entry.getValue()/(entry.getKey()+1);
         while(diff>0) 
         {
              count+=entry.getKey()+1;
            diff--;
         }
         if(entry.getValue()%(entry.getKey()+1)!=0)
         {
           count+=entry.getKey()+1;
         }
        

     
    }


}
return count;
// 2 2 2 2 2 2 2
// 3 3 3 3

        
    }
}