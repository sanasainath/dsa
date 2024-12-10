class Solution {
    public int maximumLength(String s) {
        HashMap<String,Integer>mapp=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                String ss=s.substring(i,j+1);
                mapp.put(ss,mapp.getOrDefault(ss,0)+1);
            }
        }
        int maxi=-1;
        for(Map.Entry<String,Integer>entry:mapp.entrySet())
        {
            if(entry.getValue()>=3)
            {
                String xx=entry.getKey();
                boolean check=false;
                for(int i=1;i<xx.length();i++)
                {
                    if(xx.charAt(i)!=xx.charAt(i-1))
                    {
                        check=true;
                    }
                }
                if(!check)
                {
                     maxi=Math.max(maxi,xx.length());
                }

               
            }
        }
        return maxi;
        
    }
}