class Solution {
    public int minLength(String s) {
        String one="AB";
        String two="CD";
       int count=s.length();
       while(true)
       {
        if(s.contains(one))
         {
            s=s.replaceFirst(one,"");
            count=count-2;
         }     
         else if(s.contains(two))
         {
            s=s.replaceFirst(two,"");
            count=count-2;
         }
         else
         {
            break;
         }

       }
       return count;
        
    }
}