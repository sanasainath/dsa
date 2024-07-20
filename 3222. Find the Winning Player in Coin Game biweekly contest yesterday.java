class Solution {
    public String losingPlayer(int x, int y) {
        String a="Alice";
        String b="Bob";
       int val=y/4;
       if(val<=x)
       {
        if(val%2==0)
        {
            return b;
        }

       }
       else
       {
        if(x%2==0)
        {
            return b;
        }

       }
       return a;
       
        
    }
}