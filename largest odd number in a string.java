import java.lang.StringBuilder;
class Solution {
    public String largestOddNumber(String num) {
     for(int i=num.length()-1;i>=0;i--)
     {
         char c=num.charAt(i);
         int digit=c-'0';//it is optional becase the ascii makes it converts to value in operations
         if(digit%2==1)
         {
             return num.substring(0,i+1);
         }
     }
     return "";
    }
}