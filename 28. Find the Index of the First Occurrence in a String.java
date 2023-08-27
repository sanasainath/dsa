class Solution {
    public int strStr(String haystack, String needle) {
     int x=haystack.length();
     int y=needle.length();
     for(int i=0;i<=x-y;i++)
     {
         String z=haystack.substring(i,i+y);
         if(z.equals(needle))
         {
             return i;
         }
     }
     return -1;
     
    }
}