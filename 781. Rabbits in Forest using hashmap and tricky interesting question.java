class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer>mapp=new HashMap<>();
        for(int i:answers)
        {
            mapp.put(i,mapp.getOrDefault(i,0)+1);
        }
        int sum=0;
       for(Integer ii:mapp.keySet())
       {
        int xx=mapp.get(ii);
           
        if(ii+1>=xx)
        {
            sum+=(ii+1);
             

        }
        else {
            int count=xx/(ii+1);
            while(count>0)
            {
                sum+=(ii+1);
                 count--;
            }
            if(xx%(ii+1)!=0)
            {
                sum+=(ii+1);
            }

        }

       }
       return sum;

        
    }
}