class Solution {
    public boolean canArrange(int[] arr, int k) {

        int []div=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                div[i]=(arr[i]%k+k)%k;
            }
            else
            {
               div[i]=arr[i]%k;
            }
          
        }
        HashMap<Integer,Integer>mapp=new HashMap<>();
        for(int i:div)
        {
            mapp.put(i,mapp.getOrDefault(i,0)+1);
        }
        if(mapp.containsKey(0))
        {
            if(mapp.get(0)%2!=0)
            {
                return false;
            }
        }
        for(int i=1;i<=k/2;i++)
        {
              int x=mapp.getOrDefault(i,0);
              int y=mapp.getOrDefault(k-i,0);
              if(x!=y)
              {
                return false;
              }
              
          }
          return true;



        
    }
}
