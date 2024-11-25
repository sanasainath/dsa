class Solution {
    public boolean isPossibleToRearrange(String s, String t, int k) {
        int div=s.length()/k;
        HashMap<String,Integer>mapp=new HashMap<>();
        for(int i=0;i<s.length();i=i+div)
            {
                String ss=s.substring(i,div+i);
                mapp.put(ss,mapp.getOrDefault(ss,0)+1);
            }
         for(int i=0;i<t.length();i=i+div)

             {
                String ss=t.substring(i,div+i);
                  if(!mapp.containsKey(ss))
                  {
                      return false;
                  }
                 mapp.put(ss,mapp.get(ss)-1);
                 if(mapp.get(ss)==0)
                 {
                     mapp.remove(ss);
                 }
             }
        return true;
        
    }
}