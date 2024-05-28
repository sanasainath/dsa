class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        
        int maxi=0;
        int i=0;
        int curcost=0;
       for(int j=0;j<s.length();j++)
       {
        if(curcost+Math.abs(s.charAt(j)-t.charAt(j))<=maxCost)
        {
            curcost+=Math.abs(s.charAt(j)-t.charAt(j));
            maxi=Math.max(maxi,j-i+1);
        }
        else
        {
            curcost+=Math.abs(s.charAt(j)-t.charAt(j));
            while(i<=j&&curcost>maxCost)
            {
                curcost-=Math.abs(s.charAt(i)-t.charAt(i));
                i++;
            }
        }

       
        
           

       }
       return maxi;
      
    }
}