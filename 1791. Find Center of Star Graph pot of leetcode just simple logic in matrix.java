class Solution {
    public int findCenter(int[][] edges) {
        // HashMap<Integer,Integer>mapp=new HashMap<>();
        // int count=0;
        // for(int i=0;i<edges.length;i++)
        // {
        //     for(int j=0;j<edges[0].length;j++)
        //     {
        //         if(mapp.containsKey(edges[i][j]))
        //         {
        //             count++;
        //         }
               
        //             mapp.put(edges[i][j],mapp.getOrDefault(edges[i][j],0)+1);
                
        //     }
        // }
      
        //     for(Map.Entry<Integer,Integer>entry:mapp.entrySet())
        //     {
        //         if(entry.getValue()==count+1)
        //         {
        //             return entry.getKey();
        //         }
        //     }
        
        // return -1;
        if(edges[0][0]==edges[1][0]||edges[0][0]==edges[1][1])
        {
            return edges[0][0];
        }
        return edges[0][1];
        
    }
}