class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int xx=0;
       char ch=str2.charAt(xx);
       for(char c:str1.toCharArray())
       {
        char nextchar=c=='z'?'a':(char)(c+1);
          if(c==ch||ch==nextchar)
          {
               xx++;
            if(xx<str2.length())
            {
               
            ch=str2.charAt(xx);
            }
            else
            {
                break;
            }
           
          }
       }
       if(xx==str2.length())
       {
          return true;
       }
       return false;

      
        
    }
}