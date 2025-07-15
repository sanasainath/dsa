class Solution {
    public boolean isValid(String word) {
        HashSet<Character>set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int count=0;
        boolean check=false;
        boolean check1=false;
        for(char ch:word.toCharArray())
        {
            if(Character.isLetter(ch)||Character.isDigit(ch))
            {
              count++;
              
              if(set.contains(Character.toLowerCase(ch)))
              {
                check=true;
              }
              else if(!Character.isDigit(ch))
              {
                check1=true;
              }
            }
            else
            {
                return false;
            }
            
        }
        if(count<3||!check||!check1)
        {
            return false;
        }
        return true;
        
    }
}