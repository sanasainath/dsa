class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n=colors.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(i==0&&colors[n-1]==colors[1]&&colors[1]!=colors[0])
            {
                count++;
                
            }
             if(i!=n-1&&i!=0&&colors[i-1]==colors[i+1]&&colors[i-1]!=colors[i])
             {
                count++;
             }
             if(i==n-1&&colors[0]==colors[n-2]&&colors[0]!=colors[n-1])
             {
                count++;
             }
        }
        return count;
    }
}