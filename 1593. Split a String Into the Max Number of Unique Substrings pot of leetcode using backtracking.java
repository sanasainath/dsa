class Solution {
    public int maxUniqueSplit(String s) {
        int n=s.length();
        return path(0,s,new HashSet<>());
        
    }
    public static int path(int i,String s,HashSet<String>set)
    {
        if(i==s.length())
        {
            return set.size();
        }

        int maxi=0;
        for(int j=i;j<s.length();j++)
        {
            String ss=s.substring(i,j+1);
            if(!set.contains(ss))
            {
               set.add(ss);
           maxi=Math.max(maxi,path(j+1,s,set));
           set.remove(ss);

            }
           


        }
        return maxi;
    }
}