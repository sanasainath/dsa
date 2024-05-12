class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            int index=t.indexOf(s.charAt(i));
            sum+=Math.abs(index-i);
            
            
        }
        return sum;
        
    }
}