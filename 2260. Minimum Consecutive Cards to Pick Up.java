class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer,Integer>mapp=new HashMap<>();
        

        int maxi=Integer.MAX_VALUE;
        
        for(int right=0;right<cards.length;right++)
        {
            if(mapp.containsKey(cards[right]))
            {
                int x=mapp.get(cards[right]);
                maxi=Math.min(maxi,right-x+1);
               
         
               
                
                
            }

            
            mapp.put(cards[right],right);

           
        }
        return maxi==Integer.MAX_VALUE?-1:maxi;


    }
}