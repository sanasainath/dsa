class Solution {
    public int minimumLength(String s) {
        
        HashMap<Character,Integer>mapp=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            mapp.put(ch,mapp.getOrDefault(ch,0)+1);
        }
        int res=0;
        for(Integer vals:mapp.values())
        {
            if(vals<3)
            {
                res+=vals;

            }
            else
            {
                if(vals%2==0)
                {
                  res+=2;
                }
                else
                {
                    res++;
                }
            }
        }
        return res;
    }
}