class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character>set=new HashSet<>();
        for(char ch:allowed.toCharArray())
        {
            set.add(ch);
        }
        int count=0;
        for(String st:words)
        {
            boolean check=false;
            for(char ch:st.toCharArray())
            {
                if(!set.contains(ch))
                {
                    check=true;
                }

            }
            if(!check)
            {
                count++;
            }

        }
        return count;

        
    }
}