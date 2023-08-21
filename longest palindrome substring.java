class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1)
        {
            return s;
        }
        String res="";
        for(int i=1;i<s.length();i++)
        {//odd
          int low=i;
          int high=i;
          while(s.charAt(low)==s.charAt(high))
          {
              low--;
              high++;
              if(low==-1||high==s.length())
              {
                  break;
              }
          }
              String p= s.substring(low+1,high);
              if(p.length()>res.length())
              {
                  res=p;
              }

          
          //even 
          low=i-1;
          high=i;
          while(s.charAt(low)==s.charAt(high))
          {
              low--;
              high++;
              if(low==-1||high==s.length())
              {
                  break;
              }

              
          }
          String ev=s.substring(low+1,high);
          if(ev.length()>res.length())
          {
              res=ev;
          }
        }
        return res;
    }
}