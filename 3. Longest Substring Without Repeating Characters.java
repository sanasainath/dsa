class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>mapp=new HashMap<>();
        int left=0;
        int n=s.length();
        int maxi=0;
     
        for(int right=0;right<n;right++)
        {
            if(!mapp.containsKey(s.charAt(right)))
            {
               mapp.put(s.charAt(right),1);
              
            }
            else
            {
               boolean shouldExit = false;
                  while (mapp.containsKey(s.charAt(right)) && !shouldExit) {
                   if (s.charAt(left) == s.charAt(right)) {
                  
                     shouldExit = true; // Set the flag to true to exit the outer loop
                     
                        } 
                        mapp.remove(s.charAt(left));
                    left++;
                   }

           
           mapp.put(s.charAt(right),1);
            }
           
               
          
         maxi=Math.max(maxi,right-left+1);
              
        }
        return maxi;


    }
}