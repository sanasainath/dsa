class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum=0;
        for(int i=0;i<grumpy.length;i++)
        {
            if(grumpy[i]==0)
            {
                sum+=customers[i];
                customers[i]=0;
            }
           
                
            
        }
        int maxi=0;
       
        for(int i=0;i<minutes;i++)
        {
            maxi+=customers[i];
        }
         int firstsum=maxi;
        int left=0;
        for(int i=minutes;i<customers.length;i++)
        {
            firstsum=firstsum-customers[left++];
               firstsum=firstsum+customers[i];
           
            
            maxi=Math.max(firstsum,maxi);


        }
        sum+=maxi;
        return sum;



        
    }
}