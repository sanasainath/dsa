class Solution {
    public boolean canAliceWin(int n) {
        if(n<10)
        {
            return false;
        }
       int count=10;
        int val=1;
        while(true)
            {
                if(count>n)
                {
                    if(val%2!=0)
                    {
                       
                        return false;
                    }
                     break;
                }
                n=n-count;
                count--;
                val++;
            }
        
         return true;
        
        
    }
}