class Solution {
    public int numberOfSubstrings(String s) {
    HashMap<Character,Integer>mapp=new HashMap<>();
    
     int right=0;
     int count=0;
      int left=0;
     while(right<s.length())
     {
        char ch=s.charAt(right);
  
             mapp.put(ch,mapp.getOrDefault(ch,0)+1);
       
            while(left<right&&mapp.size()==3)
            {
               count+=s.length()-right;
                mapp.put(s.charAt(left),mapp.get(s.charAt(left))-1);
                if(mapp.get(s.charAt(left))==0)
                {
                    mapp.remove(s.charAt(left));
                }
                
                left++;
            }
      
        right++;

     }
     return count;
    } 
}