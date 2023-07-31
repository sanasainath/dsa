class Solution {
    public int myAtoi(String s) {
        
        if(s==null||s.length()==0)
        {
            return 0;
        }
        s=s.trim();
        if(s.length()==0)
        {
            return 0;
        }
        char first=s.charAt(0);
        int sign=1;
        int start=0;
        int result=0;
        if(first=='-')
        {
            sign=-1;
            start++;

        }
        else if(first=='+')
        {
            start++;
        }
          for(int i=start;i<s.length();i++)
          {
              char c=s.charAt(i);
              if(!Character.isDigit(c))
              {
                  break;
              }
            int digit = c - '0';
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
             
          }
          return result*sign;

    }
}