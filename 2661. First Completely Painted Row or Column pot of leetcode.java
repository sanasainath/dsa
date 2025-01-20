class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        HashMap<Integer,int []>mapp=new HashMap<>();
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                int []ar=new int[2];
                ar[0]=i;
                ar[1]=j;
                mapp.put(mat[i][j],ar);
            }
        }
      
          HashMap<Integer,Integer>map=new HashMap<>();
           HashMap<Integer,Integer>map1=new HashMap<>();
          for(int i=arr.length-1;i>=0;i--)
          {
             int xx[]=mapp.get(arr[i]);
               int a=xx[0];
               int b=xx[1];
               if(!map.containsKey(a))
               {
                map.put(a,i);
               }
               if(!map1.containsKey(b))
               {
                map1.put(b,i);
               }
          }  
          int mini=Integer.MAX_VALUE;
          for(Integer values:map.values())
          {
            mini=Math.min(mini,values);
          }
          for(Integer values:map1.values())
          {
            mini=Math.min(mini,values);
          }
          return mini;

        
    }
}