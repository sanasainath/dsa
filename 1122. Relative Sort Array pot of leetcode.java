class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer>mapp=new HashMap<>();
        int []res=new int [arr1.length];
        for(int i=0;i<arr1.length;i++)
        {
            mapp.put(arr1[i],mapp.getOrDefault(arr1[i],0)+1);


        }
      
        int xx=0;
        for(int ii:arr2)
        {
            
            if(mapp.containsKey(ii))
            {
                int val=mapp.get(ii);
                while(val>0)
                {
                          res[xx++]=ii;
                    val--;
                }
              mapp.remove(ii);



            }
            

        }

        List<Integer> li = new ArrayList<>(mapp.keySet());
      
        Collections.sort(li);
        for(int y:li)
        {
            int count=mapp.get(y);
            while(count>0)
            {
                res[xx++]=y;
                count--;

            }
            
        }

        
        return res;
        
    }
}