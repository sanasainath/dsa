class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int left=0;
        int maxi=0;
        
        HashMap<Integer,Integer>mapp=new HashMap<>();
        for(int right=0;right<n;right++)
        {
            
                mapp.put(fruits[right],mapp.getOrDefault(fruits[right],0)+1);
               if(mapp.size()>2)
               {
                int freq=mapp.get(fruits[left]);
                if(freq>1)
                {
                    mapp.put(fruits[left],freq-1);
                }
                else
                {
                    mapp.remove(fruits[left]);
                }

                left++;
               }

                maxi=Math.max(right-left+1,maxi);
            


        }
        return maxi;
        
    }
}