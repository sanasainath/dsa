class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
        {
            return false;
        }
      
        HashMap<Character,Integer>mapp=new HashMap<>();
        for(char ch:s1.toCharArray())
        {
            mapp.put(ch,mapp.getOrDefault(ch,0)+1);
        }
             HashMap<Character,Integer>mapp1=new HashMap<>();
             int left=0;
             int right=0;
             while(right<s1.length())
             {
                char ch=s2.charAt(right);
                mapp1.put(ch,mapp1.getOrDefault(ch,0)+1);
                if(check(mapp,mapp1))
                {
                 return true;
                }
                right++;
             }
             while(right<s2.length())
             {
                char ch=s2.charAt(right);
                char del=s2.charAt(left);
                mapp1.put(del,mapp1.get(del)-1);
                if(mapp1.get(del)==0)
                {
                    mapp1.remove(del);
                }
                mapp1.put(ch,mapp1.getOrDefault(ch,0)+1);
                if(check(mapp,mapp1))
                {
                    return true;
                }
                left++;right++;
             }
             return false;

      
       
    
        
        
    }
    public static boolean check(HashMap<Character,Integer>mapp,HashMap<Character,Integer>mapp1)
    {
       if(mapp.equals(mapp1))
       {
        return true;
       }
       return false;
    }
 
}