class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        
       int []indsum=new int[values.length];
       int []indsub=new int[values.length];
       for(int i=0;i<values.length;i++)
       {
        indsum[i]=values[i]+i;
        indsub[i]=values[i]-i;
       }
       
      int maxi=Integer.MIN_VALUE;
      int n=indsub.length;
      int []suffix=new int[n];
      suffix[n-1]=indsub[n-1];
      for(int j=n-2;j>=0;j--)
      {
        suffix[j]=Math.max(indsub[j],suffix[j+1]);
      }
      for(int i=0;i<indsum.length-1;i++)
      {
        maxi=Math.max(maxi,indsum[i]+suffix[i+1]);
      }

       return maxi;
        
    }
}