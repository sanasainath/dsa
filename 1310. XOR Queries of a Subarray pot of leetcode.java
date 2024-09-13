class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        // int []res=new int[queries.length];
        // int ind=0;
        // for(int []query:queries)
        // {
        //     int ans=0;
        //     int xx=query[0];
        //     while(xx<=query[1])
        //     {
        //       ans=ans^arr[xx];
        //       xx++;
        //     }
        //     res[ind++]=ans;

        // }
        // return res;

        //optimzed.......
        int []prefix=new int[arr.length];
        int sum=0;
    
        for(int i=0;i<arr.length;i++)
        {

              sum=sum^arr[i];
              prefix[i]=sum;
        }
        int []res=new int[queries.length];
        int xx=0;
        for(int []query:queries)
        {
            if(query[0]!=0)
            {
           res[xx++]=prefix[query[1]]^prefix[query[0]-1];
            }
            else if(query[0]==0)
            {
                res[xx++]=prefix[query[1]];
            }
            
        }
        return res;



        
        
    }
}