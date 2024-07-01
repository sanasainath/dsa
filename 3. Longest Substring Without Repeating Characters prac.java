class Solution {
    public int lengthOfLongestSubstring(String s) {
    int left=0;
    int right=0;
    HashSet<Character>set=new HashSet<>();
    int maxi=0;
    while(right<s.length())
    {
        while(set.contains(s.charAt(right)))
        {
            set.remove(s.charAt(left));
            left++;
        }
    set.add(s.charAt(right));  

        maxi=Math.max(maxi,right-left+1);
        right++;
        
          

    }
    return maxi;
   
        
    }
}