class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        HashMap<Character,Integer>mapp=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            mapp.put(ch,mapp.getOrDefault(ch,0)+1);
        }
        for(char ch:s.toCharArray())
        {
            if(mapp.get(ch)==1)
            {
                return ch;
            }
        }
        return '$';
    }
}
