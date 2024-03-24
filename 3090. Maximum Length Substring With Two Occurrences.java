class Solution {
    public int maximumLengthSubstring(String s) {
       

        int n = s.length();
        int[] charFreq = new int[26]; // Assuming only lowercase English alphabets
        
        int left = 0, right = 0; // Window boundaries
        int maxLength = 0;
        
        while (right < n) {
            char c = s.charAt(right);
            charFreq[c - 'a']++; // Increment frequency of character at 'right'
            
            // If frequency of any character becomes more than 2, move 'left' towards right
            while (charFreq[c - 'a'] > 2) {
                charFreq[s.charAt(left) - 'a']--; // Decrement frequency of character at 'left'
                left++;
            }
            
            // Update maxLength
            maxLength = Math.max(maxLength, right - left + 1);
            
            right++; // Expand the window to the right
        }
        
        return maxLength;

    //    HashMap<Character,Integer>mapp=new HashMap<>();
    //    int maxi=Integer.MIN_VALUE;
    // for(int i=0;i<s.length();i++)
    // {
    //     for(int j=i;j<s.length();j++)
    //     {
    //         boolean xx=false;
    //         String ss=s.substring(i,j+1);
    //         for(char c:ss.toCharArray())
    //         {
    //             mapp.put(c,mapp.getOrDefault(c,0)+1);
    //         }
    //         for(Integer k:mapp.values())
    //         {
    //             if(k>2)
    //             {
    //                 xx=true;

    //             }
    //         }
    //         mapp.clear();
    //         if(!xx)
    //         {
    //             maxi=Math.max(maxi,ss.length());
    //         }
    //     }
    // }
    // return maxi;

        
        
    }
}