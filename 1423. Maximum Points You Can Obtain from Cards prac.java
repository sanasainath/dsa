class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left=k;
        int right=cardPoints.length-1;
        int sum=0;
     for(int i=0;i<k;i++)
     {
        sum+=cardPoints[i];
     }
     k=k-1;
     int maxi=Integer.MIN_VALUE;
     maxi=sum;
     while(k>=0)
     {

        sum-=cardPoints[k];
        k--;
         sum+=cardPoints[right];
         right--;
         maxi=Math.max(sum,maxi);

        
     }
     return maxi;
    
    }
}