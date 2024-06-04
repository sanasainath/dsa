class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>mapp=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            mapp.put(ch,mapp.getOrDefault(ch,0)+1);
        }
      
        int count=0;
        boolean oddone=false;
        for(Integer ii:mapp.values())
        {
            if(ii%2==0)
            {
               
                count+=ii;
            }
            else
            {   

                count+=ii-1;
                oddone=true;
            }
        }

        if(oddone)
        {
            count+=1;
        }
        return count;


        
    }
}