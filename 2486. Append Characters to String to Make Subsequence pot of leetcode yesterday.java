class Solution {
    public int appendCharacters(String s, String t) {
        if(s.contains(t))
        {
            return 0;
        }
        int a=0;
        int r=0;
        while(a<s.length())
        {
            if(s.charAt(a)==t.charAt(r))
            {
                r++;
            }
            a++;

        }
        return t.length()-r;
        
    }
}s