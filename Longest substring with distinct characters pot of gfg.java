class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int left=0;
        int right=0;
        int maxi=Integer.MIN_VALUE;
        HashMap<Character,Integer>mapp=new HashMap<>();
        while(right<s.length())
        {
            while(left<right&&mapp.containsKey(s.charAt(right)))
            {
                
                mapp.put(s.charAt(left),mapp.get(s.charAt(left))-1);
                if(mapp.get(s.charAt(left))==0)
                {
                    mapp.remove(s.charAt(left));
                }
                left++;
            }
            mapp.put(s.charAt(right),mapp.getOrDefault(s.charAt(right),0)+1)
            maxi=Math.max(maxi,right-left+1);
            right++;
        }
        return maxi;
    }
}