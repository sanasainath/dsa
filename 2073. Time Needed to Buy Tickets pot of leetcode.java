class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets.length;
        boolean x=false;
        int count=0;
        while(!x)
        {

            for(int i=0;i<n;i++)
            {

               if(tickets[k]==0)
               {
                x=true;
                break;
               }
               if(tickets[i]>0)
               { 
                 tickets[i]--;
               count++;

               }
              
            }
        }
        return count;
       
        


       
        
    }
}