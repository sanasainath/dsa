class Solution {
    public int longestSubstring(String s, int k) {
        int l=0;
        int r=s.length();
        return path(s,k,l,r);
        
    }
    public static int path(String s,int k,int l,int r)
    {
        if(r-l<k){
            return 0;
        }
        HashMap<Character,Integer>mapp=new HashMap<>();
        for(int i=l;i<r;i++)
        {
            char ch=s.charAt(i);
            mapp.put(ch,mapp.getOrDefault(ch,0)+1);
        }
        for(Character ch:mapp.keySet())
        { 
            if(mapp.get(ch)<k)
            {
                int i=l;
                int maxlen=0;
                while(i<r)
                {

                  while(i<r&&s.charAt(i)==ch)
                  {
                    i++;
                  }
                  int j=i;
                  while(j<r&&s.charAt(j)!=ch)
                  {
                    j++;
                  }
                  maxlen=Math.max(maxlen,path(s,k,i,j));
                  i=j;
                }
                return maxlen;
            }

        }
        return r-l;
    }
}