class Solution {
    public int numberOfSubstrings(String s, int k) {
        int n=s.length();
        if(k==1)
        {
            return n*(n+1)/2;
        }
        int count=0;
   
        for(int i=0;i<n;i++)
        {
                 HashMap<Character,Integer>mapp=new HashMap<>();
            for(int j=i;j<n;j++)
            {
                char ch=s.charAt(j);
                mapp.put(ch,mapp.getOrDefault(ch,0)+1);
                int vall=mapp.get(ch);
                if(vall>=k)
                {
                    count++;
                    count+=(n-j-1);
                    break;
                }

            }
              
        }
        return count;


        
    }
   
 
}