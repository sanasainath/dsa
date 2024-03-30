class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int left=0;
        int right=n-1;
        int maxi=0;
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=cardPoints[i];
         
        }
        maxi=Math.max(maxi,sum);
        for(int j=k-1;j>=0;j--)
        {
            sum-=cardPoints[j];
            sum+=cardPoints[right];
            maxi=Math.max(maxi,sum);
            right--;


        }
        return maxi;
      
        
    }
}