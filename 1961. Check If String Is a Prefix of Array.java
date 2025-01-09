class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String ss="";
        for(String str:words)
        {
            ss+=str;
            if(ss.equals(s))
            {
                return true;
            }
        }
        return false;
    }
}