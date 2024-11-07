class Solution {
    public int largestCombination(int[] candidates) {
    //  HashMap<String,Integer>mapp=new HashMap<>();
    //  return path(candidates,-1,0,mapp);
    int maxi=0;
    
    for(int i=0;i<32;i++)
    {
        int count=0;
        for(int c:candidates)
        {
           boolean isSet = (c & (1 << i)) > 0;
           if(isSet)
           {
            count++;
           }
        }
        maxi=Math.max(maxi,count);
    }
    return maxi;
        
        
    }
    // public static int path(int []candidates,int val,int i,HashMap<String,Integer>mapp)
    // {
    //     if(i==candidates.length)
    //     {
    //         if(val>0)
    //         {
    //             return 0;
    //         }
    //         return Integer.MIN_VALUE;
    //     }
        
    //    String ss=i+"-"+val;
    //    if(mapp.containsKey(ss))
    //    {
    //     return mapp.get(ss);
    //    }
    //    int xx=1+path(candidates,val&candidates[i],i+1,mapp);
   
    //     int yy=path(candidates,val,i+1,mapp);
    //     int res=Math.max(xx,yy);
    //     mapp.put(ss,res);
    //     return res;

    // }
}