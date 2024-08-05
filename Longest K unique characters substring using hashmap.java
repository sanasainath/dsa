class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer>mapp=new HashMap<>();
        int left=0;
        int maxi=-1;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            mapp.put(ch,mapp.getOrDefault(ch,0)+1);
            if(mapp.size()==k)
            { 
                maxi=Math.max(maxi,i-left+1);
                
            }
            while(mapp.size()>k)
            {
                if(mapp.get(s.charAt(left))==1)
                {
                    mapp.remove(s.charAt(left));
                }
                else
                {
                    mapp.put(s.charAt(left),mapp.get(s.charAt(left))-1);
                }
                left++;
            }
            
        }
        return maxi;
    }
}