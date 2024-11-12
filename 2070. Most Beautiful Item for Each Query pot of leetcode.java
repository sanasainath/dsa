class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items,(p,q)->Integer.compare(p[0],q[0]));
        int []res=new int[queries.length];
        HashMap<Integer,Integer>mapp=new HashMap<>();
        int prev=-1;
        for(int i=0;i<items.length;i++)
        {
            int first=items[i][0];
            int second=items[i][1];
            prev=Math.max(prev,second);
           
                mapp.put(first,prev);
        }
        for(int i=0;i<queries.length;i++)
        {
            if(mapp.containsKey(queries[i]))
            {
                res[i]=mapp.get(queries[i]);
            }
            else{
                int xx=path(queries[i],items);
               
                if(xx!=-1)
                {
                    res[i]=mapp.get(xx);
                }
                
            }
        }
        return res;
        
    }
    public static int path(int target,int [][]items)
    {
        int low=0;
        int high= items.length-1;
        int res=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(items[mid][0]<target)
            {
                res=items[mid][0];
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return res;
    }
}