class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
        int count1=0;
        for(char ch:word.toCharArray())
        {
            if(Character.isUpperCase(ch))
            {
                count++;
            }
            else
            {
                count1++;
            }
        }
        if(count==word.length())
        {
            return true;
        }
        else if(count1==word.length())
        {
            return true;
        }
        else if(count==1&&Character.isUpperCase(word.charAt(0)))
        {
            return true;
        }
        return false;
        
    }
}s