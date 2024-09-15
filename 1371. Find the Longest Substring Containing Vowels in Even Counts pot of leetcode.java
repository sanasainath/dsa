class Solution {
    public int findTheLongestSubstring(String s) {
      HashMap<Character,Integer>mapp=new HashMap<>();
      int zero = 0;
        char nullChar = (char) zero;

      mapp.put(nullChar,-1);
      int bit=0;
      int maxi=0;
     for(int i=0;i<s.length();i++)
     {
        char ch=s.charAt(i);
        if(ch=='e'||ch=='a'||ch=='i'||ch=='o'||ch=='u')
        {
          bit=bit^ch;   
          char cc=(char)bit;
          if(mapp.containsKey(cc))
          {
            maxi=Math.max(maxi,i-mapp.get(cc));
          }
          if(!mapp.containsKey(cc))
          {
            mapp.put(cc,i);
          }
        }
        else
        {
        bit=bit^0;
        char cc=(char)bit;
         if(mapp.containsKey(cc))
          {
            maxi=Math.max(maxi,i-mapp.get(cc));
          }
        }
     }
     return maxi;
        
    }
}