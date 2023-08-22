class Solution {
    public boolean isPalindrome(int x) {
        
      String s=Integer.toString(x);
      int low=0;
      int high=s.length()-1;
      while(low<high)
      {
          if(s.charAt(low)!=s.charAt(high))
          {
              return false;
          }
          low++;
          high--;
        
      }
      return true;
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        
      String s=Integer.toString(x);
      int low=0;
      int high=s.length()-1;
      while(low<high)
      {
          if(s.charAt(low)==s.charAt(high))
          {
              low++;
              high--;
            
          }
          else
          {
              return false;
          }
         
        
      }
      return true;
    }
}