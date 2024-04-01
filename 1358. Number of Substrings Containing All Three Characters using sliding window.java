class Solution {
    public int numberOfSubstrings(String s) {
     int n=s.length();
  
     int maxi=0;
    
     HashMap<Character,Integer>mapp=new HashMap<>();
    for(int right=0;right<n;right++)
    {
        mapp.put(s.charAt(right),right);
        if(mapp.size()==3)
        {
             int smallestValue = Integer.MAX_VALUE; // Initialize smallest value with maximum possible value
    

        for (int value : mapp.values()) {
            if (value < smallestValue) {
                smallestValue = value;
            }
          
        }
        maxi+=smallestValue+1;

        }
       
    }
     return maxi;

        
    }
}