class Solution {
    public long minimumSteps(String s) {
        int n=s.length();
        int ones=0;
        long sum=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='1')
            {
                ones++;
            }
            else{
               sum+=ones;
            }
        }
        return sum;

        
    }
}