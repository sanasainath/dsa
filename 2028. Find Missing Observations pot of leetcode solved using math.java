class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int totallength=rolls.length+n;
        int totalsum=mean*totallength;
        int arraysum=0;
        for(int i=0;i<rolls.length;i++)
        {
            arraysum+=rolls[i];
        }
        int diffsum=totalsum-arraysum;
        if(diffsum>6*n||diffsum<n)
        {
            return new int[0];
        }
        int []res=new int[n];
        Arrays.fill(res,1);
        diffsum-=n;
        int i=0;
       while(diffsum>0)
       {
           if(res[i%n]<=5)
           {
              res[i%n]++;
                    diffsum-=1;
           }
         
           i++;
          


       }
       return res;

        

      

         
        
    }
}