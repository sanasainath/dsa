class Solution {
    public int beautySum(String s) {
        int result=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            int []freq=new int[26];
            for(int j=i;j<n;j++)
            {
                freq[s.charAt(j)-'a']++;
                int min=Integer.MAX_VALUE;
                int max=0;
                for(int k=0;k<26;k++)
                {
                    if(freq[k]>0)
                    {
                        min=Math.min(min,freq[k]);
                        max=Math.max(max,freq[k]);

                    }

                }
                result=result+max-min;

            }
        }
        return result;
        
    }
}