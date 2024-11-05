class Solution {
    public int minChanges(String s) {
        int n=s.length();
        int count=0;
        for(int i=1;i<n;i=i+2)
        {
            if(s.charAt(i)!=s.charAt(i-1))
            {
                count++;
            }

        }
        return count;

        
    }
}