class Solution {
    public int lengthOfLastWord(String s) {
   
     String[]a=s.split(" ");
     for(int i=a.length-1;i>=0;i--)
     {
         String x=a[i];
         if(!x.isEmpty())
         {
            
             int c=x.length();
             return c;
            

         }
     }
     return -1;
    }
}