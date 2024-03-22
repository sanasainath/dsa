class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer>mapp=new HashMap<>();
        for(char i:text.toCharArray())
        {
            mapp.put(i,mapp.getOrDefault(i,0)+1);
        }
        String str="balloon";
        int count=0;
        
        while(true)
        {
          

 for(char j:str.toCharArray())
        {
            if(mapp.containsKey(j))
            {
                int freq=mapp.get(j);
                freq--;
                if(freq==0)
                {
                    mapp.remove(j);

                }
                else
                {
                    mapp.put(j,freq);
                }



            }
            else
            {
                return count;
            }
        }
        count++;
        }
     
       

        
    }
}