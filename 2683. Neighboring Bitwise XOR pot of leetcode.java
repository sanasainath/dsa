class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int val=0;
        for(int i:derived)
        {
            val=val^i;
        }
         if(val==0)
         {
            return true;
         }
        
        return false;
    }
}